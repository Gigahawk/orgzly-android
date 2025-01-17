package com.orgzly.android.ui.dialogs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.orgzly.R;
import com.orgzly.android.util.MiscUtils;

public class WhatsNewDialog {
    /**
     * Display dialog with changes.
     */
    public static AlertDialog create(Context context) {
        @SuppressLint("InflateParams") final View layoutView =
                ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                        .inflate(R.layout.dialog_whats_new, null, false);

        TextView view = ((TextView) layoutView.findViewById(R.id.dialog_whats_new_intro));
        view.setText(MiscUtils.fromHtml(context.getString(R.string.whats_new_intro)));
        view.setMovementMethod(LinkMovementMethod.getInstance());

        return new MaterialAlertDialogBuilder(context)
                .setTitle(R.string.whats_new_title)
                .setPositiveButton(R.string.ok, null)
                .setView(layoutView)
                .create();
    }
}
