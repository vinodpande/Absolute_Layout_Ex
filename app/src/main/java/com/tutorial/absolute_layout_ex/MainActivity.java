package com.tutorial.absolute_layout_ex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/*
An Absolute Layout lets you specify exact locations (x/y coordinates) of its children.
Absolute layouts are less flexible and harder to maintain than other types of layouts without absolute positioning.

android:id -> This is the ID which uniquely identifies the layout.
android:layout_x -> This specifies the x-coordinate of the view.
android:layout_y -> This specifies the y-coordinate of the view.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
