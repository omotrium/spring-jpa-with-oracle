package com.trium.demo.Service;

import com.trium.demo.Dao.UserDao;
import com.trium.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;


    public List<User> getAllUsers(){
        return userDao.findAll();
    }


    public User saveUser(User user){
        return userDao.save(user);
    }

    public void delete(Integer id) {
         userDao.deleteById(id);
    }

    public User updateUser(User user) {
        return userDao.save(user);
    }
}

