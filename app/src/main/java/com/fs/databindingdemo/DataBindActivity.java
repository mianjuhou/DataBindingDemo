package com.fs.databindingdemo;

/**
 * Created by fangdean on 2016/2/15.
 */
public abstract class DataBindActivity<T extends IDelegate> extends ActivityPresenter<T>{
    protected  DataBinder binder;
    public abstract DataBinder getDataBinder();
    public <D extends IModel> void notifyModelChanged(D data){
    }
}
