package com.orbitsoft.teamorbitsoft.Salimi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.orbitsoft.teamorbitsoft.R;
public class SalimiActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text;
    TextView textRandom;
    TextView textnumberOdd;
    TextView textAvarage;
    EditText editText;
    Button button;
    TextView result;
    int ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_salimi );
        text = findViewById( R.id.textView1 );
        textRandom = findViewById( R.id.getRandmo );
        textnumberOdd = findViewById( R.id.numberOdd );
        textAvarage = findViewById( R.id.average );
        editText = (EditText) findViewById( R.id.editText );
        button = (Button) findViewById( R.id.button );
        result = (TextView) findViewById( R.id.textView );
        button.setOnClickListener( this );
        // روش اول ساده جدول ضرب
        String n = "";
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                n += "\t" + i + " * " + j + " = " + (i * j);
            }
            text.setText( n );
        }
        //******
        //گرفتن 6 عدد رندوم
        int SIDES = 6;
        int a = 1 + (int) (Math.random() * SIDES);
        int b = 1 + (int) (Math.random() * SIDES);
        int sum = a + b;
        textRandom.setText( String.valueOf( sum ) );
        //******
        //چاپ عدد اول
        String m = String.valueOf( 0 );
        int i = 1;
        /*for (int i = 1; i <= 30 ; i++) {
            if (i % 2 != 0 ){
                Log.d("text",Integer.toString(i));
                text.setText(i);
            }else {
                text.setText(i);
            }

         */
        while (i <= 30) {
            m = m + Integer.toString( i ) + "\n";
            textnumberOdd.setText( m );

            Log.d( "text", Integer.toString( i ) );
            i = i + 2;
        }
        //******
        //میانگین
        double[] s = {20, 16, 17, 13};
        double result = 0;
        for (double x : s) {
            result += x;
        }
        double avarage = result / s.length;
        textAvarage.setText( String.valueOf( avarage ) );
    }
    //********
    //جدول ضرب روش دوم
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                StringBuffer buffer = new StringBuffer();
                int res;

                String fs = editText.getText().toString();

                int k = Integer.parseInt(fs);

                for (int s = 1; s <= 10; s++) {
                    ans = (s * k);
                    buffer.append(k + " X " + s
                            + " = " + ans + "\n\n");
                }for (int i = 1; i <= 10; i++) {
                ans = (i * k);
                buffer.append(k + " X " + i
                        + " = " + ans + "\n\n");
            }
                result.setText(buffer);
                break;
        }
    }
}

