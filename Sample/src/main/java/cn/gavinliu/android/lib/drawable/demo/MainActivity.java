package cn.gavinliu.android.lib.drawable.demo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

import cn.gavinliu.android.lib.drawable.BlurDrawable;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.xx);
        ((ImageView) findViewById(R.id.image)).setImageDrawable(new BlurDrawable(getResources(), bitmap));

//        ((ImageView) findViewById(R.id.image)).setImageDrawable(new BitmapDrawable(getResources(), bitmap));
    }

}
