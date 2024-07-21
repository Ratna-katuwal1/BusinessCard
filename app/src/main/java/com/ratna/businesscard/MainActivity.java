package com.ratna.businesscard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int Edit_Name = 1;
    int Edit_Profession = 2;
    int Edit_Address = 3;
    int Edit_Email = 4;
    int Edit_Phone = 5;
    int Edit_Instagram = 6;
    int Edit_Fb = 7;
    int Edit_Linkedin = 8;

    TextView nameTextView, workTextView, addressTextView, emailTextView, phoneTextView, instagramTextView, facebookTextView, linkedinTextView, editName, editWork, editAddress, editEmail, editPhone, editInstagram, editFb, editLinkedin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        nameTextView = findViewById(R.id.nameText);
        workTextView = findViewById(R.id.professionText);
        addressTextView = findViewById(R.id.addressTextView);
        emailTextView = findViewById(R.id.emailText);
        phoneTextView = findViewById(R.id.contactText);
        instagramTextView = findViewById(R.id.instagramText);
        facebookTextView = findViewById(R.id.facebookText);
        linkedinTextView = findViewById(R.id.linkedinText);

        editName = findViewById(R.id.editName);
        editWork = findViewById(R.id.editWork);
        editAddress = findViewById(R.id.editAddress);
        editEmail = findViewById(R.id.editEmail);
        editPhone = findViewById(R.id.editPhone);
        editInstagram = findViewById(R.id.editInsta);
        editFb = findViewById(R.id.editFb);
        editLinkedin = findViewById(R.id.editLinkedin);

        editName.setOnClickListener(view -> {
            Intent intent = new Intent(this, EditActivity.class);
            intent.putExtra("value", nameTextView.getText().toString());
            intent.putExtra("code", Edit_Name);
            startActivityForResult(intent, Edit_Name);
        });

        editAddress.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, EditActivity.class);
            intent.putExtra("value", addressTextView.getText().toString());
            intent.putExtra("code", Edit_Address);
            startActivityForResult(intent, Edit_Address);
        });

        editEmail.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, EditActivity.class);
            intent.putExtra("value", emailTextView.getText().toString());
            intent.putExtra("code", Edit_Email);
            startActivityForResult(intent, Edit_Email);
        });

        editPhone.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, EditActivity.class);
            intent.putExtra("value", phoneTextView.getText().toString());
            intent.putExtra("code", Edit_Phone);
            startActivityForResult(intent, Edit_Phone);
        });

        editInstagram.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, EditActivity.class);
            intent.putExtra("value", instagramTextView.getText().toString());
            intent.putExtra("code", Edit_Instagram);
            startActivityForResult(intent, Edit_Instagram);
        });

        editFb.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, EditActivity.class);
            intent.putExtra("value", facebookTextView.getText().toString());
            intent.putExtra("code", Edit_Fb);
            startActivityForResult(intent, Edit_Fb);
        });

        editLinkedin.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, EditActivity.class);
            intent.putExtra("value", linkedinTextView.getText().toString());
            intent.putExtra("code", Edit_Linkedin);
            startActivityForResult(intent, Edit_Linkedin);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Edit_Name) {
            nameTextView.setText(data.getStringExtra("value"));
        }
        if (requestCode == Edit_Profession) {
            workTextView.setText(data.getStringExtra("value"));
        }
        if (requestCode == Edit_Address) {
            addressTextView.setText(data.getStringExtra("value"));
        }
        if (requestCode == Edit_Email) {
            emailTextView.setText(data.getStringExtra("value"));
        }
        if (requestCode == Edit_Instagram) {
            instagramTextView.setText(data.getStringExtra("value"));
        }
        if (requestCode == Edit_Fb) {
            facebookTextView.setText(data.getStringExtra("value"));
        }
        if (requestCode == Edit_Linkedin) {
            linkedinTextView.setText(data.getStringExtra("value"));
        }
    }
}