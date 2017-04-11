package com.example.csaper6.rgbsliders;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar redBar;
    private SeekBar greenBar;
    private SeekBar blueBar;
    private LinearLayout background;
    private TextView rt;
    private TextView gt;
    private TextView bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redBar = (SeekBar) findViewById(R.id.seekBar_red);
        greenBar = (SeekBar) findViewById(R.id.seekBar_green);
        blueBar = (SeekBar) findViewById(R.id.seekBar_blue);
        background = (LinearLayout) findViewById(R.id.background);
        rt = (TextView) findViewById(R.id.red_value);
        gt = (TextView) findViewById(R.id.green_value);
        bt = (TextView) findViewById(R.id.blue_value);

        redBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                update();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        greenBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                update();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        blueBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                update();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    private void update() {
        background.setBackgroundColor(Color.rgb(redBar.getProgress(), greenBar.getProgress(), blueBar.getProgress()));

        rt.setText(Integer.toString(redBar.getProgress()));
        gt.setText(Integer.toString(greenBar.getProgress()));
        bt.setText(Integer.toString(blueBar.getProgress()));
    }
}
