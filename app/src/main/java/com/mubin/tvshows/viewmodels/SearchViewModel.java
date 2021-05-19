package com.mubin.tvshows.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.mubin.tvshows.reposotories.SearchTvShowRepository;
import com.mubin.tvshows.response.TvShowsResponse;

public class SearchViewModel extends ViewModel {

    private SearchTvShowRepository searchTvShowRepository;

    public SearchViewModel() {
        searchTvShowRepository = new SearchTvShowRepository();
    }

    public LiveData<TvShowsResponse> searchTvShow(String query, int page){
        return searchTvShowRepository.searchTvShow(query, page);
    }

}
