package com.example.weiranfang.chatroom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by weiranfang on 4/11/14.
 */
public class Home extends Activity {
    private Button connect;
    private EditText ipAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        ipAddress =(EditText) findViewById(R.id.editText1);
        connect=(Button)findViewById(R.id.button1);
        connect.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String ip= ipAddress.getText().toString();
                Client.SERVERIP=ip;
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                Log.e("ServerIP", Client.SERVERIP);
                startActivity(intent);
            }
        });
    }


}
