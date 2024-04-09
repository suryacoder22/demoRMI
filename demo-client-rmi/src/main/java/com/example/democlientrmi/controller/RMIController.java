package com.example.democlientrmi.controller;

import com.example.democlientrmi.service.HelloWorldRMI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RMIController {

    @Autowired
    private HelloWorldRMI helloWorldRMI;

    @GetMapping("/invokeRmiService")
    public String invokeRmiService() {
        StringBuilder response = new StringBuilder();
        try {
            response.append(helloWorldRMI.sayHelloRmi("Freeze")).append("\n");
            response.append(helloWorldRMI.getGreetings()).append("\n");
            List<String> strList = Arrays.asList("These", "Are", "Custom", "Data");
            response.append(helloWorldRMI.getCustomData(strList)).append("\n");
        } catch (Exception e) {
            response.append("Error occurred while invoking RMI service: ").append(e.getMessage());
        }
        return response.toString();
    }
}
