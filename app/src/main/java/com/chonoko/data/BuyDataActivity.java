package com.chonoko.data;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BuyDataActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(30, 50, 30, 30);
        TextView title = new TextView(this);
        title.setText("BUY DATA");
        title.setTextSize(30);
        title.setTextColor(Color.BLACK);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);
        String[] networks = {"MTN", "Airtel", "Glo", "9mobile"};
        for (String network : networks) {
            TextView item = new TextView(this);
            item.setText(network);
            item.setTextSize(22);
            item.setGravity(Gravity.CENTER);
            item.setPadding(20, 30, 20, 30);
            layout.addView(item);
        }
        setContentView(layout);
    }
}
