package com.example.demo.Controller;

    import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String firstPage() {
        return "Hello World";
    }
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping("/hello-admin")
    public String adminPage() {
        return "Hello Admin";
    }
}
