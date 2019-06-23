package com.catwalk.api.repository;

import java.util.Optional;

//import org.springframework.data.jpa.repository.JpaRepository;
import com.catwalk.api.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}