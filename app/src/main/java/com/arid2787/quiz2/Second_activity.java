package com.arid2787.quiz2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("name");
            String father_name = bundle.getString("father_name");
            String cnic = bundle.getString("CNI");
            String address = bundle.getString("address");
            String phone_number = bundle.getString("phone_no");

            TextView textView = findViewById(R.id.text_view);
            textView.setText("Name:   "+name+System.getProperty("line.separator")+
                    "Father Name:   "+father_name+System.getProperty("line.separator")+
                    "CNIC:  "+cnic+System.getProperty("line.separator")+
                    "Phone Number:  "+phone_number+System.getProperty("line.separator")+
                    "Address:  "+address+System.getProperty("line.separator"));
        }
    }
}