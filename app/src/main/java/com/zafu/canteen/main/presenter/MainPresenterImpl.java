package com.zafu.canteen.main.presenter;

import com.zafu.canteen.R;
import com.zafu.canteen.bean.Tab;
import com.zafu.canteen.main.view.MainVIew;
import com.zafu.canteen.tabFour.TabFourFragment;
import com.zafu.canteen.tabOne.TabOneFragment;
import com.zafu.canteen.tabThree.TabThreeFragment;
import com.zafu.canteen.tabTwo.TabTwoFragment;

import java.util.ArrayList;

/**
 * Created by mengxin on 17-1-21.
 */

public class MainPresenterImpl implements MainPresenter {

    private MainVIew mMainVIew;

    public MainPresenterImpl(MainVIew mainVIew) {
        this.mMainVIew = mainVIew;
    }

    @Override
    public void initData() {
        ArrayList<Tab> mTabs = mMainVIew.getmTabs();
        mTabs.add(new Tab(R.drawable.selector_icon_mine, R.string.tab_name, TabOneFragment.class));
        mTabs.add(new Tab(R.drawable.selector_icon_mine, R.string.tab_name1, TabTwoFragment.class));
        mTabs.add(new Tab(R.drawable.selector_icon_mine, R.string.tab_name2, TabThreeFragment.class));
        mTabs.add(new Tab(R.drawable.selector_icon_mine, R.string.tab_name3, TabFourFragment.class));
    }
}
