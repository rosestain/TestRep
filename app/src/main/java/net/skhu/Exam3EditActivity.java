package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exam3EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam3_edit);

        Button b = (Button)findViewById(R.id.btnSave);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                EditText editText = (EditText)findViewById((R.id.editText5));
                String s = editText.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("MEMO", s);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }
}
