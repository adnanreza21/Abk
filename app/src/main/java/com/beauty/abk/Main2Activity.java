package com.beauty.abk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    private CardView CardAktiv,CardSelf,CardEat,CardDrink,CardGoal,CardFruit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        CardAktiv = (CardView) findViewById(R.id.card1);
        CardSelf = (CardView) findViewById(R.id.card2);
        CardDrink = (CardView) findViewById(R.id.card3);
        CardEat = (CardView) findViewById(R.id.card4);
        CardGoal = (CardView) findViewById(R.id.card5);
        CardFruit = (CardView) findViewById(R.id.card6);

        CardAktiv.setOnClickListener(this);
        CardSelf.setOnClickListener(this);
        CardDrink.setOnClickListener(this);
        CardEat.setOnClickListener(this);
        CardGoal.setOnClickListener(this);
        CardFruit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.card1 : i = new Intent(this,SelfActivity.class);startActivity(i);break;
            case R.id.card2 : i = new Intent(this,AktivActivity.class);startActivity(i);break;
            case R.id.card3 : i = new Intent(this,DrinkActivity.class);startActivity(i);break;
            case R.id.card4 : i = new Intent(this,Eat2Activity.class);startActivity(i);break;
            case R.id.card5 : i = new Intent(this,FruitActivity.class);startActivity(i);break;
            case R.id.card6 : i = new Intent(this,GoalActivity.class);startActivity(i);break;
            default:break;
        }

    }
}
