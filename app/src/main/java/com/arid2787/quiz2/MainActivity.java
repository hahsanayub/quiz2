package com.arid2787.quiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name = findViewById(R.id.name);
        final EditText father_name = findViewById(R.id.father_name);
        final EditText nic = findViewById(R.id.nic);
        final EditText phone_no = findViewById(R.id.phone_no);

        final EditText address = findViewById(R.id.address);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = name.getText().toString().trim();
                String Father_name = father_name.getText().toString().trim();
                String Nic = nic.getText().toString().trim();
                String Address = address.getText().toString().trim();
                String Phone_number = phone_no.getText().toString().trim();

                Bundle bundle = new Bundle();
                bundle.putString("name",Name);
                bundle.putString("father_name",Father_name);
                bundle.putString("CNI",Nic);
                bundle.putString("phone_no",Phone_number);
                bundle.putString("address",Address);
                Intent intent = new Intent(MainActivity.this, Second_activity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}