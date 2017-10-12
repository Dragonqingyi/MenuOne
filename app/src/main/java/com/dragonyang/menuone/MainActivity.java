package com.dragonyang.menuone;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * 菜单栏小实例
 */
public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    public static final int RED = Menu.FIRST;
    public static final int GREEN = Menu.FIRST + 1;
    public static final int BLUE = Menu.FIRST + 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.text1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //设置菜单样式
        menu.add(0,RED,0,"菜单一").setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        menu.add(0,GREEN,0,"菜单二");
        menu.add(0,BLUE,0,"菜单三");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case RED:
                mTextView.setBackgroundColor(Color.RED);
                mTextView.setText("菜单一");
                return true;
            case GREEN:
                mTextView.setBackgroundColor(Color.GREEN);
                mTextView.setText("菜单二");
                return true;
            case BLUE:
                mTextView.setBackgroundColor(Color.BLUE);
                mTextView.setText("菜单三");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
