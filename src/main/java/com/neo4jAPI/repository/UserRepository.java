package com.neo4jAPI.repository;

import com.neo4jAPI.model.UserNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRepository extends Neo4jRepository<UserNode, Long> {
}
