package com.ahmetarabaci.oracleproxy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahmetarabaci.oracleproxy.service.OracleProxyService;

@RestController
public class OracleProxyController {

	private OracleProxyService service;
	
	@Autowired
	public OracleProxyController(OracleProxyService service) {
		this.service = service;
	}
	
	@GetMapping("/proxy")
	public String proxyForOracleService() {
		return service.proxyForOracleService();
	}
	
}
