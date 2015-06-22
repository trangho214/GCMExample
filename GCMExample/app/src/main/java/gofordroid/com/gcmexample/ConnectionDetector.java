package gofordroid.com.gcmexample;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Administrator on 09/06/2015.
 */
public class ConnectionDetector {
    Context _context;
    public ConnectionDetector(Context context)
    {
        this._context = context;
    }

    public boolean isConnectingToInternet()
    {
        ConnectivityManager connectivityManager = (ConnectivityManager)_context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager!= null)
        {
            NetworkInfo[] infos = connectivityManager.getAllNetworkInfo();
            if(infos!= null)
                for (int i = 0; i< infos.length; i++)
                {
                    if(infos[i].getState() == NetworkInfo.State.CONNECTED)
                    {
                        return true;
                    }
                }
        }
        return false;
    }
}
