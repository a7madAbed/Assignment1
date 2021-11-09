package model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.R;

import java.util.ArrayList;

public class ExerciseAdapter extends ArrayAdapter<Exercise> {
    private Context mContext;
    private int mResource;
    public ExerciseAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Exercise> objects) {
        super(context, resource, objects);
        this.mContext=context;
        this.mResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource,parent,false);
        ImageView imageView = convertView.findViewById(R.id.imgExercise);
        TextView txtName = convertView.findViewById(R.id.txtvExerciseName);
        TextView txtTime = convertView.findViewById(R.id.txtvTime);
        imageView.setImageResource(getItem(position).getImage());
        int min=getItem(position).getSeconds()/60;
        int sec=getItem(position).getSeconds()%60;
        txtName.setText(getItem(position).getName());
        txtTime.setText(min +" : "+sec);
        return convertView;
    }
}
