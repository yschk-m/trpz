package com.example.demo.repository;

import com.example.demo.entity.ServiceInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceInfoRepository extends JpaRepository<ServiceInfo, Integer> {

}