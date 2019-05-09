package com.myapplicationdev.android.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class TaskAdapter {

    private ArrayList<Task> alTask;
    private Context context;
    TextView tvID, tvDesc, tvDate;

    public TaskAdapter(Context context, int resource, ArrayList<Task> objects) {
        super(context, resource, objects);
        alTask = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvID = rowView.findViewById(R.id.tvId);
        tvDesc = rowView.findViewById(R.id.tvDesc);
        tvDate = rowView.findViewById(R.id.tvDate);

        Task current = alTask.get(position);

        tvID.setText(Integer.toString(current.getId()));
        tvDesc.setText(current.getDescription());
        tvDate.setText(current.getDate());

        return rowView;

    }
}
