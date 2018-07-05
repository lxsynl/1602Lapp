package com.bwie.llll;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by li li on 2018/7/4.
 */

public class Fragment_2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate1 = inflater.inflate(R.layout.mtw_layout, container, false);
        return inflate1;
        
    }
}
