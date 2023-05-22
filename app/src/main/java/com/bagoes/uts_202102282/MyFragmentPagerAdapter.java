package com.bagoes.uts_202102282;


import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter
{
    private resmiFragment _resmiFragment = new resmiFragment();
    private Context _context;
    private internalFragment _internalFragment = new internalFragment();
    private int _tabcount;

    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int tabcount)
    {
        super(fragmentManager);

        _context = context;
        _tabcount = tabcount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return _resmiFragment;
            case 1:
                return _internalFragment;
        }
        return null;
    }

    @Override
    public int getCount()
    {
        return _tabcount;
    }
}
