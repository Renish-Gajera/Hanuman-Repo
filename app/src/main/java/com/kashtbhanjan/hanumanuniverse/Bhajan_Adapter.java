package com.kashtbhanjan.hanumanuniverse;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Bhajan_Adapter extends FragmentStateAdapter {

    public Bhajan_Adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }



    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0){
            return new hanumanchalisa();
        } else if (position == 1) {
            return  new bajrangban();
        }else if (position == 2) {
            return  new arti();
        }else if (position == 3) {
            return  new mantra();
        }else  {
            return  new sundarkand();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
