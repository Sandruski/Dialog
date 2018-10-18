package info.sandraag.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    public void onFireMissiles(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Els nostres recursos comencen per R
        builder.setTitle(R.string.confirmation)
            .setMessage(R.string.fire_missiles_confirmation)
            .setPositiveButton(R.string.fire, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(DialogActivity.this, "You have fired the missiles!", Toast.LENGTH_SHORT).show();
                }
            })
        // Els recursos d'Android comencen per android.R
            .setNegativeButton(android.R.string.cancel, null);

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
