package com.aya.designsupportlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * View Pager.
 * Created by aya on 2016/12/10.
 */
public class ViewPagerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_view_pager, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setText(view);
        setButton(view);
    }

    public void setText(View view) {
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(R.string.view_pager);
    }

    private void setButton(View view) {
        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(v -> startActivity(new Intent(getActivity(), BottomNavigationViewActivity.class)));
    }

}