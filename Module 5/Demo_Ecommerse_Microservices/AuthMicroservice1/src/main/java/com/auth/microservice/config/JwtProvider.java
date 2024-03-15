package com.auth.microservice.config;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtProvider {
	SecretKey key = Keys.hmacShaKeyFor(JwtContant.SECRET_KEY.getBytes());

	public String generateToken(Authentication authentication) {
		String jwt = Jwts.builder()
				.setIssuedAt(new Date())
				.setExpiration(new Date(new Date().getTime()+846000000))
				.claim("email", authentication.getName()).signWith(key).compact();

		return jwt;
	}

	public String getEmailFromToken(String jwt) {
		jwt = jwt.substring(7);
		Claims claims = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(jwt).getBody();
		String email1 = String.valueOf(claims.get("email"));
		return email1;

	}
}
