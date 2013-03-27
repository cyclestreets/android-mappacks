package net.cyclestreets.maps.uk;

import android.content.Context;

import com.google.android.vending.expansion.downloader.impl.DownloadNotification;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;

// Extends com.google.android.vending.expansion.downloader.impl.DownloaderService class and override three methods.
public class MapFileDownloaderService extends DownloaderService 
{
   // the Base64-encoded RSA public key for your publisher account
   private static final String PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAh/VB2RFxiXs1ZDuKndP6+qMJAXOrrhSG8tiNYxuK6gUz5gIkCgC6/ARWZbO522ukm1J+aizEAp+mgdZ/JQ2f34nZ6kYmmgfqZ8KfRVN81gv6nltqIyk1Eb4Nn1rlPu27zvSfRjjAUJOVbsCOL4iMcMguoMUZy6TtN41uTw5YvPRtV1hLNOrdefM/zJpqa2L+6Wmy9ARpbhdTE8PmmGLGKOVcnhOoZyzsAJMHVBjX9NU72bVgjMoLxaNbw84lMPqZCi2jm0grg4jjPLsoIb3QzVh8PNnIqIXj7zLuvarbuxyKxbDS1QNwpvHhqnmkTGJedlGFtdA7L9ms1v1piJax9wIDAQAB";
   // Generate 20 random bytes, and put them here.
   private static final byte[] SALT = new byte[] { 125, 87, 122, 18, 88, 
                                                   -12, 43, 13, 12, 5, 
                                                   112, 74, 19 -2, -1,
                                                   12, 33, 48, 12, 12 };
   
   @Override 
   protected String getPublicKey() {
     return PUBLIC_KEY;
   }
   
   @Override 
   protected byte[] getSALT() {
     return SALT;
   }
   
   @Override
   protected DownloadNotification createDownloadNotification(final Context context,
                                                             final CharSequence label)
   {
     return new MapsDownloadNotification(context, label);
   } // createDownloadNotification
   
   @Override 
   protected String getAlarmReceiverClassName() {
     return MapFileAlarmReceiver.class.getName();
   }
} // class MapFileDownloaderService