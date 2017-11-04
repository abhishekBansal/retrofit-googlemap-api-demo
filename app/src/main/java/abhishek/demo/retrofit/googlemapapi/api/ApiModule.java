package abhishek.demo.retrofit.googlemapapi.api;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

import abhishek.demo.retrofit.googlemapapi.BuildConfig;
import lombok.Getter;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by abhishek
 * on 05/04/16.
 */
public class ApiModule {

    @Getter
    private ApiService apiService;

    private ApiModule() {
        init();
    }

    private static ApiModule apiModule;

    public static ApiModule getInstance() {
        if(apiModule == null) {
            apiModule = new ApiModule();
        }

        return apiModule;
    }

    private void init() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        // TODO: 08/04/16 might want to remove this in prod
        builder.hostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String str, SSLSession sslSession) {
                return true;
            }
        });

        builder.connectTimeout(30, TimeUnit.SECONDS);
        builder.readTimeout(30, TimeUnit.SECONDS);
        builder.writeTimeout(30, TimeUnit.SECONDS);

        // Add headers
        builder.interceptors().add(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();

                request = request.newBuilder()
                        // // TODO: 08/04/16 add project specific stuff here
                        .addHeader("Authorization", "Basic YWRtaW46ZG90c2xhc2g=")
                        .build();
                return chain.proceed(request);

            }
        });

        // Logging
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.interceptors().add(interceptor);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .setDateFormat("yyyy-MM-dd")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.API_URL)
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        apiService =  retrofit.create(ApiService.class);
    }
}