package com.mubin.tvshows.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.mubin.tvshows.database.TvShowsDatabase;
import com.mubin.tvshows.models.TVShow;
import com.mubin.tvshows.reposotories.TvShowDetailsRepository;
import com.mubin.tvshows.response.TvShowDetailsResponse;

import io.reactivex.Completable;
import io.reactivex.Flowable;

public class TvShowDetailsViewModel extends AndroidViewModel {

    private TvShowDetailsRepository tvShowDetailsRepository;
    private TvShowsDatabase tvShowsDatabase;

    public TvShowDetailsViewModel(@NonNull Application application) {
        super(application);
        tvShowDetailsRepository = new TvShowDetailsRepository();
        tvShowsDatabase = TvShowsDatabase.getTvShowsDatabase(application);
    }

    public LiveData<TvShowDetailsResponse> getTvShowDetails(String tvShowId) {
        return tvShowDetailsRepository.getTvShowDetails(tvShowId);
    }

    public Completable addToWatchlist(TVShow tvShow){
        return tvShowsDatabase.tvShowDao().addToWatchlist(tvShow);
    }

    public Flowable<TVShow> getTvShowFromWatchlist(String tvShowId){
        return tvShowsDatabase.tvShowDao().getTvShowFromWatchlist(tvShowId);
    }

    public Completable removeTvShowFromWatchlist(TVShow tvShow){
        return tvShowsDatabase.tvShowDao().removeFromWatchlist(tvShow);
    }

}
