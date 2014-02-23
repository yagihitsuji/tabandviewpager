package com.yagihitsuji.viewpager.comic;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.yagihitsuji.viewpager.R;

@SuppressWarnings("rawtypes")
public class ComicAdapter extends ArrayAdapter {
	private static final String TAG = "ComicAdapter";
	private ArrayList items;  
	private LayoutInflater inflater;

	public ComicAdapter(Context context, int resource, List items) {
		super(context, resource, items);
		this.items = (ArrayList) items;
		this.inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);  
	}
	@Override  
	public View getView(int position, View convertView, ViewGroup parent) {  
    	View view = convertView;  
	    if (view == null) {  
	    	view = inflater.inflate(R.layout.listview_comic_item, null);
	    }
	    final Item item = (Item)items.get(position);
	    if(item != null) {
  	    	TextView textview = (TextView)view.findViewById(R.id.text);
   	    	textview.setText(item.getText());
	    }
	    return view;
	}
}
