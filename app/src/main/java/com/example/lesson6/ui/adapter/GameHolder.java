package com.example.lesson6.ui.adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson6.databinding.ListHolderBinding;
import com.example.lesson6.data.GameModel;

public class GameHolder extends RecyclerView.ViewHolder {
    private final GameAdapter gameAdapter;
    ListHolderBinding binding;

    public GameHolder(GameAdapter gameAdapter, @NonNull ListHolderBinding binding) {
        super(binding.getRoot());
        this.gameAdapter = gameAdapter;
        this.binding = binding;
    }

    public void onBind(GameModel gameModel) {
        binding.tvTitle.setText(gameModel.getLevel());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}