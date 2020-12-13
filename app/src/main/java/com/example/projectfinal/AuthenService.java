package com.example.projectfinal;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthenService {
    @POST("authenticate")
    Call<BaseResponse> authenticate(@Body LoginRequest loginRequest);
}
