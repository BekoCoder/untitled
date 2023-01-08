package service;

import model.User;

public class Userservice {
    public User[] userList;
    public  int index=0;
    public void UserService(int size){
        this.userList=new User[size];
    }
    public boolean addUser(User user){
        for(User u: userList){
            if(u.phoneNumber.equals(user.phoneNumber)){
                return false;
            }
        }
        userList[index++]=user;
        return true;
    }


    public boolean login(String phoneNumber, String password){
        for(User user : userList){
            if(user.phoneNumber.equals(phoneNumber) && user.password.equals(password)){
                return true;
            }
        }
        return false;
    }



}
