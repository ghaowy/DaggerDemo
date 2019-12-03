package com.imprexion.daggerdemo.main;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.imprexion.daggerdemo.main.contract.IMainContract;
import com.imprexion.daggerdemo.main.di.component.DaggerMainComponent;
import com.imprexion.daggerdemo.main.di.module.MainModule;

import javax.inject.Inject;

/**
 * @author : yan
 * @date : 2019/11/30 17:34
 * @desc : TODO
 */
public class SecondActivity extends AppCompatActivity {

    @Inject
    IMainContract.IMainModel mMainModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        DaggerMainComponent
                .builder()
                .mainModule(new MainModule())
                .build()
                .inject(this);

        mMainModel.doModel();
    }
}
