package com.starry_sky.yang.controller;

import com.github.pagehelper.PageInfo;
import com.starry_sky.yang.pojo.Employee;
import com.starry_sky.yang.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 查询所有员工信息-->/employee-->get
 * 根据id查询员工的分页信息-->/employee/page/1-->get
 * 跳转到添加页面-->/to/add-->get
 * 添加员工信息-->/employee-->post
 * 修改员工信息-->/employee-->put
 * 删除员工信息-->/employee/1-->delete
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee/page/{pageNum}",method = RequestMethod.GET)
    public String getEmployeePage(@PathVariable("pageNum") Integer pageNum, Model model){
        //获取分页信息数据
        PageInfo<Employee> pageInfo = employeeService.getEmployeePage(pageNum);
        //将分页数据共享到请求域中
        model.addAttribute("pageInfo",pageInfo);

        return "employee_list_page";
    }
    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        //获取员工信息
        List<Employee> employeeList = employeeService.getAllEmployee();
        //将员工信息在请求域中共享
        model.addAttribute("employeeList",employeeList);
        //跳转到emplyee_list.html
        return "employee_list";
    }
}
