package com.aya.designsupportlibrary;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Snackbar.
 * Created by aya on 2016/11/25.
 */
public class SnackbarFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_snackbar, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        clickButton(view);
    }

    private void clickButton(View view) {
        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(this::setSnackbar);
    }

    private void setSnackbar(View snackbarView) {
        Snackbar.make(snackbarView, R.string.snackbar_text, Snackbar.LENGTH_LONG).setAction("NEXT", actionView -> {
            startActivity(new Intent(getActivity(), AppBarLayoutAction.class));
        }).show();
    }

}
