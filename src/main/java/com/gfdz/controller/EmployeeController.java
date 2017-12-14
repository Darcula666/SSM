package com.gfdz.controller;

import com.gfdz.bean.Employee;
import com.gfdz.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class EmployeeController {
    @Autowired
     EmployeeService employeeService;
    @RequestMapping("/emps")
    public String getEmps(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum, Model model) {
        PageHelper.startPage(pageNum,10);
        List<Employee> emps = employeeService.getAll();
        PageInfo pageInfo=new PageInfo(emps,5);
        model.addAttribute("pageInfo", pageInfo);
        return "list";
    }
}
