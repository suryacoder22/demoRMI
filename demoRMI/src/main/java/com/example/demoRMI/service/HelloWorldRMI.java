package com.example.demoRMI.service;

import java.util.List;

public interface HelloWorldRMI 
{
  public String sayHelloRmi(String msg);
  public List<String> getGreetings();
  public List<String> getCustomData(List<String> customeData);
}