package com.example.employeemanagement.repository.sqlserver;


import com.example.employeemanagement.entity.sqlserver.EmploymentWorkingTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergencyContactsRepository extends JpaRepository<EmploymentWorkingTime, Integer> {
}
