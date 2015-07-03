package cn.gavinliu.android.lib.drawable.demo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

import cn.gavinliu.android.lib.drawable.BlurDrawable;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    boolean usePalette;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.fill).setOnClickListener(this);
        findViewById(R.id.top).setOnClickListener(this);
        findViewById(R.id.bottom).setOnClickListener(this);
        findViewById(R.id.left).setOnClickListener(this);
        findViewById(R.id.right).setOnClickListener(this);

        ((CheckBox) findViewById(R.id.palette)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                usePalette = b;
            }
        });
    }

    @Override
    public void onClick(View view) {
        BlurDrawable blurDrawable = null;
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.album);

        switch (view.getId()) {
            case R.id.fill:
                blurDrawable = new BlurDrawable(getResources(), bitmap, Gravity.FILL, bitmap.getHeight() / 2, usePalette);
                break;
            case R.id.top:
                blurDrawable = new BlurDrawable(getResources(), bitmap, Gravity.TOP, bitmap.getHeight() / 2, usePalette);
                break;
            case R.id.bottom:
                blurDrawable = new BlurDrawable(getResources(), bitmap, Gravity.BOTTOM, bitmap.getHeight() / 2, usePalette);
                break;
            case R.id.left:
                blurDrawable = new BlurDrawable(getResources(), bitmap, Gravity.LEFT, bitmap.getHeight() / 2, usePalette);
                break;
            case R.id.right:
                blurDrawable = new BlurDrawable(getResources(), bitmap, Gravity.RIGHT, bitmap.getHeight() / 2, usePalette);
                break;
        }

        ((ImageView) findViewById(R.id.image)).setImageDrawable(blurDrawable);
    }
}
