package com.journals.iomcworld.network;

import android.content.Context;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {
   public static String IMAGE_HOME_URL ="https://www.hilarispublisher.com/assets/img/subjects/";

   private static Retrofit retrofit = null;




  /*  private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://www.longdom.org/admin/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();*/


   /* public static Retrofit getRetrofitClient(Context mContext) {
        if (retrofit == null) {

            OkHttpClient.Builder oktHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(new NetworkConnectionInterceptor(mContext));
            // Adding NetworkConnectionInterceptor with okHttpClientBuilder.

           // oktHttpClient.addInterceptor(logging);

            retrofit = new Retrofit.Builder()
                    .baseUrl("https://www.longdom.org/admin/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(oktHttpClient.build())
                    .build();

        }
        return retrofit;
    }*/

    public static <S> S createService(Class<S> serviceClass,Context context) {
        if (retrofit == null) {

            OkHttpClient.Builder oktHttpClient = new OkHttpClient.Builder()
                    .addInterceptor(new NetworkConnectionInterceptor(context));
            // Adding NetworkConnectionInterceptor with okHttpClientBuilder.

            retrofit = new Retrofit.Builder()
                    .baseUrl("https://www.hilarispublisher.com/admin/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(oktHttpClient.build())
                    .build();

        }
        return retrofit.create(serviceClass);
    }
}
