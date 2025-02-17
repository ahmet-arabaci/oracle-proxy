package com.ahmetarabaci.oracleproxy.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class OracleProxyService {

	private final WebClient client;
	
	public OracleProxyService(WebClient.Builder builder) {
		this.client = builder.baseUrl("http://localhost:8082").build();
	}
	
	public String proxyForOracleService() {
		this.client.get().uri("/exec").retrieve().bodyToMono(String.class).block();
		return "OK";
	}
	
}
