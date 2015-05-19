package com.iprocoder.coolweather.app.util;

/**
 * Created by iprocoder on 15-5-19.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
