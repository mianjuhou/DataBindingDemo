package com.fs.mvpdemo.demo.login;

import com.fs.mvpdemo.framework.databind.DataBinder;
import com.fs.mvpdemo.framework.model.IModel;
import com.fs.mvpdemo.framework.view.IDelegate;

/**
 * Created by fangdean on 2016/2/16.
 */
public class LoginDataBinder implements DataBinder<LoginDelegate,LoginBean>{
    @Override
    public void viewBindModel(LoginDelegate viewDelegate, LoginBean data) {
        viewDelegate.setName(data.getName());
        viewDelegate.setAge(data.getAge());
    }
}
