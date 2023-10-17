package com.example.lab4.Controller;

import com.example.lab4.Interface.RegistrationServiceClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
public class UserController {

private RegistrationServiceClient registrationServiceClient;


@PostMapping("/confirm-and-register")
    public Map<String,String> confirmAndRegister(){

    }

}
