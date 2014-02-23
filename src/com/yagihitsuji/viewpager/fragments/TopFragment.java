package com.yagihitsuji.viewpager.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yagihitsuji.viewpager.R;

/**
 */
public class TopFragment extends BaseFragment {
	private Context mContext;
	private View mView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	mContext = getActivity();
    	mView = inflater.inflate(R.layout.fragment_top, container, false);
    	
        return mView;
    }
}
