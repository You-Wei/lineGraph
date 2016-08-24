package com.example.yyerg.hrv;

import android.util.Log;

import java.util.ArrayList;
import java.lang.Math;

/**
 * Created by yyerg on 2016/4/25.
 */
public class FFTManager {
    ArrayList<Integer> TraditionalFT(ArrayList<Integer> t){
        ArrayList<Integer> f = new ArrayList<Integer>();
        int i,j;
        for(i=0;i<t.size();i++){
            Integer f_i = 0;
            for(j=0;j<t.size();j++){
                Double real_part = t.get(j)*(Math.cos((-2) * Math.PI*j*i/t.size()));
                //Log.d(MainActivity.APP_TAG, real_part.toString());
                f_i = f_i + real_part.intValue();
            }
            f.add(f_i);
        }
        return f;
    }
}
