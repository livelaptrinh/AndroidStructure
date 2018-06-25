package com.livelaptrinh.androidstructure;

import com.livelaptrinh.androidstructure.networking.APIClient;
import com.livelaptrinh.androidstructure.networking.APIInterface;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Thien on 6/25/2018.
 */
public abstract class BasePresenter<T extends IView> {
    protected T view;
    protected APIInterface apiInterface;
    protected CompositeDisposable mCompositeDisposable;


    public BasePresenter() {
        apiInterface =  APIClient.getClient().create(APIInterface.class);
        mCompositeDisposable = new CompositeDisposable();
    }

    public void inject(T view){
        this.view = view;//
    }
}
