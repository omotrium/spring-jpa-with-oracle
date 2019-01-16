package com.trium.demo.Dao;

import com.trium.demo.Entity.Department;
import com.trium.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer > {

}



