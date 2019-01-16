package com.trium.demo.Dao;

import com.trium.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
@Repository
public interface UserDao extends JpaRepository<User, Integer > {


//    Collection<User> getAllUsers();
//
//    User getUserById(int id);
//
//    void removeUserById(int id);
//
//    void updateUser(User user);
//
//    void insertUserToDb(User user);
}
