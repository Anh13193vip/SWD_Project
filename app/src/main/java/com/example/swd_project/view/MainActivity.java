package com.example.swd_project.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.swd_project.R;
import com.example.swd_project.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView{

    private TextView btnLogin, btnSignUp;
    private EditText txtUsername, txtPassword;
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenter(this);

        btnLogin = (TextView)findViewById(R.id.btnLogin);
        btnSignUp = (TextView)findViewById(R.id.btnSignUp);
        txtUsername = (EditText)findViewById(R.id.txtUsername);
        txtPassword = (EditText)findViewById(R.id.txtPassword);
    }

    public void clickToLogin(View view) {
        String username = txtUsername.getText().toString();
        String password = txtPassword.getText().toString();
        mainPresenter.checkLogin(username, password);
    }

    public void clickToSignUp(View view) {
    }

    @Override
    public void LoginSuccessed() {

    }

    @Override
    public void LoginFailed() {

    }
}
