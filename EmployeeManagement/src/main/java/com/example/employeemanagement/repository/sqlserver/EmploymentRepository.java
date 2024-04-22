package com.example.employeemanagement.repository.sqlserver;


import com.example.employeemanagement.entity.sqlserver.Employment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploymentRepository extends JpaRepository<Employment, Integer> {
}
