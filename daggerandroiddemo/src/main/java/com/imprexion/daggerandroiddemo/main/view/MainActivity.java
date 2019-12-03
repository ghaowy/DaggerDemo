package com.imprexion.daggerandroiddemo.main.view;

import android.os.Bundle;
import android.util.Log;

import com.imprexion.daggerandroiddemo.R;
import com.imprexion.daggerandroiddemo.app.BaseActivity;
import com.imprexion.daggerandroiddemo.main.contract.IMainContract;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements IMainContract.IMainView {

    private static final String TAG = "MainActivity";

    @Inject
    IMainContract.IMainPresenter mIMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIMainPresenter.doInPresenter();
    }

    @Override
    public void doInView() {
        Log.d(TAG, "doInView ----------------------------------->");
    }
}
