package com.seed.swagger.security.adm.gvinci;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public String testAPI() {
        return "Test API for Swagger Open API secured by Spring Security !!";
    }
}
