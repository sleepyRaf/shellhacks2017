package com.sharedinterestsapp.shellhacks2017;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Raf on 10/1/2017.
 */

public class InterestAdapter extends ArrayAdapter<Interest> {


    public InterestAdapter(@NonNull Context context, @NonNull List objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        View interestItemView = convertView;
        if (interestItemView == null) {
            interestItemView = LayoutInflater.from(getContext()).inflate(R.layout.interest_list_item, parent, false);
        }

        Interest currentInterest = getItem(position);

        int currentIcon = currentInterest.getIconId();
        String currentText = currentInterest.getInterestText();

        ImageView icon = (ImageView) interestItemView.findViewById(R.id.icon);
        TextView interestText = (TextView) interestItemView.findViewById(R.id.interest_text);

        icon.setImageResource(currentIcon);
        interestText.setText(currentText);

        return interestItemView;
    }
}
