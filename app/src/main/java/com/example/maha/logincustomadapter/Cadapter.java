package com.example.maha.logincustomadapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Maha on 13/09/2017.
 */

public class Cadapter extends ArrayAdapter<CModel> {
    public Cadapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<CModel> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
        }

        CModel cModel = getItem(position);
        EditText editText = (EditText) convertView.findViewById(R.id.editText);
        Button btnPinding = (Button) convertView.findViewById(R.id.pinding);
        CheckBox checkBox = (CheckBox) convertView.findViewById(R.id.checkBox);
        editText.setText(cModel.getNote());
        btnPinding.setText(cModel.getBody());
        checkBox.setChecked(true);

        return convertView;


    }
}
