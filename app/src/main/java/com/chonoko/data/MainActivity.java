package com.chonoko.data;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        main.setPadding(30, 50, 30, 30);
        main.setGravity(Gravity.CENTER_HORIZONTAL);
        TextView title = new TextView(this);
        title.setText("CHONOKO DATA");
        title.setTextSize(30);
        title.setTextColor(Color.BLACK);
        title.setGravity(Gravity.CENTER);
        main.addView(title);
        TextView balance = new TextView(this);
        balance.setText("Wallet Balance\n₦0.00");
        balance.setTextSize(24);
        balance.setGravity(Gravity.CENTER);
        balance.setPadding(0, 50, 0, 50);
        main.addView(balance);
        String[] items = {"BUY DATA", "AIRTIME", "FUND WALLET", "TRANSACTIONS", "MY ACCOUNT"};
        for (String item : items) {
            TextView button = new TextView(this);
            button.setText(item);
            button.setTextSize(20);
            button.setGravity(Gravity.CENTER);
            button.setPadding(30, 25, 30, 25);
            if (item.equals("BUY DATA")) button.setOnClickListener(v -> startActivity(new Intent(this, BuyDataActivity.class)));
            main.addView(button);
        }
        setContentView(main);
    }
}
