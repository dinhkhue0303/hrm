package com.example.employeemanagement.service.mysql;


import com.example.employeemanagement.dto.PersonalDto;
import com.example.employeemanagement.entity.sqlserver.Personal;

public interface IPersonalService {
    Personal savePersonal(PersonalDto request);
    void deletePersonal(int personalId);
    Personal updatePersonal(int id, PersonalDto request);
}
