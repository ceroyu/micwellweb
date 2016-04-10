package com.micwell.micwellweb;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;

public class MainActivity extends Activity {
    GridView menuGrid,toolbarGrid;

    int [] menu_toolbar_image_array = {
            R.drawable.arr_left,
            R.drawable.arr_right,
            R.drawable.arr_re,
            R.drawable.arr_home,
            R.drawable.arr_share
    };

    String [] menu_toolbar_title_array = {"后退","前进","刷新","首页","分享"}；

    private final int TOOLBAR_ITEM_BACK = 0;
    private final int TOOLBAR_ITEM_FORWORD = 1;
    private final int TOOLBAR_ITEM_RE = 2;
    private final int TOOLBAR_ITEM_HOME = 3;
    private final int TOOLBAR_ITEM_SHARE = 4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void creatToolBar(){
        toolbarGrid = (GridView)findViewById(R.id.GridView_toolbar);
        toolbarGrid.setNumColumns(5);
        toolbarGrid.setGravity(Gravity.CENTER);
        toolbarGrid.setHorizontalSpacing(10);
        toolbarGrid.setVerticalSpacing(10);
        toolbarGrid.setAdapter(getMenuAdapter.);


    }

    private SimpleAdapter getMenuAdapter
}
