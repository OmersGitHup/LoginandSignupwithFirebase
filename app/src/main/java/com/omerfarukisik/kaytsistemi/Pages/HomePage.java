package com.omerfarukisik.kaytsistemi.Pages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.omerfarukisik.kaytsistemi.R;

public class HomePage extends AppCompatActivity {

    private ViewPager mViewPager;

    public void init(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }
}