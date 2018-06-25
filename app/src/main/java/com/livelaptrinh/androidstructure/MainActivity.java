package com.livelaptrinh.androidstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.livelaptrinh.androidstructure.model.MultipleResource;

public class MainActivity extends BaseActivity<MainPresenter> implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter();
        presenter.inject(this);
        presenter.getListResource();
    }


    @Override
    public void onGetListResourceSuccess(MultipleResource multipleResource) {
    }

}
