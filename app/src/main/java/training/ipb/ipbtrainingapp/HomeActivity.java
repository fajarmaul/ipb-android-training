package training.ipb.ipbtrainingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private Intent intent;
    private TextView namaTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        intent = getIntent();
        namaTextView = findViewById(R.id.namaTextView);
        namaTextView.setText(intent.getStringExtra("data"));
    }
}
