package com.mubin.tvshows.response;

import com.google.gson.annotations.SerializedName;
import com.mubin.tvshows.models.TvShowDetails;

public class TvShowDetailsResponse {

    @SerializedName("tvShow")
    private TvShowDetails tvShowDetails;

    public TvShowDetails getTvShowDetails() {
        return tvShowDetails;
    }
}
