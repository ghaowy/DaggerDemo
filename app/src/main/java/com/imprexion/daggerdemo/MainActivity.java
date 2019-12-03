package com.imprexion.daggerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.imprexion.daggerdemo.main.SecondActivity;
import com.imprexion.daggerdemo.main.contract.IMainContract;
import com.imprexion.daggerdemo.main.di.component.DaggerMainComponent;
import com.imprexion.daggerdemo.main.di.module.MainModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements IMainContract.IMainView {

    private static final String TAG = "MainActivity";

    @Inject
    IMainContract.IMainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_go).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        DaggerMainComponent
                .builder()
                .mainModule(new MainModule(this))
                .build()
                .inject(this);

        mMainPresenter.doPresenter();
    }

    @Override
    public void doView() {
        Log.d(TAG, " doView -------------------->");
    }
}
