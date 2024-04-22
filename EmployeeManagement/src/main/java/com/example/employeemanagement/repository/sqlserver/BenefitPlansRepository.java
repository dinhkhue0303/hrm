package com.example.employeemanagement.repository.sqlserver;


import com.example.employeemanagement.entity.sqlserver.BenefitPlans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenefitPlansRepository extends JpaRepository<BenefitPlans, Integer> {
}
