package com.zafu.canteen.bean;

/**
 * Created by mengxin on 17-1-21.
 */

public class Tab {
    private int TabImg;
    private int TabName;
    private Class TabFragment;

    public Tab(int tabImg, int tabName, Class tabFragment) {
        TabImg = tabImg;
        TabName = tabName;
        TabFragment = tabFragment;
    }

    public int getTabImg() {
        return TabImg;
    }

    public void setTabImg(int tabImg) {
        TabImg = tabImg;
    }

    public int getTabName() {
        return TabName;
    }

    public void setTabName(int tabName) {
        TabName = tabName;
    }

    public Class getTabFragment() {
        return TabFragment;
    }

    public void setTabFragment(Class tabFragment) {
        TabFragment = tabFragment;
    }
}
