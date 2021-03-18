package com.example.twisterpm;

import com.example.twisterpm.model.Comment;
import com.example.twisterpm.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface TwisterPMService {
    public final String apiUrl = "https://anbo-restmessages.azurewebsites.net/api/";

    @GET("messages")
    Call<List<Message>> getMessages();

    @GET("messages/{messageId}/comments")
    Call<List<Comment>> getMessageComments(@Path("messageId") int messageId);

    @POST("messages")
    Call<Message> postMessage(@Body Message message);

    @DELETE("messages/{id}")
    Call<Message> deleteMessage(@Path("id") int id);
}
