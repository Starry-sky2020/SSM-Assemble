package com.starry_sky.yang.service;

import com.github.pagehelper.PageInfo;
import com.starry_sky.yang.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    /**
     * 查询所有员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 查询员工信息分页
     */

    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
