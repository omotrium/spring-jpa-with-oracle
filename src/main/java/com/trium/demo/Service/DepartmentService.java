package com.trium.demo.Service;


import com.trium.demo.Dao.DepartmentDao;
import com.trium.demo.Dao.UserDao;
import com.trium.demo.Entity.Department;
import com.trium.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;


    public List<Department> getAllDepartments(){
        return departmentDao.findAll();
    }


    public Department saveDepartment(Department department){
        return departmentDao.save(department);
    }

    public void delete(Integer id) {
        departmentDao.deleteById(id);
    }

    public Department updateDepartment(Department department) {
        return departmentDao.save(department);
    }
}
