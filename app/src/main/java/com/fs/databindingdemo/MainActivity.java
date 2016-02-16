package com.fs.databindingdemo;

import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.fs.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IDelegate viewDelegate=null;
        viewDelegate.create(getLayoutInflater(),null,savedInstanceState);//R.layout.activity_main
        user = new User("FNAME","LNAME");



        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               user.setFname("fang");
            }
        });
    }
}
