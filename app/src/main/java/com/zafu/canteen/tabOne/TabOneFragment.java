package com.zafu.canteen.tabOne;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zafu.canteen.base.BaseFragment;

/**
 * Created by mengxin on 17-1-21.
 */

public class TabOneFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getContext());
        textView.setText("adfasd");
        return textView;
    }
}
