package com.example.administrator.ib_cs_ia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebStorage;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class Flight_Data extends AppCompatActivity {
    public final static String FINAL_DATA = "com.example.IB_CS_IA.MESSAGE";
   public static String OriginTexts;
    public static String DestinationTexts;
    public static String DateTexts;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight__data);
    }

    /** Called when the user clicks the Send button */
    public void sendData(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, CompareData.class);
        EditText editText = (EditText) findViewById(R.id.Origin_Data);
        OriginTexts = editText.getText().toString();


        EditText editText2 = (EditText) findViewById(R.id.Destination_Data);
        DestinationTexts = editText2.getText().toString();

        EditText editText3 = (EditText) findViewById(R.id.Date_Data);
        DateTexts = editText3.getText().toString();

        String total = OriginTexts + " " + DestinationTexts + " " + DateTexts;
        intent.putExtra(FINAL_DATA, total);
        startActivity(intent);


    }



}
