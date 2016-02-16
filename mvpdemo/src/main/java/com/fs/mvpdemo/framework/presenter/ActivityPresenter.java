package com.fs.mvpdemo.framework.presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.fs.mvpdemo.framework.view.IDelegate;

/**
 * Created by fangdean on 2016/2/16.
 */
public abstract class ActivityPresenter <T extends IDelegate> extends AppCompatActivity {
    protected T viewDelegate;
    public ActivityPresenter(){
        try {
            viewDelegate=getDelegateClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    public abstract Class<T> getDelegateClass();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDelegate.create(getLayoutInflater(),null,savedInstanceState);
        setContentView(viewDelegate.getRootView());
        viewDelegate.initWidget();
        bindEventListener();
    }
    protected void bindEventListener(){
    }
}
