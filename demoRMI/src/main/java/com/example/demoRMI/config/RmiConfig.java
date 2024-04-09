package com.example.demoRMI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

import com.example.demoRMI.service.HelloWorldRMI;
import com.example.demoRMI.service.HelloWorldRMIimpl;


@Configuration
public class RmiConfig {

	 @Bean
	  RemoteExporter registerRMIExporter() {
	    RmiServiceExporter exporter = new RmiServiceExporter();
	    exporter.setServiceName("helloworldrmi");
	    exporter.setServiceInterface(HelloWorldRMI.class);
	    exporter.setService(new HelloWorldRMIimpl());
	     
	    return exporter;
	  }
}