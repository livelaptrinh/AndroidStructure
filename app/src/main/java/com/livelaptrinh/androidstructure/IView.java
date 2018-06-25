package com.livelaptrinh.androidstructure;

/**
 * Created by Thien on 6/25/2018.
 */
public interface IView {
    void showError(String msg);
    void showThroable(Throwable throwable);
    void showLoadingDialog();
    void hidLoadingDialog();
}
