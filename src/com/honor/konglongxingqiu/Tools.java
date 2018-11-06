package com.honor.konglongxingqiu;

import java.io.File;
import java.io.FileInputStream;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;

public class Tools{
	
	
	//閸ュ墽澧栨稉濠佺炊閸︽澘锟�?
	public static final String UPLOAD_URL = "http://android.vividworld.cn/MobileUploadFile";
	
	//閸ュ墽澧栭弰鍓с仛閹峰吋甯撮崜宥囩�?
	public static final String SHOW_URL = "http://android.vividworld.cn/extImage";	
	
	//閸掑棔闊╃捄瀹犳祮WAP妞や絻绻涢幒锟�?	public static final String WAP_URL = "http://android.vividworld.cn/sdsj.jsp?img=";		

	public static boolean fileIsExists(String path){
        try{                        
           File f=new File(path);                        
           if(!f.exists()){                                
               return false;                        
            }                                        
        }catch (Exception e) {                        
        // TODO: handle exception                        
            return false;                
        }                
        return true;        
    }	
	
	public static void createDir(String path){
		try{                        
	           File dir = new File(path);                        
	           if(!dir.exists()){                                
	                  dir.mkdir();                    
	            }                                        
	        }catch (Exception e) {                        
	        // TODO: handle exception                        
	                       
	        }                
	}
	
	
	/*** 閼惧嘲褰囬弬鍥︽婢堆冪�? ***/
	public static long getFileSizes(String path) throws Exception { 
	     long s = 0; 
		 try {
				File f=new File(path);
				 if (f.exists()) { 
				 FileInputStream fis = null; 
				 fis = new FileInputStream(f); 
				 s = fis.available(); 
				 fis.close();
				 } else { 
				 f.createNewFile(); 
				 }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	    return s; 
	} 
	
	//閼惧嘲褰囬幍瀣簚SD閸椔ょ熅瀵帮�?
	public static String getSDPath(){ 
	       File sdDir = null; 
	       boolean sdCardExist = Environment.getExternalStorageState()   
	                           .equals(Environment.MEDIA_MOUNTED);   //閸掋倖鏌噑d閸椻剝妲搁崥锟�?锟斤拷閸︼拷
	       if   (sdCardExist)   
	       {                               
	         sdDir = Environment.getExternalStorageDirectory();//閼惧嘲褰囩捄鐔烘窗瑜帮拷
	       }   
	       return sdDir.toString(); 
	       
	} 	
	
	//閸掋倖鏌囪ぐ鎾冲閹靛锟�?锟斤拷鎴犵捕缁锟�??
	public static int getConnectedType(Context context) {  
	    if (context != null) {  
	        ConnectivityManager mConnectivityManager = (ConnectivityManager) context  
	                .getSystemService(Context.CONNECTIVITY_SERVICE);  
	        NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();  
	        if (mNetworkInfo != null && mNetworkInfo.isAvailable()) {  
	            return mNetworkInfo.getType();  
	        }  
	    }  
	    return -1;  
	}
	
	//閸掋倖鏌囬弰顖氭儊閺堝缍夌紒婊嗙箾閹猴�?
	public static boolean isNetworkConnected(Context context) {  
	    if (context != null) {  
	        ConnectivityManager mConnectivityManager = (ConnectivityManager) context  
	                .getSystemService(Context.CONNECTIVITY_SERVICE);  
	        NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();  
	        if (mNetworkInfo != null) {  
	            return mNetworkInfo.isAvailable();  
	        }  
	    }  
	    return false;  
	}
	
	//閸掋倖鏌嘩IFI閺勵垰鎯�?崣顖滄暏
	public static boolean isWifiConnected(Context context) {  
	    if (context != null) {  
	        ConnectivityManager mConnectivityManager = (ConnectivityManager) context  
	                .getSystemService(Context.CONNECTIVITY_SERVICE);  
	        NetworkInfo mWiFiNetworkInfo = mConnectivityManager  
	                .getNetworkInfo(ConnectivityManager.TYPE_WIFI);  
	        if (mWiFiNetworkInfo != null) {  
	            return mWiFiNetworkInfo.isAvailable();  
	        }  
	    }  
	    return false;  
	}
	
	//閸掋倖鏌囬幍瀣簚缂冩垹绮堕弰顖氭儊閸欘垳锟�??
	public static boolean isMobileConnected(Context context) {  
	    if (context != null) {  
	        ConnectivityManager mConnectivityManager = (ConnectivityManager) context  
	                .getSystemService(Context.CONNECTIVITY_SERVICE);  
	        NetworkInfo mMobileNetworkInfo = mConnectivityManager  
	                .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);  
	        if (mMobileNetworkInfo != null) {  
	            return mMobileNetworkInfo.isAvailable();  
	        }  
	    }  
	    return false;  
	}
	//閼惧嘲褰囬懛顏勭暰鐠侯垰绶為崶鍓у鐠у嫭锟�??
	public static Bitmap getBitmap(String path)
	{
		File mFile=new File(path);
        //閼汇儴顕氶弬鍥︽鐎涙ê锟�??
        if (mFile.exists()) {
            Bitmap bitmap=BitmapFactory.decodeFile(path);
            return bitmap;
        }
        return null;
	}	
	
}