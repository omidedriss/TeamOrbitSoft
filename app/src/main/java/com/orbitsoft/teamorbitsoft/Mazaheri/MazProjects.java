package com.orbitsoft.teamorbitsoft.Mazaheri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.orbitsoft.teamorbitsoft.MainActivity;
import com.orbitsoft.teamorbitsoft.R;

public class MazProjects extends AppCompatActivity {
    Button mazseries1,mazseries2,mazseries3,mazseries4,
           mazseries5,mazseries6,mazseries7,



           mazexit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mazprojects);

        mazseries1=findViewById(R.id.mazseries1);
        mazseries1.setOnClickListener(v -> {
                    Intent mazi=new Intent(this, Mazaheri.class);
                    startActivity(mazi);
                }
        );
        mazseries2=findViewById(R.id.mazseries2);
        mazseries2.setOnClickListener(v -> {
                    Intent mazi=new Intent(this, MazNewIntent.class);
                    startActivity(mazi);
                }
        );
        mazseries3=findViewById(R.id.mazseries3);
        mazseries3.setOnClickListener(v -> {
                    Intent mazi=new Intent(this, MazMenu.class);
                    startActivity(mazi);
                }
        );
        mazseries4=findViewById(R.id.mazseries4);
        mazseries4.setOnClickListener(v -> {
                    Intent mazi=new Intent(this, MazNewIntent.class);
                    startActivity(mazi);
                }
        );
        mazseries5=findViewById(R.id.mazseries5);
        mazseries5.setOnClickListener(v -> {
                    Intent mazi=new Intent(this, MazId.class);
                    startActivity(mazi);
                }
        );
        mazseries6=findViewById(R.id.mazseries6);
        mazseries6.setOnClickListener(v -> {
                    Intent mazi=new Intent(this, MazTel1.class);
                    startActivity(mazi);
                }
        );
        mazseries7=findViewById(R.id.mazseries7);
        mazseries7.setOnClickListener(v -> {
                    Intent mazi=new Intent(this, MazTel2.class);
                    startActivity(mazi);
                }
        );



        mazexit=findViewById(R.id.mazexit);
        mazexit.setOnClickListener(v -> {
                    Intent mazi=new Intent(this, MainActivity.class);
                    startActivity(mazi);
                }
        );
    }
}