package com.aya.designsupportlibrary;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(view -> {
            checkValidate(R.id.id_input_layout, R.id.id_text, "id");
            checkValidate(R.id.pass_input_layout, R.id.pass_text, "Password");
        });
    }

    private void checkValidate(int textInputLayoutId, int editTextId, String text) {
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(textInputLayoutId);
        EditText editText = (EditText) findViewById(editTextId);

        if (editText.getText().length() == 0) {
            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError(getString(R.string.error, text));
        } else {
            textInputLayout.setErrorEnabled(false);
        }

    }
}
