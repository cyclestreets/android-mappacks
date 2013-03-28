package net.cyclestreets.maps.czprague;

import android.content.Context;

import com.google.android.vending.expansion.downloader.impl.DownloadNotification;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;

// Extends com.google.android.vending.expansion.downloader.impl.DownloaderService class and override three methods.
public class MapFileDownloaderService extends DownloaderService
{
   // the Base64-encoded RSA public key for your publisher account
   private static final String PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAifqFvadouMWeZnGj9LQYNRliBcI0jfbN9N/hSrQAuerRDIaykbxrlnIFRE0TNZM/zbkx/38m/x3WXlZpiZ5hKaNHHeTgTUUGhFDserVKdNfwXKhi/G4YLu9v+2F+H9/XjtEEHB39PqjyGZwKCnED6Q69643YcOGopFfSQ2rfoDQClBuLvVp3VjwXwxryOsbXeJ1fEGKuZelAz6Sxo84inf4ZvS12S4JydfkR1ZN0S21Ai0eFlrY3huCq076D1Jibrstp863EgBX7On39dC5IDDKqFW0/3XcLB94cC5ukcKIfmc403vT+hvyxe1DYsd4TxdRcpY3TDFC/Lm7feSlJ2QIDAQAB";
   // Generate 20 random bytes, and put them here.
   private static final byte[] SALT = new byte[] { 125, 87, 122, 18, 99,
                                                   -12, 87, 13, 12, 5,
                                                   112, 74, 19 -2, -1,
                                                   12, 33, 48, 12, 63 };

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