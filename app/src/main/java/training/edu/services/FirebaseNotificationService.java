package training.edu.services;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import training.edu.droidbountyhunter.Home;
import training.edu.droidbountyhunter.R;
import training.edu.utils.NotifyManager;

/**
 * @author Giovani Gonzalez
 * Created by darkgeat on 8/31/17.
 */

public class FirebaseNotificationService extends FirebaseMessagingService {

    private static final String TAG = FirebaseNotificationService.class.getSimpleName();

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.w(TAG, "From: " + remoteMessage.getFrom());
        Log.w(TAG, "Notification Message Body: " + remoteMessage.getNotification().getBody());

        NotifyManager manager = new NotifyManager();
        manager.enviarNotificacion(this, Home.class, remoteMessage.getNotification().getBody(), "Notificacion Push", R.mipmap.ic_launcher,0);

    }
}
