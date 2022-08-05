package com.example.springwebservice.service;

import com.example.springwebservice.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> userList;
    public List<User> getAllUsers() {
        return this.userList;
    }

    public UserService() {
        this.userList = new ArrayList<>();
        this.userList.add(new User(1, "Bill", 23));
        this.userList.add(new User(2, "KZ", 23));
        this.userList.add(new User(3, "Brain", 23));
    }


    public User createUser(User user) {
        this.userList.add(user);
        return user;

    }

    public User getUser(int id) {
        for (User user:this.userList){
            if (id==user.getId()){
                return  user;
            }
        }
        return null;
    }

    public User updateUser(int id, User user) {
        for(User updateUser:this.userList
        ){
            if(id==updateUser.getId()){
                updateUser.setAge(user.getAge());
                updateUser.setName(user.getName());
                return updateUser;
            }
        }
        return null;
    }

    public User deleteUser(int id) {
        for(User deleteUser:this.userList){
            if(id==deleteUser.getId()){
                this.userList.remove(deleteUser);
                return  deleteUser;
            }
        }
        return null;
    }

} // Class end
