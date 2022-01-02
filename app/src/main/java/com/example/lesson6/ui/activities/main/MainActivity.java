package com.example.lesson6.ui.activities.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.lesson6.databinding.ActivityMainBinding;
import com.example.lesson6.ui.activities.second.SecondActivity;
import com.example.lesson6.ui.adapter.GameAdapter;
import com.example.lesson6.data.GameClient;
import com.example.lesson6.data.GameModel;
import com.example.lesson6.utils.OnItemClickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    GameAdapter gameAdapter;
    ArrayList<GameModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initilization();
        listeners();
    }

    private void initilization() {
        list = GameClient.getGameList();
        gameAdapter = new GameAdapter(list);
        binding.recyclerView.setAdapter(gameAdapter);

    }

    private void listeners() {
        gameAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void OnItemClick(GameModel gameModel) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("games", gameModel);
                startActivity(intent);

            }
        });
    }
}