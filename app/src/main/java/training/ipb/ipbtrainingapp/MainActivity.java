package training.ipb.ipbtrainingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText namaEditText;
    private Button masukButton;
    private String nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Binding the view
        namaEditText = findViewById(R.id.inputNamaEditText);
        masukButton = findViewById(R.id.masukButton);
        //Click Listener
        masukButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = namaEditText.getText().toString();
                //Creating Intent and put the data inside Intent
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("data", nama);
                startActivity(intent);
            }
        });
    }
}
