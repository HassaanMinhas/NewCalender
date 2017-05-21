package com.example.abc.newcalender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    CalendarView calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendar = (CalendarView) findViewById(R.id.calender);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){

            @Override
            public void onSelectedDayChange (CalendarView view, int year, int month, int dayOfMonth){
                Toast.makeText(getApplicationContext(),dayOfMonth+"/"+month+"/"+year,Toast.LENGTH_LONG).show();
            }
        });
    }
}
