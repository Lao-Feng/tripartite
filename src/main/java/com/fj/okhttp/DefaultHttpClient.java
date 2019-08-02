package com.fj.okhttp;

import lombok.experimental.UtilityClass;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * HttpClient
 *
 * @author FengJie
 */
@UtilityClass
public class DefaultHttpClient {

    private static OkHttpClient client = new OkHttpClient();

    public static Call newCall(Request req) {
        return client.newCall(req);
    }
}
