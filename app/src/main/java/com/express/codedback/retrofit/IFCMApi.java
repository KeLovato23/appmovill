package com.express.codedback.retrofit;

import com.express.codedback.models.FCMBody;
import com.express.codedback.models.FCMResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMApi {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAFqaVk3A:APA91bERHpz56JaTG3Kkjs2W9Q1J4kScgzliFg1Dvr2ZQdXW66Cf4F90vJrGZHmg4tWydiYgmzS6kUn5oa4MtGHPoe80WsZVTCj6IbvLEEB0UoEqVU2q9H6gIZFfWXoLo4QdotG1hAKt"
    })
    @POST("fcm/send")
    Call<FCMResponse> send(@Body FCMBody body);

}
