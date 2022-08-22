package com.orbitsoft.teamorbitsoft.Saeidian2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.orbitsoft.teamorbitsoft.R;

public class saeidian_login1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saeidian_login1);
         TextView no_acountt = findViewById(R.id.no_acount);

        no_acountt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new
                            Intent(saeidian_login1.this, saeidian_login2.class);
                    Bundle bundle = new Bundle();

                    i.putExtras(bundle);
                    startActivity(i);

//                get_sms2 = get_sms.getText().toString();
//                //Toast.makeText(saeidian_login2.this, get_sms2, Toast.LENGTH_SHORT).show();
//                if (get_sms2.equalsIgnoreCase(get_sms3)) {
//
//                    Toast.makeText(saeidian_login2.this, "correct", Toast.LENGTH_SHORT).show();
//                    Intent i = new
//                            Intent(saeidian_login2.this, saeidian_login1.class);
//                    Bundle bundle = new Bundle();
//
//                    i.putExtras(bundle);
//                    startActivity(i);
//                } else {
//                    Toast.makeText(saeidian_login2.this, "wrong", Toast.LENGTH_SHORT).show();
//                }

            }
        });
    }
}