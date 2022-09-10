package com.orbitsoft.teamorbitsoft;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.orbitsoft.teamorbitsoft.Moosavi.moosavi_main_login_activity;
import com.orbitsoft.teamorbitsoft.example.IntentSample;
import com.orbitsoft.teamorbitsoft.example.LifeCycleActivity;
import com.orbitsoft.teamorbitsoft.example.MyDialog;
public class MainActivity extends AppCompatActivity {
Button btMoosavi ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btMoosavi=findViewById(R.id.moosavibtn);
        btMoosavi.setOnClickListener(v -> {
                    Intent intent=new Intent(this, moosavi_main_login_activity.class);
                    startActivity(intent);
                }
        );
    }
}