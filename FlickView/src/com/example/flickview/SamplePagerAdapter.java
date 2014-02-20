package com.example.flickview;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

public class SamplePagerAdapter extends PagerAdapter {
	
	//ページ数を指定
	static final int NUM_VIEW =2;
	
	LayoutInflater mInflater;
	
	public SamplePagerAdapter(Context context) {
		
		//レイアウトファイルのインスタンス化用にLayoutInflateインスタンスを取得
		mInflater = (LayoutInflater) context
				.getSystemService(context.LAYOUT_INFLATER_SERVICE);
	}
	
	@Override
	public void destroyItem(View collection,int position,Object view) {
		((ViewPager) collection).removeView((View) view);
	}
	@Override
	public void finishUpdate(View collection) {
	}
		
	@Override
	public int getCount() {
		return NUM_VIEW;
		
	}
	
	//各ページ生成時に呼び出される
	@Override
	public Object instantiateItem(View collection,int position) {
		
		//ViewPagerインスタンス取得
		ViewPager pager = (ViewPager) collection;
		
		if(position ==0) {
			
			//1ページ目を生成
			
			//レイアウトファイル「page1.xml」をインスタンス化する
			View view = mInflater.inflate(R.layout.page1,pager,false);
			
			//※ここでリスナーを設定するなど画面ごとに必要な処理を追加する
			
			//0番目のページャーにインスタンス化したビューを追加する
			pager.addView(view,0);
			
			return view;
		}else{
			//その他のページ(2ページ目)を生成
			
			//レイアウトファイル「page2.xml」をインスタンス化する
			View view = mInflater.inflate(R.layout.page2,pager,false);
			
			//※ここでリスナーを設定するなど画面ごとに必要な処理も追加する
			
			//1番目のページャーにインスタンス化したビューを追加する
			pager.addView(view,1);
			
			return view;
		}
	}
	
	@Override
	public boolean isViewFromObject(View view,Object object) {
		return view ==(View) object;
	}
	
	@Override
	public void restoreState(Parcelable parcel,ClassLoader classLoader) {
		}
		
	@Override
	public Parcelable saveState() {
		return null;
	
	}
	
	@Override
	public void startUpdate(View collection) {
	
	}

}

