package com.example.userinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextAddress;
    private EditText editTextEmailId;
    private EditText editTextPhoneNo;
    private Button buttonConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.edit_text_name);
        editTextAddress = findViewById(R.id.edit_text_address);
        editTextEmailId = findViewById(R.id.edit_text_emailid);
        editTextPhoneNo = findViewById(R.id.edit_text_phoneno);
        buttonConfirm = findViewById(R.id.button_confirm);

        editTextName.addTextChangedListener(loginTextWatcher);
        editTextAddress.addTextChangedListener(loginTextWatcher);
        editTextEmailId.addTextChangedListener(loginTextWatcher);
        editTextPhoneNo.addTextChangedListener(loginTextWatcher);


    }
    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String nameInput = editTextName.getText().toString().trim();
            String addressInput = editTextName.getText().toString().trim();
            String emailidInput = editTextName.getText().toString().trim();
            String phonenoInput = editTextName.getText().toString().trim();

            buttonConfirm.setEnabled(!nameInput.isEmpty() && !addressInput.isEmpty() );


        }

        @Override
        public void afterTextChanged(Editable charSequence) {

        }
    };
}