package com.example.swd_project.presenter;

import com.example.swd_project.listener.UserListener;
import com.example.swd_project.model.entity.user.UserCall;
import com.example.swd_project.view.MainView;

public class MainPresenter implements UserListener {
    private UserCall userCall;
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.userCall = new UserCall(this);
        this.mainView = mainView;
    }

    public void checkLogin(String username, String password){
        userCall.login(username, password);
    }
    @Override
    public void onCheckLoginSuccess(Boolean result) {
        if(result){
            mainView.LoginSuccessed();
        } else{
            mainView.LoginFailed();
        }
    }

    @Override
    public void onCheckLoginFailure(String message) {
        //do somrthing
    }
}
