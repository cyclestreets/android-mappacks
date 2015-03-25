package net.cyclestreets.maps.uk;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

import com.google.android.vending.expansion.downloader.DownloadProgressInfo;
import com.google.android.vending.expansion.downloader.IDownloaderClient;
import com.google.android.vending.expansion.downloader.impl.DownloadNotification;

public class MapsDownloadNotification extends DownloadNotification
{
  public MapsDownloadNotification(Context ctx, CharSequence applicationLabel)
  {
    super(ctx, applicationLabel);
  } // MapDownloadNotification
  
  @Override
  public void onDownloadStateChanged(int newState) 
  {
    super.onDownloadStateChanged(newState);
    
    Intent intent = new Intent("download");
    intent.putExtra("text", currentText());
    intent.putExtra("complete", IDownloaderClient.STATE_COMPLETED == newState);
    
    LocalBroadcastManager.getInstance(context()).sendBroadcast(intent);
  } // onDownloadStateChanged
  
  @Override
  public void onDownloadProgress(DownloadProgressInfo progress) 
  {
    super.onDownloadProgress(progress);
    
    Intent intent = new Intent("download");
    intent.putExtra("currentbytes", progress.mOverallProgress);
    intent.putExtra("totalbytes", progress.mOverallTotal);
    intent.putExtra("time", progress.mTimeRemaining);
    
    LocalBroadcastManager.getInstance(context()).sendBroadcast(intent);
  } // onDownloadStateChanged
} // class MapsDownloadNotification
