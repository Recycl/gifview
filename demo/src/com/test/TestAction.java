package com.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

import com.ant.liao.GifView;
import com.ant.liao.GifView.GifImageType;

public class TestAction extends Activity implements OnClickListener{

	private GifView gf1;
	
	private GifView gf2;
	
	private boolean f = true;
	
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		//Log.d("dddddddddd",Environment.getRootDirectory().getAbsolutePath());
//		LinearLayout ll = new LinearLayout(this);
//		LayoutParams la = new LayoutParams(LayoutParams.FILL_PARENT,
//				LayoutParams.FILL_PARENT);
//		
//		ll.setLayoutParams(la);
//		gf1 = new GifView(this);
//		gf2 = new GifView(this);
//		
//		gf1.setGifImage(R.drawable.gif1);
//		gf2.setGifImage(R.drawable.gif2);
//		  
//		ll.addView(gf1);
//		ll.addView(gf2);
//
//		setContentView(ll);
		
		setContentView(R.layout.gif);
		
		
		gf2 = (GifView)findViewById(R.id.gif2);
		gf2.setGifImageType(GifImageType.SYNC_DECODER);
		
		
		
		gf2.setGifImage(R.drawable.a);
		//gf2.setOnClickListener(this);
		
		GifView bk = (GifView)findViewById(R.id.bk);
		bk.setGifImageType(GifImageType.COVER);
		bk.setGifImage(R.drawable.d);
	}
	
	
	
	public void onClick(View v) {
		if(f){
			gf1.showCover();
			f = false;
		}else{
			gf1.showAnimation();
			f = true;
		}
	}
	
	public void onDestroy(){
	    super.onDestroy();
	    gf2.destroy();
	}
	
}
