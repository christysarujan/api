package com.catwalk.api.repository;

import java.util.Optional;

//import org.springframework.data.jpa.repository.JpaRepository;
import com.catwalk.api.model.Role;
import com.catwalk.api.model.RoleName;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends MongoRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}