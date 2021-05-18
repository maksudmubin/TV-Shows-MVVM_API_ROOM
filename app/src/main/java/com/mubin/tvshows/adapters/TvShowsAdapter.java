package com.mubin.tvshows.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.mubin.tvshows.R;
import com.mubin.tvshows.databinding.ItemContainerTvShowBinding;
import com.mubin.tvshows.listeners.TvShowsListener;
import com.mubin.tvshows.models.TVShow;

import java.util.List;


public class TvShowsAdapter extends RecyclerView.Adapter<TvShowsAdapter.TvShowViewHolder>{

    private List<TVShow> tvShows;
    private LayoutInflater layoutInflater;
    private TvShowsListener tvShowsListener;

    public TvShowsAdapter(List<TVShow> tvShows, TvShowsListener tvShowsListener) {
        this.tvShows = tvShows;
        this.tvShowsListener = tvShowsListener;
    }

    @NonNull
    @Override
    public TvShowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (layoutInflater==null){
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        ItemContainerTvShowBinding tvShowBinding = DataBindingUtil.inflate(
                layoutInflater, R.layout.item_container_tv_show, parent, false
        );
        return new TvShowViewHolder(tvShowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull TvShowViewHolder holder, int position) {

        holder.bindTvShow(tvShows.get(position));

    }

    @Override
    public int getItemCount() {
        return tvShows.size();
    }

    class TvShowViewHolder extends RecyclerView.ViewHolder{

        private ItemContainerTvShowBinding itemContainerTvShowBinding;

        public TvShowViewHolder(ItemContainerTvShowBinding itemContainerTvShowBinding){
            super(itemContainerTvShowBinding.getRoot());
            this.itemContainerTvShowBinding = itemContainerTvShowBinding;
        }

        public void bindTvShow(TVShow tvShow){
            itemContainerTvShowBinding.setTvShow(tvShow);
            itemContainerTvShowBinding.executePendingBindings();
            itemContainerTvShowBinding.getRoot().setOnClickListener(v -> tvShowsListener.onTvShowClicked(tvShow));
        }

    }

}
