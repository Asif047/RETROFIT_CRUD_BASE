package com.delaroystudios.retrofitcrud.helper;

/**
 * Created by delaroystudios on 10/5/2016.
 */
import com.google.gson.JsonElement;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;

public class AppConfig {

    public interface insert {
        @FormUrlEncoded
        @POST("/details/insertData.php")
        void insertData(
                @Field("name") String name,
                @Field("age") String age,
                @Field("mobile") String mobile,
                @Field("email") String email,
                @Field("image") String image,
                Callback<Response> callback);
    }

    public interface read {
        @GET("/details/displayAll.php")
        void readData(Callback<JsonElement> callback);
    }

    public interface delete {
        @FormUrlEncoded
        @POST("/details/deleteData.php")
        void deleteData(
                @Field("id") String id,
                Callback<Response> callback);
    }

    public interface update {
        @FormUrlEncoded
        @POST("/details/updateData.php")
        void updateData(
                @Field("id") String id,
                @Field("name") String name,
                @Field("age") String age,
                @Field("mobile") String mobile,
                @Field("email") String email,
                @Field("image") String image,
                Callback<Response> callback);
    }

}
