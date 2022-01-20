package com.example.demo.repository;

import com.example.demo.entity.AuthorizedUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorizedUserRepository extends JpaRepository<AuthorizedUser, Integer> {

}