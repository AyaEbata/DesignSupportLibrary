package com.aya.designsupportlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

/**
 * Text Input Layout.
 * Created by aya on 2016/11/23.
 */
public class TextInputLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layout);

        setLoginButton();
    }

    private void setLoginButton() {
        Button loginButton = (Button) findViewById(R.id.button);
        loginButton.setOnClickListener(view -> {
            boolean isId = checkValidate(R.id.id_input_layout, R.id.id_text, "id");
            boolean isPass = checkValidate(R.id.pass_input_layout, R.id.pass_text, "Password");
            if (isId && isPass) {
                startActivity(new Intent(TextInputLayoutActivity.this, DecorationActivity.class));
            }
        });
    }

    private boolean checkValidate(int textInputLayoutId, int editTextId, String text) {
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(textInputLayoutId);
        EditText editText = (EditText) findViewById(editTextId);

        if (editText.getText().length() == 0) {
            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError(getString(R.string.error, text));
            return false;
        } else {
            textInputLayout.setErrorEnabled(false);
            return true;
        }
    }

}
