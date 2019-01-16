package com.trium.demo.Controller;


import com.trium.demo.Entity.Department;

import com.trium.demo.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {


    @Autowired
    private DepartmentService departmentService;


    @RequestMapping(value = "/saveDepartment", method = RequestMethod.POST)
    public Department addDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartments();
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteDepartment(@PathVariable("id") Integer id) {
        departmentService.delete(id);


    }

    @RequestMapping(value = "/updateDepartment", method = RequestMethod.PUT)
    public Department updateUser(@RequestBody Department department) {
        return departmentService.updateDepartment(department);
    }



}


