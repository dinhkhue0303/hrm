package com.example.employeemanagement.repository.sqlserver;

import com.example.employeemanagement.entity.sqlserver.JobHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobHistoryRepository extends JpaRepository<JobHistory, Integer> {
}
