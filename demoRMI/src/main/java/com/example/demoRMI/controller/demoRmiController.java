package com.example.demoRMI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoRMI.service.HelloWorldRMI;

@RestController
@RequestMapping("/api")
public class demoRmiController {
	
	@Autowired
	HelloWorldRMI helloWorldRMI;
	
	@GetMapping("/getGreetings")
	public ResponseEntity<List<String>> getGreetings(){
		return ResponseEntity.ok(helloWorldRMI.getGreetings());
	}
	@GetMapping("/getCustomData")
	public ResponseEntity<List<String>> getCustomData(List<String> customData){
		return ResponseEntity.ok(helloWorldRMI.getCustomData(customData));
	}
		
	
}
