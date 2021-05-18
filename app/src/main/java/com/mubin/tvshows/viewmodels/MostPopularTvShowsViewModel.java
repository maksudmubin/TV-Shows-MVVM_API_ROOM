package com.mubin.tvshows.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.mubin.tvshows.reposotories.MostPopularTvShowsRepository;
import com.mubin.tvshows.response.TvShowsResponse;

public class MostPopularTvShowsViewModel extends ViewModel {

    private MostPopularTvShowsRepository mostPopularTvShowsRepository;

    public MostPopularTvShowsViewModel(){
        mostPopularTvShowsRepository = new MostPopularTvShowsRepository();
    }

    public LiveData<TvShowsResponse> getMostPopularTvShows(int page) {
        return mostPopularTvShowsRepository.getMostPopularTvShows(page);
    }

}
