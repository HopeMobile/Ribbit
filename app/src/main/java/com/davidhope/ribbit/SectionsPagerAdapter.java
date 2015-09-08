package com.davidhope.ribbit;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by David on 8/31/2015.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    protected Context mContext;
    protected String[] tabTitles = new String[] {"Inbox", "Friends"};

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
          return MainActivityFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        super.getPageTitle(position);

      return tabTitles[position];

    }

}
