package trafficlightgrupomaya.mayaseguridad.mx.pruebafragment;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by codeman on 24/11/17.
 */

public class LoginDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return createLoginDialog();
    }

    public AlertDialog createLoginDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();

        View view = inflater.inflate(R.layout.dialog_siginin,null);

        builder.setView(view);

        return builder.create();
    }
}
