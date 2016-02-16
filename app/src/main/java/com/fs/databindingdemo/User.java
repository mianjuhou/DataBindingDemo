package com.fs.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by fangdean on 2016/2/15.
 */
public class User extends BaseObservable{
    private String fname;
    private String lname;

    public User(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
    @Bindable
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
        notifyPropertyChanged(com.fs.databindingdemo.BR.fname);
    }
    @Bindable
    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
        notifyPropertyChanged(com.fs.databindingdemo.BR.lname);
    }
}
