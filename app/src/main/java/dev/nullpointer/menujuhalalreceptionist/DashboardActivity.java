package dev.nullpointer.menujuhalalreceptionist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DashboardActivity extends AppCompatActivity {

    @BindView(R.id.scanBarcode)
    CardView scanBarcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.scanBarcode) void doScan() {
        Toast.makeText(this, "Scan is Clicked", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(), ScanActivity.class));
    }
}
