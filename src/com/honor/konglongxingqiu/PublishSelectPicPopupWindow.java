package com.honor.konglongxingqiu;

import com.honor.konglongxingqiu.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class PublishSelectPicPopupWindow extends PopupWindow {


	private LinearLayout btnHand;
	private LinearLayout btnLibrary;

	private View mMenuView;

	public PublishSelectPicPopupWindow(Activity context,OnClickListener itemsOnClick) {
		super(context);
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		mMenuView = inflater.inflate(R.layout.publish_dialog, null);
		btnHand = (LinearLayout) mMenuView.findViewById(R.id.btn_hand);
		btnLibrary = (LinearLayout) mMenuView.findViewById(R.id.btn_library);
	//	btnCancel = (Button) mMenuView.findViewById(R.id.btn_cancel);
//		btnCancel.setOnClickListener(new OnClickListener() {
//
//			public void onClick(View v) {
//				dismiss();
//			}
//		});
		//鐠佸墽鐤嗛幐澶愭尦閻╂垵锟�?
		btnHand.setOnClickListener(itemsOnClick);
		btnLibrary.setOnClickListener(itemsOnClick);
		//btnTwocode.setOnClickListener(itemsOnClick);
		//btnCancel.setOnClickListener(itemsOnClick);
		//鐠佸墽鐤哠electPicPopupWindow閻ㄥ垍iew
		this.setContentView(mMenuView);
		//鐠佸墽鐤哠electPicPopupWindow瀵懓鍤粣妞剧秼閻ㄥ嫬锟�?
		this.setWidth(LayoutParams.MATCH_PARENT);
		//鐠佸墽鐤哠electPicPopupWindow瀵懓鍤粣妞剧秼閻ㄥ嫰锟�?
		this.setHeight(LayoutParams.WRAP_CONTENT);
		//鐠佸墽鐤哠electPicPopupWindow瀵懓鍤粣妞剧秼閸欘垳鍋ｉ崙锟�??		
		this.setFocusable(true);
		//鐠佸墽鐤哠electPicPopupWindow瀵懓鍤粣妞剧秼閸斻劎鏁鹃弫鍫熺亯
		this.setAnimationStyle(R.style.AnimBottom);
		//鐎圭偘绶ラ崠鏍︾娑撶嫝olorDrawable妫版粏澹婃稉鍝勫磹闁繑锟�?
		ColorDrawable dw = new ColorDrawable(0xb0000000);
		//鐠佸墽鐤哠electPicPopupWindow瀵懓鍤粣妞剧秼閻ㄥ嫯鍎楅弲锟�??		this.setBackgroundDrawable(dw);
		//mMenuView濞ｈ濮濷nTouchListener閻╂垵鎯夐崚銈嗘焽閼惧嘲褰囩憴锟�??锟斤拷娴ｅ秶鐤嗘俊鍌涚亯閸︺劑锟介幏鈺傤攱婢舵牠娼伴崚娆撴敘濮ｄ礁鑴婇崙鐑橆�?
		mMenuView.setOnTouchListener(new OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				
				int height = mMenuView.findViewById(R.id.pop_layout).getTop();
				int y=(int) event.getY();
				if(event.getAction()==MotionEvent.ACTION_UP){
					if(y<height){
						dismiss();
					}
				}				
				return true;
			}
		});

	}

}
