package com.fs.databindingdemo;

import org.mozilla.universalchardet.prober.sequence.Ibm855Model;

/**
 * Created by fangdean on 2016/2/15.
 */
public interface DataBinder<T extends IDelegate,D extends IModel> {
    void viewBindModel(T viewDelegate,D data);
    void modelBindView(T viewDelegate,D data);
}
