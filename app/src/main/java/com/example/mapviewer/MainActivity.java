package com.example.mapviewer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(View->{
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:47.4925,19.0513"));
            Intent chooser=Intent.createChooser(intent,"Launch Maps");
            startActivity(chooser);
        });


    }


}
