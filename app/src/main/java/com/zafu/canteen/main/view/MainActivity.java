package com.zafu.canteen.main.view;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

import com.zafu.canteen.R;
import com.zafu.canteen.bean.Tab;
import com.zafu.canteen.main.presenter.MainPresenterImpl;
import com.zafu.canteen.widget.FragmentTabHost;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainVIew{

    private LayoutInflater mInflater;
    private ArrayList<Tab> mTabs =  new ArrayList<Tab>();
    private FragmentTabHost mTabHost;

    private MainPresenterImpl mainPresenter = new MainPresenterImpl(MainActivity.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTab();
    }

    private void initTab() {
        mainPresenter.initData();

        mInflater = LayoutInflater.from(this);
        mTabHost = (FragmentTabHost) this.findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

        for (Tab tab :
                mTabs) {
            TabHost.TabSpec tabSpec = mTabHost.newTabSpec(getString(tab.getTabName()));
            tabSpec.setIndicator(buildIndicator(tab));
            mTabHost.addTab(tabSpec, tab.getTabFragment(), null);
        }


        mTabHost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);
        mTabHost.setCurrentTab(0);
    }

    private View buildIndicator(Tab tab) {
        View view = mInflater.inflate(R.layout.tab_indicator, null);
        ImageView img = (ImageView) view.findViewById(R.id.icon_tab);
        TextView tv = (TextView) view.findViewById(R.id.txt_indicator);

        img.setBackgroundResource(tab.getTabImg());
        tv.setText(tab.getTabName());
        return view;
    }

    @Override
    public ArrayList<Tab> getmTabs() {
        return mTabs;
    }
}
