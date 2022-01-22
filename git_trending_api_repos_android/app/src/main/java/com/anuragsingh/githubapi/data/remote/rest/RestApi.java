package com.anuragsingh.githubapi.data.remote.rest;

import java.util.Map;

import com.anuragsingh.githubapi.data.model.RepoModel;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface RestApi {

    @GET("/search/repositories")
    Observable<RepoModel> getRepos(@QueryMap Map<String, String> filter);
}
