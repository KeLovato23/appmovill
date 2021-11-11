package com.express.codedback.providers;

import com.express.codedback.models.FCMBody;
import com.express.codedback.models.FCMResponse;
import com.express.codedback.retrofit.IFCMApi;
import com.express.codedback.retrofit.RetrofitClient;

import retrofit2.Call;

public class NotificationProvider {

    private String url = "https://fcm.googleapis.com";

    public NotificationProvider() {
    }

    public Call<FCMResponse> sendNotification(FCMBody body) {
        return RetrofitClient.getClientObject(url).create(IFCMApi.class).send(body);
    }
}
