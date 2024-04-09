package com.example.demoRMI.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class HelloWorldRMIimpl implements HelloWorldRMI {
 
  @Override
  public String sayHelloRmi(String msg) {
    System.out.println("================Server Side ========================");
    System.out.println("Inside Rmi IMPL - Incoming msg : " + msg);
    return "Hello " + msg + " :: Response time - > " + new Date();
  }
  @Override
  public List<String> getGreetings(){
	  return Arrays.asList("Hi","Hello","Welcome!!");
  }
  
  @Override
  public List<String> getCustomData(List<String> customeData){
	  System.out.println("Custome Data From Client Side: "+customeData);
	  return customeData;
  }
}
