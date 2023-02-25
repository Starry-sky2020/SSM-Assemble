package com.starry_sky.yang.mapper;

import com.github.pagehelper.PageInfo;
import com.starry_sky.yang.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    /**
     * 查询所有员工信息
     */
    List<Employee> getAllEmployee();


}
