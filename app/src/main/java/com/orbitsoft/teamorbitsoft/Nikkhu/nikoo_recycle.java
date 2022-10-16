package com.orbitsoft.teamorbitsoft.Nikkhu;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.orbitsoft.teamorbitsoft.R;

import java.util.ArrayList;

public class nikoo_recycle extends AppCompatActivity {
    RecyclerView rc_view;
    ArrayList<model> arrayList = new ArrayList<>();
    private Button bt_send;
    private ImageButton btn_attach;
    private EditText ed_recevier, ed_sender;
    myRecyclAdapter adapter = new myRecyclAdapter(this, arrayList);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nikoo_recycle);
        bt_send = (Button) findViewById(R.id.bt_send);
        rc_view = (RecyclerView) findViewById(R.id.rc_view);
        ed_recevier = (EditText) findViewById(R.id.ed_recevier);
        btn_attach = (ImageButton) findViewById(R.id.btn_attach);
        ed_sender = (EditText) findViewById(R.id.ed_sender);
        //my_scrol=(ScrollView)findViewById(R.id.my_scrol);

        btn_attach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, 10);
                // arrayList.add( new model(model.sender_pic,R.drawable.sand));
                rcUpdate();
            }
        });

        gettingInfo();


        rc_view.setAdapter(adapter);
        rc_view.setLayoutManager(new LinearLayoutManager(this));

        bt_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String senderTx = ed_sender.getText().toString();
                String reciverTx = ed_recevier.getText().toString();
                if (!senderTx.equals("")) {
                    arrayList.add(new model(model.sender_layout, senderTx));


//                    my_scrol.post(new Runnable() {
//                        @Override
//                        public void run() {
//                             my_scrol.fullScroll(ScrollView.FOCUS_DOWN);
//                        }
//                    });


                    ed_sender.setText(null);


                }

                if (!reciverTx.equals("")) {
                    arrayList.add(new model(model.recevier_layout, reciverTx));
                    ed_recevier.setText(null);
                }
                rcUpdate();
            }
        });

    }


    private void gettingInfo() {

//        arrayList.add(new model(model.sender_layout, "this is sender"));
//        arrayList.add(new model(model.recevier_layout, "this is recevier "));
//        arrayList.add(new model(model.sender_layout, "this is sender"));
//        arrayList.add(new model(model.sender_layout, "this is sender"));
//        arrayList.add(new model(model.sender_layout, "this is sender"));
//        arrayList.add(new model(model.recevier_layout, "this is recevier "));
//        arrayList.add(new model(model.recevier_layout, "this is recevier "));
    }

    public void rcUpdate() {
        rc_view.smoothScrollToPosition(adapter.getItemCount());
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == Activity.RESULT_OK && requestCode == 10) {
            Uri uri = data.getData();
            arrayList.add(new model(model.sender_pic, uri));
            rcUpdate();
        }

    }
}