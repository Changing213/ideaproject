package com.itheima.domain;

public class Student {
    //四个属性全部要私有化  为何？
    private String sid;//学号
    private String name;
    private int age;
    private String birth;
    //接下来是空参有参构造

    public Student() {
    }

    public Student(String sid, String name, int age, String birth) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}

