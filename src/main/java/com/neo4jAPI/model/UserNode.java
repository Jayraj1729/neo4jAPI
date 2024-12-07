package com.neo4jAPI.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node("User")
public class UserNode {

    @Id
    private String userName;

    private String arn;

    public UserNode(String userName, String arn) {
        this.userName = userName;
        this.arn = arn;
    }

    // Getters and Setters
}
