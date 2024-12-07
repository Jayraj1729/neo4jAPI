package com.neo4jAPI.controller;

import com.neo4jAPI.service.AwsIdentityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import software.amazon.awssdk.services.iam.model.User;

import java.util.List;

@RestController
public class AwsController {

    private final AwsIdentityService awsIdentityService;

    public AwsController(AwsIdentityService awsIdentityService) {
        this.awsIdentityService = awsIdentityService;
    }

    @GetMapping("/aws/users")
    public List<User> getAwsUsers() {
        return awsIdentityService.fetchUsers();
    }
}
