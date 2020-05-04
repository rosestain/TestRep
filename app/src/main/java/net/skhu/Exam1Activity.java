package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exam1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam1);

        final EditText editText = findViewById(R.id.editText);
        String id = "0";
        editText.setText(id);

        Button buttonIncrease = (Button) findViewById(R.id.btnIncrease);
        Button buttonDecrease = (Button) findViewById(R.id.btnDecrease);

        View.OnClickListener listener1 = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                EditText editText = (EditText)findViewById(R.id.editText);
                String id = editText.getText().toString();
                int id1 = Integer.parseInt(id);
                id1++;
                editText.setText(String.valueOf(id1));
            }
        };

        View.OnClickListener listener2 = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                EditText editText = (EditText)findViewById(R.id.editText);
                String id = editText.getText().toString();
                int id1 = Integer.parseInt(id);
                id1--;
                editText.setText(String.valueOf(id1));
            }
        };

        buttonIncrease.setOnClickListener(listener1);
        buttonDecrease.setOnClickListener(listener2);

    }

}