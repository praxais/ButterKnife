package com.example.prajw.butterknife;

import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;

    @BindView(R.id.constraintLayout)
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        button.setText("Click me!");
    }

    //onClick
    @OnClick(R.id.button)
    public void onClick() {
        button.setText("Click");
        Snackbar.make(constraintLayout, "Button Clicked", Snackbar.LENGTH_SHORT).show();
    }

    //on Long Click
    @OnLongClick(R.id.button)
    public boolean onLongClick(){
        button.setText("Long Click");
        Snackbar.make(constraintLayout, "Button Long Clicked", Snackbar.LENGTH_SHORT).show();
        return true;
    }

}
