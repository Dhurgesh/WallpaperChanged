package sg.edu.rp.c346.wallpaperchanged;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * Created by 16033265 on 8/13/2018.
 */

public class NewBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        int selectionid = preferences.getInt("selectionid",R.id.radioButton1);
        if(selectionid == R.id.radioButton1){
            Toast toastUp = Toast.makeText(context,R.string.selection1,Toast.LENGTH_LONG);
            toastUp.show();
        }
        else{
            Toast toastDown = Toast.makeText(context,R.string.selection2,Toast.LENGTH_LONG);
            toastDown.show();
        }
    }
}