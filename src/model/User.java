package model;

import java.util.UUID;

public class User {
    public UUID id;
    public String name;
    public String phoneNumber;
    public String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }



    public User(){

    }


    public User(String name,String phoneNumber, String password){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.password=password;

    }

}
