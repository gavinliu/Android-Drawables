package cn.gavinliu.android.lib.drawable;

import android.graphics.Bitmap;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by GavinLiu on 2015-07-03
 */
class BlurManager {

    static final int EXECUTOR_THREADS = Runtime.getRuntime().availableProcessors();
    static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(EXECUTOR_THREADS);

    private final Bitmap _image;

    private Bitmap _result;

    private final BlurProcess _blurProcess;

    public BlurManager(Bitmap image) {
        _image = image;
        _blurProcess = new BlurProcess();
    }

    public Bitmap process(int radius) {
        _result = _blurProcess.blur(_image, radius);
        return _result;
    }

    public Bitmap getBitmap() {
        return _image;
    }

    public Bitmap getBluredBitmap() {
        return _result;
    }

}
