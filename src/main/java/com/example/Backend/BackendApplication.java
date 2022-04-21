package com.example.Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/check")
	public boolean greeting(@RequestParam(value = "name", defaultValue = "World") String name,
							@AuthenticationPrincipal Jwt accessToken) {
		System.out.println("In GET Request");
		String scope = accessToken.getClaims().get("scope").toString();
		Boolean partnerRole = scope.contains("partner");
		System.out.println("Contains sequence 'partner': " + accessToken.getClaims().get("scope").toString());
		System.out.println("Contains sequence 'partner': " + accessToken.getClaims().get("scope").toString().contains("partner"));
		if (partnerRole) {
			return true;
		} else {
			return false;
		}
	}
}
