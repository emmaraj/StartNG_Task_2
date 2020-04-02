package com.example.startngtasktwo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @RequiresApi(api = Build.VERSION_CODES.O)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] likes = {"Writing","Coding","Computer Games","Listening to Music","Catering",
                "Wine Making","Graphic Design","Cooking","Teaching"};

        String[] dislikes = {"Being late”",
                "Needles",
                "Strong scents",
                "Bad customer service",
                "Lazy People",
                "Sneakers",
                "Hospitals",
                "People trying to control me",
                "Invasion of privacy"};

        String[] hobbies = {"Writing",
                "Coding",
                "Computer Games",
                "Listening to Music",
                "Catering",
                "Wine Making",
                "Graphic Design",
                "Cooking",
                "Teaching"};

        TextView likesArrayTextView = findViewById(R.id.likes_array);
        likesArrayTextView.setText(String.join("\n", likes));

        TextView dislikesTextView = findViewById(R.id.dislikes_array);
        dislikesTextView.setText(String.join("\n", dislikes));

        TextView hobbiesTextView = findViewById(R.id.hobbies_array);
        hobbiesTextView.setText(String.join("\n", hobbies));


    }
}
