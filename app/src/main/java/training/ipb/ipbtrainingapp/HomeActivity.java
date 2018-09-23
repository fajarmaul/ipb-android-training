package training.ipb.ipbtrainingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
//Version 1
//public class HomeActivity extends AppCompatActivity {
//    private Intent intent;
//    private TextView namaTextView;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);
//        intent = getIntent();
//        namaTextView = findViewById(R.id.namaTextView);
//        namaTextView.setText(intent.getStringExtra("data"));
//    }
//}

////Version 2
//public class HomeActivity extends AppCompatActivity {
//    private Intent intent;
//    private TextView namaTextView;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);
//        intent = getIntent();
//        namaTextView = findViewById(R.id.namaTextView);
//        namaTextView.setText(intent.getStringExtra("data"));
//    }
//}

//Version 3
public class HomeActivity extends AppCompatActivity {
    private Intent intent;
    private Bundle dataReceived;
    private User userData;
    private TextView namaTextView;
    private TextView namaTextViewDua;
    private TextView umurTextView;
    private TextView genderTextView;
    private TextView alamatTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        dataReceived = getIntent().getExtras();
        userData = dataReceived.getParcelable("data");

        //Binding the data
        namaTextView = findViewById(R.id.namaTextView);
        namaTextViewDua = findViewById(R.id.namaTextViewDua);
        umurTextView = findViewById(R.id.umurTextView);
        genderTextView = findViewById(R.id.genderTextView);
        alamatTextView = findViewById(R.id.alamatTextView);

        //Set the data to the view
        namaTextView.setText(userData.getName());
        namaTextViewDua.setText(userData.getName());
        umurTextView.setText(String.valueOf(userData.getAge()));
        genderTextView.setText(userData.getGender());
        alamatTextView.setText(userData.getAddress());
    }
}