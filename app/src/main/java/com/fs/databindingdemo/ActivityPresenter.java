package com.fs.databindingdemo;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by fangdean on 2016/2/15.
 */
public abstract class ActivityPresenter<T extends IDelegate> extends Activity {
    protected T viewDelegate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            viewDelegate=getDelegateClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    protected abstract Class<T> getDelegateClass();
}
