package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText editText ;
    ImageView imageView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = "https://scontent.fdac14-1.fna.fbcdn.net/v/t1.0-9/109684216_1647092855456143_4487015940740706848_o.jpg?_nc_cat=109&ccb=2&_nc_sid=09cbfe&_nc_ohc=G4ha7Qd3-TAAX9RivzX&_nc_ht=scontent.fdac14-1.fna&oh=6496bbf3792a3fa69d13c1a20ba3c727&oe=603AB050";

        editText = findViewById(R.id.editText);;
        TextView textView = findViewById(R.id.text);
        imageView = findViewById(R.id.image);;

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImage(editText.getText().toString());
            }
        });
    }
    private void showImage(String url) {
        Glide.with(getApplicationContext())
                .load(url)
                .into(imageView);
    }

}