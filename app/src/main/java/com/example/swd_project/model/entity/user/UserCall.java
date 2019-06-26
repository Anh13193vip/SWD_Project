package com.example.swd_project.model.entity.user;

import android.util.Log;

import com.example.swd_project.listener.UserListener;
import com.example.swd_project.model.connection.MyRetrofit;
import com.example.swd_project.model.connection.UserRequestInterface;
import com.google.gson.Gson;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserCall {
    //Class call api
    UserListener listener;
    public UserCall(UserListener listener) {
        this.listener = listener;
    }

    public void login(String username, String password){
        final UserRequestInterface APIservice = MyRetrofit.getClient().create(UserRequestInterface.class);
        Call<ResponseBody> getProduct = APIservice.checkLogin(username, password);
        getProduct.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    boolean result = false;
                    if (response.body().string().contains("true")) {
                        result = true;
                    }

                    listener.onCheckLoginSuccess(result);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.e("Error: ", t.toString());
            }
        });
    }
}
