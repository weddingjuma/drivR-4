package com.pxlweavr.drivr;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by IanDMiller on 8/1/16.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {
    private String[] tabNames = {"Connect", "Dashboard"};

    Fragment deviceSelectFragment;
    Fragment dashboardFragment;

    /**
     * Default constructor
     * @param fm The fragment manager the pager will be attached to
     * @param dss The Device Selection fragment
     * @param ds The Dashboard fragment
     */
    public TabsPagerAdapter(FragmentManager fm, DeviceSelectScreen dss, DashboardScreen ds) {
        super(fm);

        deviceSelectFragment = dss;
        dashboardFragment = ds;
    }

    /**
     * Get the fragment at a particular index
     * @param index The index of the fragment to fetch
     * @return The fragment at that index
     */
    @Override
    public Fragment getItem(int index) {
        Fragment tabFragment;
        switch (index) {
            case 0:
                return deviceSelectFragment;
            case 1:
                return dashboardFragment;
        }
        return null;
    }

    /**
     * Get the number of tabs
     * @return The number of tabs
     */
    @Override
    public int getCount() {
        return 2;
    }

    /**
     * Get the title of any particular tab
     * @param index The index of the tab to get the title of
     * @return The title of the tab of the given index
     */
    @Override
    public CharSequence getPageTitle(int index) {
        return tabNames[index];
    }
}
