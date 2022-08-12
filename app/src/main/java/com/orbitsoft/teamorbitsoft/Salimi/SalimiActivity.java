package com.orbitsoft.teamorbitsoft.Salimi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.orbitsoft.teamorbitsoft.R;

public class SalimiActivity extends AppCompatActivity {
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salimi);
        text = findViewById( R.id.textView );

        //جدول ضرب
        String n ="";
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                n += "\t" + i + " * " + j + " = " + ( i * j );
            }
            text.setText(n);
        }
        //******
    }
}