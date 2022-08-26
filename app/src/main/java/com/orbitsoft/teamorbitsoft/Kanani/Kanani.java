package com.orbitsoft.teamorbitsoft.Kanani;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.orbitsoft.teamorbitsoft.R;

public class Kanani extends AppCompatActivity {
    //    Button b2,b1,name,family;
//   // private String name, family;
//    private float hight;
//    private long codemeli;
//    private float weight, bmi, avg;
//    private StringCharacterIterator mbmi;
//    private int num1, num2, num3, num4;
//    private StringCharacterIterator mavg;
//    private Button button = (Button) findViewById(R.id.buttonCall);
//    private Object tel;
//    private Context ActivityCompat;
    TextView fact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanani);
        fact f = new fact();
        int ff = f.fact(5);
//        //public void school(){
//           /* Student S = new Student();
//            S.setName(name);
//            S.setFamily(family);
//            S.setHight(Integer.valueOf((int) hight));
//            S.setNationalCode(Integer.valueOf((int) codemeli));
//            S.setWeight(Float.valueOf(weight));
//            float bmi = S.getBmi();
//            mbmi.setText(String.valueOf(bmi));
//            float avg = S.calAvg(num1, num2, num3, num4);
//            mavg.setText(String.valueOf(avg));
//*/
//
//            //گرفتن شماره از contacts و نمایش آن
//           /* setContentView(R.layout.activity_main);
//
//            button = (Button) findViewById(R.id.buttonCall);
//
//            button.setOnClickListener(new View.OnClickListener() {
//
//                public void onClick(View arg0) {
//
//                    Intent callIntent = new Intent(Intent.ACTION_CALL);
//
//                    callIntent.setData(Uri.parse(“tel:0377778888”));
//
//                    if (ActivityCompat.checkSelfPermission(Kanani.this,
//
//                            Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//
//                        return;
//
//                    }
//
//                    startActivity(callIntent);
//
//                }
//
//
//           });
//            */
////استفاده از 2 اکتیویتی
//        name=findViewById(R.id.name);
//        family=findViewById(R.id.family);
//        name.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent name=new Intent(Kanani.this,SecondActivity.class);
//                name.putExtra("name","name");
//                Intent family=new Intent(Kanani.this,SecondActivity.class);
//                name.putExtra("family","family");
//                startActivity(name);
//                startActivity(family);
//
//
//            }
//        });
//        }

    }
    //متد فاکتوریل
    int b=1;
    public int fact(int a)
    {
        if(a==1)
        {
            return b;
        }
        else
        {
            b=b*a;
            return fact(a-1);
        }
    }
}

