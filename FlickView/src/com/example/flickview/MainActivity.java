package com.example.flickview;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class MainActivity extends Activity {
	
	ViewPager mViewPager;
	PagerAdapter mAdapter;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//ViewPagerインスタンス取得
		mViewPager = (ViewPager) findViewById(R.id.view_pager);
		
		
		//SamplePagerAdapterインスタンスを生成
		mAdapter = new SamplePagerAdapter(this);
		
		//ViewPagerに生成したアダプタをセットする
		mViewPager.setAdapter(mAdapter);
		
	}

}
