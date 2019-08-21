package com.beauty.abk;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class EatActivity extends AppCompatActivity {
    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    private SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat);

        mSlideViewPager = (ViewPager) findViewById(R.id.SlideView);
        mDotLayout = (LinearLayout) findViewById(R.id.dots);

        sliderAdapter = new SliderAdapter(this);
        mSlideViewPager.setAdapter(sliderAdapter);



    }
}
