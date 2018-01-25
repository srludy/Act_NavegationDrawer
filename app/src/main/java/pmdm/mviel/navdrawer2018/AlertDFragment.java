package pmdm.mviel.navdrawer2018;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class AlertDFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
            // Set Dialog Icon
            .setIcon(R.drawable.ic_menu_send)
            // Set Dialog Title
            .setTitle("Alert DialogFragment")
            // Set Dialog Message
            .setMessage("Alert DialogFragment Tutorial")

            // Positive button
            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // Do something else
                }
            }).create();
    }
}