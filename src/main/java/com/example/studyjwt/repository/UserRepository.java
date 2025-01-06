package com.example.studyjwt.repository;

import com.example.studyjwt.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    public Boolean existsByUsername(String username);
}
