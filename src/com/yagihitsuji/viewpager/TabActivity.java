package com.yagihitsuji.viewpager;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost.OnTabChangeListener;

import com.yagihitsuji.viewpager.fragments.ComicListFragment;
import com.yagihitsuji.viewpager.fragments.TopFragment;

/**
 */
public class TabActivity extends BaseFragmentActivity {
	/**
	 */
	private static final String TAG = "TabActivity";
	private Context mContext;
	public FragmentTabHost mFragmentTabHost;
	private FragmentManager mFragmentManager;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab);
		mContext = this;
		mFragmentManager = getSupportFragmentManager();
		try {
			mFragmentTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
			mFragmentTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
			mFragmentTabHost.setOnTabChangedListener(new OnTabChangeListener() {
				@Override
				public void onTabChanged(String tabId) {
				}
			});
            ImageView item01 = new ImageView(this);
            item01.setBackgroundResource(R.drawable.tabbtn_selector_01);
            item01.setAdjustViewBounds(true);
            item01.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 1));
            mFragmentTabHost.addTab(mFragmentTabHost.newTabSpec("01").setIndicator(item01), ComicListFragment.class, null);
            ImageView item02 = new ImageView(this);
            item02.setBackgroundResource(R.drawable.tabbtn_selector_02);
            item02.setAdjustViewBounds(true);
            item02.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 1));
            mFragmentTabHost.addTab(mFragmentTabHost.newTabSpec("02").setIndicator(item02), TopFragment.class , null);
		} catch (Exception e) {
		}
	}
}
