package com.orbitsoft.teamorbitsoft.Mazaheri;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.R;

public class MazStartForResult_SecondActivity extends AppCompatActivity {
    EditText editText1;
    Button button1;
    Switch mazsw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mazstartforresult_second);


        mazsw=findViewById(R.id.mazswitch1);
        editText1=(EditText)findViewById(R.id.editText1);
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String message=editText1.getText().toString();
                Intent intent=new Intent();
                intent.putExtra("MESSAGE",message);

                mazsw.setOnCheckedChangeListener((buttonView, isChecked) -> {
                    if(isChecked){
                        setResult(30,intent);
                    }
                    else {setResult(20,intent);
                    }

                });





                finish();//finishing activity
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.second, menu);
        return true;
    }
}