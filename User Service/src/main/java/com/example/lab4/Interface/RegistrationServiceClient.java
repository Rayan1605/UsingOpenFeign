package com.example.lab4.Interface;

import com.example.lab4.Entity.UserDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "confirmation-service",url = "https://localhost:8082")
public interface RegistrationServiceClient {

    @PostMapping("/confirm")
    String someDetails(@RequestBody UserDetails userDetails);

}
