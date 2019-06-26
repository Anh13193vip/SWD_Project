package com.example.swd_project.model.connection;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UserRequestInterface {
    @POST("User")
        //type 1
    Call<ResponseBody> checkLogin(@Query("username") String userName,
                              @Query("password") String password);
//    //type 2
//    Call<EmployeeResponse> getAll();
}
