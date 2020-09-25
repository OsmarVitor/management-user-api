package com.user.managementuserapi.repository;

import com.user.managementuserapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    @Query("SELECT FROM User WHERE email = ?1 AND password = ?2")
    public Optional<User> login(String email, String password);

}
