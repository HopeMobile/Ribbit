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
        switch (position) {
            case 0:
                return new InboxFragment();
            case 1:
                return new FriendsFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

  /*  @Override
    public CharSequence getPageTitle(int position) {
        super.getPageTitle(position);
        switch (position) {
            case 0:
                return mContext.getString(R.string.inbox_tab_title);
            case 1:
                return mContext.getString(R.string.friends_tab_title);
        }

      return null;

    }*/

    public int getIcon(int position) {
        switch (position) {
            case 0:
                return R.drawable.ic_tab_inbox;
            case 1:
                return R.drawable.ic_tab_friends;
        }

        return R.drawable.ic_tab_inbox;
    }

}
