package com.tic;

import java.awt.*;

/**
 * Created by zhou on 15-12-15.
 */
public class MyGenerator implements ColorGenerator {
    @Override
    public int generator(int i, int j) {
        int c = (int) (Math.sqrt(i * i + j * j) / (200 * Math.sqrt(2)) * 256);
        return new Color(c, c, c).getRGB();
    }

    @Override
    public int width() {
        return 200;
    }

    @Override
    public int height() {
        return 200;
    }
}
