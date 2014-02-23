package com.yagihitsuji.viewpager.fragments;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.yagihitsuji.viewpager.Comic01Activity;
import com.yagihitsuji.viewpager.R;
import com.yagihitsuji.viewpager.comic.ComicAdapter;
import com.yagihitsuji.viewpager.comic.Item;
import com.yagihitsuji.viewpager.models.Global;

/**
 */
public class ComicListFragment extends BaseFragment {
	private Context mContext;
	private View mView;
	private ListView mListView;
	private ArrayList<Item> list = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	mContext = getActivity();
    	mView = inflater.inflate(R.layout.fragment_comiclist, container, false);
    	mView.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				return true;
			}
		});
    	mListView = (ListView)mView.findViewById(R.id.listview);
    	mListView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				Intent intent = null;
		    	try {
				    	switch((int)arg3){
				    	case 0:
	                        intent = new Intent(mContext, Comic01Activity.class);
				            startActivity(intent);
				    		break;
				    	case 1:
	                         intent = new Intent(mContext, Comic01Activity.class);
				            startActivity(intent);
				    		break;
				    	}
			    	} catch (Exception e) {
			    	}
				}
			});
        createData();
        return mView;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    	mListView.setAdapter(new ComicAdapter(getActivity(),R.layout.listview_comic_item,list));
    }
    private void createData() {
    	this.list = new ArrayList<Item>();
    	for(int i=0;i<Global._mangatitles.length;i++) {
        	list.add(new Item(Global._mangatitles[i]));
    	}
    }
}
