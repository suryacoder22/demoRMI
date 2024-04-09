package com.example.democlientrmi;

import java.util.Arrays;
import java.util.List;

import com.example.democlientrmi.service.HelloWorldRMI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.*;
@SpringBootApplication
public class DemoClientRmiApplication {
	@Bean
	RmiProxyFactoryBean rmiProxy() throws Exception {
		RmiProxyFactoryBean bean = new RmiProxyFactoryBean();
		bean.setServiceInterface(HelloWorldRMI.class);
		bean.setServiceUrl("rmi://localhost:1099/helloworldrmi");
		bean.afterPropertiesSet(); // Initialize RmiProxyFactoryBean
		return bean;
	}
	public static void main(String[] args) {
//		HelloWorldRMI helloWorldRMI = SpringApplication.run(DemoClientRmiApplication.class, args)
//				.getBean(HelloWorldRMI.class);
//
//		System.out.println("================Client Side ========================");
//
//		try {
//			System.out.println(helloWorldRMI.sayHelloRmi("Freeze"));
//			System.out.println(helloWorldRMI.getGreetings());
//			List<String> strList = Arrays.asList("These","Are","Custom","Data");
//			System.out.println(helloWorldRMI.getCustomData(strList));
//		} catch (Exception e) {
//			System.err.println("Error occurred while invoking RMI service: " + e.getMessage());
//		}
		SpringApplication.run(DemoClientRmiApplication.class, args);
	}

}
