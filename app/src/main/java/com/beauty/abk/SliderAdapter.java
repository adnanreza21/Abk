package com.beauty.abk;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    public int[] slide_images = {
            R.drawable.job,
            R.drawable.minum,
            R.drawable.sleep,
            R.drawable.eat

    };
    public String [] slide_headings = {
            "JOB",
            "MINUM",
            "SLEEP",
            "EAT"
    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject( View view, Object o) {
        return view == (RelativeLayout) o;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.image);
        TextView slideHeading = (TextView) view.findViewById(R.id.text1);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem( ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout)object);
    }

}
