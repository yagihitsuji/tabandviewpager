package com.yagihitsuji.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yagihitsuji.viewpager.models.Global;

/**
 */
public class Comic02Activity extends BaseFragmentActivity {
	private static final int mangaNo = 1;
	private static final int NUM_ITEMS = 5;
	MyAdapter mAdapter;
	ViewPager mPager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_comic);
		TextView textview = (TextView)findViewById(R.id.title);
		textview.setText(Global._mangatitles[mangaNo]);
		mAdapter = new MyAdapter(getSupportFragmentManager());
		mPager = (ViewPager) findViewById(R.id.viewPager);
		mPager.setAdapter(mAdapter);
		mPager.setCurrentItem(NUM_ITEMS);
	}
	public static class MyAdapter extends FragmentPagerAdapter {
		public MyAdapter(FragmentManager fm) {
			super(fm);
		}
		@Override
		public int getCount() {
			return NUM_ITEMS;
		}
		@Override
		public Fragment getItem(int position) {
			return ArrayListFragment.newInstance(position);
		}
	}
	public static class ArrayListFragment extends Fragment {
		int mNum;
		static ArrayListFragment newInstance(int num) {
			ArrayListFragment f = new ArrayListFragment();
			Bundle args = new Bundle();
			args.putInt("num", num);
			f.setArguments(args);
			return f;
		}
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			mNum = getArguments() != null ? getArguments().getInt("num") : 1;
			
		}
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			View v = inflater.inflate(R.layout.fragment_comic_page, container, false);
			ImageView imageView = (ImageView)v.findViewById(R.id.contents);
			switch(mNum) {
			case 0:
	    		imageView.setImageResource(R.drawable.comic02_04);
				break;
			case 1:
    			imageView.setImageResource(R.drawable.comic02_03);
				break;
			case 2:
		    	imageView.setImageResource(R.drawable.comic02_02);
				break;
			case 3:
	    		imageView.setImageResource(R.drawable.comic02_01);
				break;
			case 4:
    			imageView.setImageResource(R.drawable.comic02_title);
				break;
			}
			return v;
		}
		@Override
		public void onActivityCreated(Bundle savedInstanceState) {
			super.onActivityCreated(savedInstanceState);
		}
	}
}