package com.example.demo.mysqlclass.model;

public class User {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return password;
    }

    public void setUserpassword(String userpassword) {
        this.password = userpassword;
    }

    // public int getAge() {
    //     return age;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }

    // public String getSex() {
    //     return sex;
    // }

    // public void setSex(String sex) {
    //     this.sex = sex;
    // }

    public String username;
    public String password;
    public  int mobile;
    public  String role;
}
