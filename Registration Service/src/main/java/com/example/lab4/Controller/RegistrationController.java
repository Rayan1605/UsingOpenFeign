package com.example.lab4.Controller;

import com.example.lab4.Entity.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

@PostMapping("/register")
public String register(@RequestBody UserDetails userDetails){

    return "Hello " + userDetails.getName() + " your registration is successful with the email" + userDetails.getEmail();

}


}
