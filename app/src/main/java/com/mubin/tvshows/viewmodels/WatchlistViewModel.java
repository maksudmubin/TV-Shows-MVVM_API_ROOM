package com.mubin.tvshows.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.lifecycle.AndroidViewModel;

import com.mubin.tvshows.database.TvShowsDatabase;
import com.mubin.tvshows.models.TVShow;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;

public class WatchlistViewModel extends AndroidViewModel {

    private TvShowsDatabase tvShowsDatabase;

    public WatchlistViewModel(@NonNull Application application){
        super(application);
        tvShowsDatabase = TvShowsDatabase.getTvShowsDatabase(application);
    }

    public Flowable<List<TVShow>> loadWatchlist() {
        return tvShowsDatabase.tvShowDao().getWatchList();
    }

    public Completable removeTvShowFromWatchlist(TVShow tvShow) {
        return tvShowsDatabase.tvShowDao().removeFromWatchlist(tvShow);
    }

}
