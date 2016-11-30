package com.aya.designsupportlibrary;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Bottom Sheet.
 * Created by aya on 2016/12/01.
 */
public class BottomSheetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet);

        setButton();
    }

    private void setButton() {
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(view -> setBottomSheetDialog());
    }

    private void setBottomSheetDialog() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        View sheetView = getLayoutInflater().inflate(R.layout.bottom_sheet_dialog, null);
        bottomSheetDialog.setContentView(sheetView);
        bottomSheetDialog.show();
    }

}
