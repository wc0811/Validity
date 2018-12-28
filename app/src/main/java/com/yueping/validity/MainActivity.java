package com.yueping.validity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        Date curDate = new Date(System.currentTimeMillis());//获取当前时间

        Date dateEnd = null;
        try {
            dateEnd = formatter.parse("20181216");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (dateEnd.compareTo(curDate) < 0) {
            return;
        }
    }
}
