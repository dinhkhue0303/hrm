package com.example.employeemanagement.repository.mysql;


import com.example.employeemanagement.entity.mysql.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//    @Query("SELECT e FROM employee e JOIN FETCH e.idEmployee")
//    List<Employee> fetchAll();
}
