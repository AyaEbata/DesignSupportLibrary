package com.aya.designsupportlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Bottom Sheet.
 * Created by aya on 2016/12/01.
 */
public class BottomSheetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet);

        setBottomSheetDialogButton();
        setPersistentBottomSheetButton();
        onPersistentBottomClicked();
    }

    private void setBottomSheetDialogButton() {
        Button button = (Button) findViewById(R.id.bottom_sheet_dialog_button);
        button.setOnClickListener(view -> setBottomSheetDialog());
    }

    private void setBottomSheetDialog() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        View view = getLayoutInflater().inflate(R.layout.bottom_sheet_dialog, null);
        bottomSheetDialog.setContentView(view);
        bottomSheetDialog.show();
    }

    private void setPersistentBottomSheetButton() {
        Button button = (Button) findViewById(R.id.persistent_bottom_sheet_button);
        button.setOnClickListener(view -> setPersistentBottomSheet());
    }

    private void setPersistentBottomSheet() {
        View view = findViewById(R.id.bottom_sheet);
        BottomSheetBehavior behavior = BottomSheetBehavior.from(view);
        behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
    }

    private void onPersistentBottomClicked() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.next_page);
        linearLayout.setOnClickListener(view -> startActivity(new Intent(this, TabLayoutActivity.class)));
    }

}
