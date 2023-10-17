package com.example.lab4.Interface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "confirmation-service",url = "https://localhost:8082")
public interface RegistrationServiceClient {

    @PostMapping("/confirm")
    String someDetails();

}
