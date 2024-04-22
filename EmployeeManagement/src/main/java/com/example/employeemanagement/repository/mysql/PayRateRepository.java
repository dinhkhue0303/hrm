package com.example.employeemanagement.repository.mysql;

import com.example.employeemanagement.entity.mysql.PayRates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayRateRepository extends JpaRepository<PayRates, Integer> {
//    @Query(value = "SELECT * FROM `pay rates` as p LEFT JOIN  `employee` as e ON p.`idPay Rates` = e.`Pay Rates_idPay Rates`", nativeQuery = true)
//    List<PayRate> fetchAll();
}
