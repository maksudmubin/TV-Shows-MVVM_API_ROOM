package com.mubin.tvshows.listeners;

import com.mubin.tvshows.models.TVShow;

public interface WatchlistListener {

    void onTvShowClicked(TVShow tvShow);

    void removeFromWatchlist(TVShow tvShow, int position);

}
