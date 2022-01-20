package com.example.demo.repository;

import com.example.demo.entity.STO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface STORepository extends JpaRepository<STO, Integer> {
}