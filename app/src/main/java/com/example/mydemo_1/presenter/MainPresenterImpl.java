package com.example.mydemo_1.presenter;

import android.content.Intent;

import com.example.mydemo_1.model.IMainModel;
import com.example.mydemo_1.model.MainModelImpl;
import com.example.mydemo_1.view.IMainView;


public class MainPresenterImpl implements IMainPresenter {

    private IMainModel mainModel;
    private IMainView mainView;

    public MainPresenterImpl(IMainView mainView) {
        this.mainView = mainView;
        mainModel = new MainModelImpl(this);
    }

    @Override
    public void login(String name, String password) {
        mainModel.getLoginData();
    }

    @Override
    public void loginResult(String result) {
        mainView.getLoginData(result);
    }




}
