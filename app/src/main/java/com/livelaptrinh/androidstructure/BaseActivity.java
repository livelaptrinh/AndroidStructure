package com.livelaptrinh.androidstructure;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Thien on 6/25/2018.
 */
public class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements IView {

    protected P presenter;

    private void clearComposite(){
        if (presenter == null) return;
        if (presenter.mCompositeDisposable == null) return;
        presenter.mCompositeDisposable.clear();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        clearComposite();
    }

    @Override
    public void showError(String msg) {
        Log.d("OKE", "showError: "+msg);
    }

    @Override
    public void showThroable(Throwable throwable) {
        throwable.getLocalizedMessage();
    }

    @Override
    public void showLoadingDialog() {
        Log.d("OKE", "Loading...");
    }

    @Override
    public void hidLoadingDialog() {
        Log.d("OKE", "Stoping...");
    }
}
