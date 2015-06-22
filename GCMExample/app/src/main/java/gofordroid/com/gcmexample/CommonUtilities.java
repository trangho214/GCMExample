package gofordroid.com.gcmexample;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Administrator on 09/06/2015.
 */
public class CommonUtilities {
    static final String SERVER_URL ="http://trangho214-001-site3.smarterasp.net/register.php";
    static final String SENDER_ID = "564354625071";
    /**
     * Tag used on log messages.
     */
    static final String TAG ="GCM Example";
    static final String DISPLAY_MESSAGE_ACTION ="gofordroid.com.gcmexample.DISPLAY_MESSAGE";

    static final String EXTRA_MESSAGE = "message";

    static void displayMessage(Context context, String message)
    {
        Intent intent = new Intent(DISPLAY_MESSAGE_ACTION);
        intent.putExtra(EXTRA_MESSAGE, message);
        context.sendBroadcast(intent);

    }
}
