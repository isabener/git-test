package com.aben.domain;

/**
 * @Author leng
 * @Date 2022/3/23 16:41
 * @ClassName User
 * @Decription TOOD
 **/
public class User {
    private String name;
    private String age;

    public User(String age) {
        this.age = age;
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
        System.out.print("Hello");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
