package net.cyclestreets.maps.uk;

import com.google.android.vending.expansion.downloader.DownloaderClientMarshaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

public class MapFileAlarmReceiver extends BroadcastReceiver 
{
  @Override 
  public void onReceive(Context context, Intent intent) 
  {
    try 
    {
      DownloaderClientMarshaller.startDownloadServiceIfRequired(
         context, intent, MapFileDownloaderService.class);
    } 
    catch (NameNotFoundException e) 
    {
      Log.e("apk-expansion-files", "NameNotFoundException occurred. " + e.getMessage(), e);
    }
  } // onReceive
} // class MapFileAlarmReceiver