package com.example.lesson6.ui.activities.second;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.lesson6.data.GameModel;
import com.example.lesson6.databinding.ActivitySecondBinding;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;
    GameModel gameModel;
    ArrayList<GameModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getData();
        listener();
        listener2();
        listener3();
        listener4();
    }


    private void getData() {
        Intent intent = getIntent();
        gameModel = (GameModel) intent.getSerializableExtra("games");
        binding.tvText.setText(gameModel.getQuiz());
        binding.btnImageOne.setText(gameModel.getAnswerOne());
        binding.btnImageTwo.setText(gameModel.getAnswerTwo());
        binding.btnImageThree.setText(gameModel.getAnswerTree());
        binding.btnImageFour.setText(gameModel.getAnswerFour());
    }

    private void listener() {
        binding.btnImageOne.setOnClickListener(v -> {
            if (gameModel.getAnswerOne().equals(gameModel.getAnswerAnswer())) {
                Toast.makeText(SecondActivity.this, "    \uD83D\uDC4D", Toast.LENGTH_SHORT).show();

                Log.e("anime", "show");
            } else {
                Toast.makeText(SecondActivity.this, "    \uD83D\uDC4E", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void listener2() {
        binding.btnImageTwo.setOnClickListener(v -> {
            if (gameModel.getAnswerTwo().equals(gameModel.getAnswerAnswer())) {
                Toast.makeText(SecondActivity.this, "    \uD83D\uDC4D", Toast.LENGTH_SHORT).show();

                Log.e("anime", "show");
            } else {
                Toast.makeText(SecondActivity.this, "    \uD83D\uDC4E", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void listener3() {
        binding.btnImageThree.setOnClickListener(v -> {
            if (gameModel.getAnswerTree().equals(gameModel.getAnswerAnswer())) {
                Toast.makeText(SecondActivity.this, "    \uD83D\uDC4D", Toast.LENGTH_SHORT).show();

                Log.e("anime", "show");
            } else {
                Toast.makeText(SecondActivity.this, "    \uD83D\uDC4E", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void listener4() {
        binding.btnImageFour.setOnClickListener(v -> {
            if (gameModel.getAnswerFour().equals(gameModel.getAnswerAnswer())) {
                Toast.makeText(SecondActivity.this, "    \uD83D\uDC4D", Toast.LENGTH_SHORT).show();

                Log.e("anime", "show");
            } else {
                Toast.makeText(SecondActivity.this, "    \uD83D\uDC4E", Toast.LENGTH_SHORT).show();
            }
        });
    }
}