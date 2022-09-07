package com.orbitsoft.teamorbitsoft.Salimi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.orbitsoft.teamorbitsoft.R;
public class SalimiActivity extends AppCompatActivity implements View.OnClickListener {
    //implements View.OnClickListener
   // TextView text;
   // TextView textRandom;
    /*TextView textnumberOdd;
    TextView textAvarage;
    EditText editText;
    Button button;
    TextView result;
    int ans = 0;
    Button button1;

     */
   // EditText area, pass;
   // Button btn,rest;
  //  TextView error;
    EditText number;
    TextView answer;
    Button okye;
    long factorial = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_salimi );
        initialize();
        calcFactorial();
    }
    private void initialize() {
        number = (EditText) findViewById(R.id.editTextNumber);
        answer = (TextView) findViewById(R.id.textView6);
        okye = (Button) findViewById(R.id.button3);
        okye.setOnClickListener(this);
    }
    private void calcFactorial() {
        if (number.getText().toString().equals("")) number.setText("0");
        int num = Integer.parseInt(number.getText().toString());
        for(int i = 1; i<=num; i++){
            factorial = i * factorial;
        }

    }

    @Override
    public void onClick(View view) {
        calcFactorial();
        answer.setText("Factorial of " + number.getText().toString() + " is : " +     factorial);
    }

    //  text = findViewById( R.id.textView1 );
      //  textRandom = findViewById( R.id.getRandmo );
      //  textnumberOdd = findViewById( R.id.numberOdd );
      //  textAvarage = findViewById( R.id.average );
      //  editText = (EditText) findViewById( R.id.editText );
      //  button = (Button) findViewById( R.id.button );
      //  result = (TextView) findViewById( R.id.maztextView);
      //  button.setOnClickListener( this );
      //  button1 = (Button)findViewById(R.id.button1);
      //  button1.setOnClickListener( new View.OnClickListener() {
            //گرفتن اسم و فامیل و انتقال به اکتویتی و...
              /*      @Override
                   public void onClick(View v) {
                        Intent intent = new Intent(SalimiActivity.this,SecondActivitySalimi.class);
                        intent.putExtra(SecondActivitySalimi.KYE_NAME,"Amaneh");
                        intent.putExtra(SecondActivitySalimi.KYE_LASTNAME,"Salimi");
                        startActivity(intent);
                    }
                } );

               */
        ////////////////////////
        /////////////////////////////تمرین صفحه ی لاگین
    /*    area = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        btn = (Button) findViewById(R.id.login);
        rest = (Button) findViewById(R.id.reset);
        error = (TextView)findViewById(R.id.showerror);
        error.setVisibility(View.INVISIBLE);
    }

    @SuppressLint("SetTextI18n")
    public void dothis(View v) {
        String u = area.getText().toString();
        String p = pass.getText().toString();
        String check_email = "sy@scp.com";
        String check_pass = "abc@123";

        if (u.equals("")) {
            error.setVisibility(View.VISIBLE);
            error.setBackgroundColor( Color.parseColor("#D50000"));
            error.setText("Please enter your email");

        }
        else if (p.equals("")) {
            error.setVisibility(View.VISIBLE);
            error.setBackgroundColor(Color.parseColor("#D50000"));
            error.setText("Please enter your password");
            pass.onEditorAction( EditorInfo.IME_ACTION_DONE);

        }
        else if (!u.equals(check_email) && !p.equals(check_pass)) {
            error.setVisibility(View.VISIBLE);
            error.setBackgroundColor(Color.parseColor("#D50000"));
            error.setText("Invalid Email or Invalid Password");
            area.onEditorAction(EditorInfo.IME_ACTION_DONE);
            pass.onEditorAction(EditorInfo.IME_ACTION_DONE);
        }
        else if (!u.equals(check_email)) {
            error.setVisibility(View.VISIBLE);
            error.setText("Invalid Email");
            error.setBackgroundColor(Color.parseColor("#D50000"));
        }
        else if (!p.equals(check_pass)) {
            error.setVisibility(View.VISIBLE);
            error.setBackgroundColor(Color.parseColor("#D50000"));
            error.setText("Invalid Password");
            pass.onEditorAction(EditorInfo.IME_ACTION_DONE);
        }
        else if (u.equals(check_email) && p.equals(check_pass)) {
            error.setVisibility(View.VISIBLE);
            error.setBackgroundColor(Color.parseColor("#D50000"));
            error.setText("Login Successfully !!");
            error.setBackgroundColor(Color.parseColor("#00C853"));
            pass.onEditorAction(EditorInfo.IME_ACTION_DONE);
            setTitle("Welcome: " + u);
        }
    }
    public  void dorest(View v){
        area.setText("");
        pass.setText("");
        pass.clearFocus();
    }

     */
        // روش اول ساده جدول ضرب
    /*    String n = "";
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                n += "\t" + i + " * " + j + " = " + (i * j);
            }
            text.setText( n );
        }

     */
        //******
        //گرفتن 6 عدد رندوم
     /*   int SIDES = 6;
        int a = 1 + (int) (Math.random() * SIDES);
        int b = 1 + (int) (Math.random() * SIDES);
        int sum = a + b;
        textRandom.setText( String.valueOf( sum ) );

      */
        //******
        //چاپ عدد اول
   //     String m = String.valueOf( 0 );
   //     int i = 1;
        /*for (int i = 1; i <= 30 ; i++) {
            if (i % 2 != 0 ){
                Log.d("text",Integer.toString(i));
                text.setText(i);
            }else {
                text.setText(i);
            }

         */
     /*   while (i <= 30) {
            m = m + Integer.toString( i ) + "\n";
            textnumberOdd.setText( m );

            Log.d( "text", Integer.toString( i ) );
            i = i + 2;
        }

      */
        //******
        //میانگین
    /*    double[] s = {20, 16, 17, 13};
        double result = 0;
        for (double x : s) {
            result += x;
        }
        double avarage = result / s.length;
        textAvarage.setText( String.valueOf( avarage ) );
    }

     */
    //********
    //جدول ضرب روش دوم
  /*  @Override
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

   */
}