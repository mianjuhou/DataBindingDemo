package com.fs.mvpdemo.demo.login;

import com.fs.mvpdemo.framework.model.IModel;

/**
 * Created by fangdean on 2016/2/16.
 */
public class LoginBean implements IModel {
    private String name;
    private String age;

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
