package main.java;

import sample.kotlin.bool.KotlinBooleanSample;

/**
 * Created by yy_yank on 2016/01/17.
 */
public class AccessToKotlinBooleanAccessor {
    public static void main(String... args) {
        KotlinBooleanSample sample = new KotlinBooleanSample();

        // Kotlinではvar isFuga ＝ true
        sample.isFuga();
        sample.setFuga(true);

        // Kotlinではvar fuga = true
        sample.getHoge();
        sample.setHoge(true);
    }

}
