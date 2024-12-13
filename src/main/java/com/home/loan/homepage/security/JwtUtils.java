package com.home.loan.homepage.security;

import java.security.Key;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class JwtUtils {

	@Value("${spring.app.jwtSecret}")
	private String jwtSecret;

	@Value("${spring.app.jwtExpirationMs}")
	private int jwtExpirationMs;

	public String getJwtFromHeader(HttpServletRequest httpServletRequest) {
		String jwtToken = null;
		jwtToken = httpServletRequest.getHeader("Authorization");
		if (jwtToken != null && jwtToken.startsWith("Bearer ")) {
			return jwtToken.substring(7);
		}
		return jwtToken;
	}

	public String generateTokenFromUsername(UserDetails userDetails) {
		return Jwts.builder().setSubject(userDetails.getUsername()).setIssuedAt(new Date())
				.setExpiration(new Date(new Date().getTime() + jwtExpirationMs)).signWith(key()).compact();

	}

	public String getUsernameFromToken(String token) {
		return Jwts.parserBuilder().setSigningKey((SecretKey) key()).build().parseClaimsJwt(token).getBody()
				.getSubject();
		
	}

	public boolean validateJwtToken(String authToken) {
		Jwts.parserBuilder().setSigningKey((SecretKey) key()).build().parseClaimsJwt(authToken);
		return true;
	}

	private Key key() {
		return Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret));
	}

}
