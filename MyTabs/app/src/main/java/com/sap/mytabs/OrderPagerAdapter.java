package com.sap.mytabs;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class OrderPagerAdapter extends FragmentStatePagerAdapter {


    public OrderPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PendingOrderFragment();
            case 1:
                return new ConfirmOrderFragment();
            default:
                return new DeilveOrderFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
