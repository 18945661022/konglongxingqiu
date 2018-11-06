package com.honor.konglongxingqiu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

//import com.tencent.mm.sdk.openapi.IWXAPI;
//import com.tencent.mm.sdk.openapi.WXAPIFactory;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;


public class MyApplication extends Application {
	
	//public static IWXAPI api;

	private static final String TAG = MyApplication.class.getSimpleName();

	private static MyApplication instance;
	
	public static String DATA_PATH;
	public static String RT_UPLOAD_URL;
	public static String RT_SHOW_URL;
	public static String RT_WAP_URL;	

	public static MyApplication getInstance() {
		return instance;
	}

	public static Set<Activity> setActivities;


	public void onCreate() {
		Log.i("Unity", "begin");
		instance = this;
		setActivities = new HashSet<Activity>();
		//wxInit();
		//checkAndCopy();
	}
	/*
	private void wxInit(){
		api = WXAPIFactory.createWXAPI(this, Constant.weixin_appid,true);
		api.registerApp(Constant.weixin_appid);
		Log.i("Unity", "wxInit ok");
		//TestLog.writeLog("wxInit ok");
	}
	*/
	/*
	private void checkAndCopy(){
		//DATA_PATH = this.getApplicationContext().getFilesDir().getAbsolutePath();
		DATA_PATH = this.getApplicationContext().getExternalFilesDir(null).getAbsolutePath();
		 String path1 = DATA_PATH + "/bawanglong.mp4"; 
		 Log.i("Unity", path1);
		 String path2 = DATA_PATH + "/yitelong.mp4"; 
		 File file = new File(path1);                        
	     if(file.exists()){   
	    	    Log.i("Unity", "file exist11111111111111111111");
	            return;                   
	      }     
	     Log.i("Unity", "file doesnot exist2222222222222222");
	     copyData("bawanglong.mp4");
	     copyData("yitelong.mp4");
	}
	
	void copyData(String filename)
	   {
	     InputStream in = null;
	     FileOutputStream out = null;
	     String path = DATA_PATH + "/"+filename; // data/data目录
	     File file = new File(path);
	     if (!file.exists()) {
	        try
	        {
	          in = this.getAssets().open(filename); // 从assets目录下复制
	          out = new FileOutputStream(file);
	          int length = -1;
	          byte[] buf = new byte[1024];
	          while ((length = in.read(buf)) != -1)
	          {
	             out.write(buf, 0, length);
	          }
	          out.flush();
	        }
	        catch (Exception e)
	        {
	          e.printStackTrace();
	        }
	        finally{
	          if (in != null)
	          {
	             try {
	 
	               in.close();
	 
	             } catch (IOException e1) {
	 
	               // TODO Auto-generated catch block
	 
	               e1.printStackTrace();
	             }
	          }
	          if (out != null)
	          {
	             try {
	               out.close();
	             } catch (IOException e1) {
	               // TODO Auto-generated catch block
	               e1.printStackTrace();
	             }
	          }
	        }
	     }
	   }
	   
    */

}
