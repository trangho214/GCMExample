package gofordroid.com.gcmexample;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Administrator on 09/06/2015.
 */
public class AlertDialogManager {
    public void showAlertDialog(Context context, String title, String message, Boolean status)
    {
        AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
        if(status != null)
            alertDialog.setIcon((status)? R.drawable.abc_ic_ab_back_mtrl_am_alpha: R.drawable.abc_ic_go_search_api_mtrl_alpha);
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        alertDialog.show();
    }
}
