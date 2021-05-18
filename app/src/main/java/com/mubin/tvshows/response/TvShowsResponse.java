package com.mubin.tvshows.response;

import com.google.gson.annotations.SerializedName;
import com.mubin.tvshows.models.TVShow;

import java.util.List;

public class TvShowsResponse {

    @SerializedName("page")
    private int page;

    @SerializedName("pages")
    private int TotalPages;

    @SerializedName("tv_shows")
    private List<TVShow> tvShows;

    public int getPage() {
        return page;
    }

    public int getTotalPages() {
        return TotalPages;
    }

    public List<TVShow> getTvShows() {
        return tvShows;
    }
}
