package com.ratna.businesscard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EditActivity extends AppCompatActivity {
    EditText editText;
    Button btnSubmit;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_edit);

        editText = findViewById(R.id.editText);
        btnSubmit = findViewById(R.id.btnSubmit);
        intent = getIntent();
        renderParentData();

        btnSubmit.setOnClickListener(view -> {
            Intent intent1 = new Intent();
            int code = intent.getIntExtra("code", 0);
            intent1.putExtra("value", editText.getText().toString());
            intent1.putExtra("code", code);
            setResult(code,intent1);
            finish();
        });
    }

    private void renderParentData() {
        String value = intent.getStringExtra("value");
        editText.setText(value);
    }
}