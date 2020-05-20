package com.example.apptimnhatro;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class AccountFragment extends Fragment {


    public AccountFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_account, container, false);
        Button button = (Button) v.findViewById(R.id.btn_Try);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonSignInClicked(v);
            }
        });
        return v;
    }
    public void buttonSignInClicked (View view) {
        Intent intent=new Intent(getActivity(),LoginActivity.class);
        startActivity(intent);

    }

}
