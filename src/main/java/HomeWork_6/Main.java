package HomeWork_6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host("api.weather.yandex.ru")
                .addPathSegment("v2")
                .addPathSegment("forecast")
                .addQueryParameter("lat", "59.57")
                .addQueryParameter("lon","30.19")
                .addQueryParameter("lang", "ru_RU")
                .addQueryParameter("limit", "5")
                .addQueryParameter("hours", "false")
                .addQueryParameter("extra", "false")
                .build();

        Request request = new Request.Builder()
                .url("https://api.weather.yandex.ru/v2/forecast?lat=55.75396&lon=37.620393&extra=true")
                .url(url)
                .addHeader("X-Yandex-API-Key", "5d2c0be3-1038-41fa-9a94-bacd276a84f7")
                .get()
                .addHeader("accept", "application/json")
                .build();
        Response response = okHttpClient.newCall(request).execute();
        System.out.println(Objects.requireNonNull(response.body()).string());


    }
}
