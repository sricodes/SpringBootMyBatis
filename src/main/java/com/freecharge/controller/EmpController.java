package com.freecharge.controller;


import com.freecharge.mapper.EmployeeMapper;
import com.freecharge.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class EmpController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/emp")
    public List<Employee> getAllEmp() {
        return employeeMapper.findAll();
    }

    @GetMapping("/emp/{id}")
    public Employee getOneEmp(@PathVariable int id) {
        return employeeMapper.findById(id);
    }

    @PostMapping("/emp")
    public int createEmp(@Valid @RequestBody Employee employee) {
        return employeeMapper.insert(employee);
    }

    @DeleteMapping("/emp/{id}")
    public int removeEmp(@PathVariable int id) {
        return employeeMapper.deleteById(id);
    }

    @PutMapping("/emp/{id}")
    public void updateOneEmp(@PathVariable int id, @RequestBody Employee employee) {
        employee.setId(id);
        employeeMapper.update(employee);
    }


}
