package com.livelaptrinh.androidstructure;

import android.util.Log;

import com.livelaptrinh.androidstructure.model.MultipleResource;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Thien on 6/25/2018.
 */
public class MainPresenter extends BasePresenter<MainView> {

    public MainPresenter() {
    }

    public void getListResource(){
        view.showLoadingDialog();
        Disposable disposable = apiInterface.doGetListResources()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::handleResponse, this::handleError, this::handleSuccess);
        mCompositeDisposable.add(disposable);
    }

    private void handleResponse(MultipleResource multipleResource) {
        Log.d("OKE", "onResponse: "+multipleResource.data.size());
    }

    private void handleError(Throwable error) {
        view.showThroable(error);
    }

    private void handleSuccess() {
        view.hidLoadingDialog();
    }
}
