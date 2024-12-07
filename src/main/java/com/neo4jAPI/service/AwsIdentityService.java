package com.neo4jAPI.service;

import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.iam.IamClient;
import software.amazon.awssdk.services.iam.model.ListUsersRequest;
import software.amazon.awssdk.services.iam.model.ListUsersResponse;
import software.amazon.awssdk.services.iam.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AwsIdentityService {

    private final IamClient iamClient;

    public AwsIdentityService() {
        this.iamClient = IamClient.builder()
                .region(Region.US_EAST_2) // Replace with your region
                .credentialsProvider(ProfileCredentialsProvider.create())
                .build();
    }

    public List<User> fetchUsers() {
        ListUsersRequest request = ListUsersRequest.builder().build();
        ListUsersResponse response = iamClient.listUsers(request);
        return response.users();
    }
}

