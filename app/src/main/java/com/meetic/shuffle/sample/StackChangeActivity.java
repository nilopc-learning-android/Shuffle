package com.meetic.shuffle.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.meetic.dragueur.Direction;
import com.meetic.dragueur.DraggableView;
import com.meetic.shuffle.Shuffle;
import com.meetic.shuffle.sample.adapter.TestAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Project: Shuffle
 *
 * Created by Jorge Garrido Oval on 5/5/16.
 * Copyright © Webpartners 2016
 */
public class StackChangeActivity extends AppCompatActivity {

    @Bind(R.id.shuffle) Shuffle shuffle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_inline_from_top);
        ButterKnife.bind(this);
        shuffle.addListener(new Shuffle.Listener() {
            @Override
            public void onViewChanged(int position) {
                Log.d("TAG", "onViewChanged" + position);
            }

            @Override
            public void onScrollStarted() {
                Log.d("TAG", "onScrollStarted");
            }

            @Override
            public void onScrollFinished() {
                Log.d("TAG", "onScrollFinished");
            }

            @Override
            public void onViewExited(DraggableView draggableView, Direction direction) {

            }

            @Override
            public void onViewScrolled(DraggableView draggableView, float percentX, float percent) {

            }
        });
        shuffle.setShuffleAdapter(new TestAdapter());
    }

}
