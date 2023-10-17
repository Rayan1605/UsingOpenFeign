package com.example.lab4.Interface;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "confirmation-service",url = "https://localhost:8082")
public interface RegistrationServiceClient {
}
