package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Exam1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam1);

        final EditText editText = findViewById(R.id.editText);
        editText.setId(0);

        Button buttonIncrease = (Button)findViewById(R.id.btnIncrease);
        Button buttonDecrease = (Button)findViewById(R.id.btnDecrease);
    }
}
