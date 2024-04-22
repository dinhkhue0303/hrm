package com.example.employeemanagement.repository.sqlserver;

import com.example.employeemanagement.entity.sqlserver.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Personal, Integer> {
}
