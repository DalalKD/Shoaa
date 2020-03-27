package com.example.uni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;

import java.util.ArrayList;
import java.util.List;

public class Week extends AppCompatActivity {
    AnyChartView anyChartView;

    String[] Days = {"SUN", "MON", "TUE" ,"WED", "THU", "FRI", "SAT"};
    int[] Time = {9,7,10,6,7,7,5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);

        anyChartView = findViewById(R.id.any_chart_view);
        setupPieChart();
    }
    public void setupPieChart(){

        Pie pie = AnyChart.pie();
        List<DataEntry> dataEntries = new ArrayList<>();
        for (int i = 0; i < Days.length; i++ ){

            dataEntries.add(new ValueDataEntry(Days[i],Time[i]));
        }
        pie.data(dataEntries);
        anyChartView.setChart(pie);
    }
    public void left(View view) {
        Intent i = new Intent(Week.this, ParentPage.class);
        startActivity(i);
    }

}
