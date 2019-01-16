package com.trium.demo.Controller;

import com.trium.demo.Entity.User;
import com.trium.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") Integer id) {
         userService.delete(id);


        }
//    @RequestMapping( method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
//
//    public void updateUserById(@RequestBody User user){
//        userService.updateUser(user);
//    }
//
       @RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
       public User updateUser(@RequestBody User user) {
       return userService.updateUser(user);
}



}


