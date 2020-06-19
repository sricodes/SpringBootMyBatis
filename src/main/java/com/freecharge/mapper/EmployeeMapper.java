package com.freecharge.mapper;

import com.freecharge.model.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employees")
    List<Employee> findAll();

    @Select("SELECT * FROM employees WHERE id = #{id}")
    Employee findById(long id);

    @Delete("DELETE FROM employees WHERE id = #{id}")
    int deleteById(long id);

    @Insert("INSERT INTO employees( name,gender,salary,email_address) " +
            " VALUES (#{name}, #{gender},#{salary}, #{email_address})")
    int insert(Employee employee);

    int update(Employee employee);
}
