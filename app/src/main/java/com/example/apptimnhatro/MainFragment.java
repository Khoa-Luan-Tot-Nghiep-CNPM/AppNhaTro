package com.example.apptimnhatro;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }

    ViewFlipper viewFlipper;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_main, container, false);

        int image[]= {R.drawable.slide1,R.drawable.slide2,R.drawable.slide3};
        viewFlipper=(ViewFlipper)v.findViewById(R.id.vf_image_slider);

        for (int i=0;i<image.length;i++) {
            flipperImage(image[i]);
        }

        Button button = (Button) v.findViewById(R.id.btn_findRoom);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonFindClicked(v);
            }
        });

        Button btn_addPost = (Button) v.findViewById(R.id.btn_addPost);

        btn_addPost.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonAddPostClicked(v);
            }
        });

        return v;
    }

    public void buttonFindClicked (View view) {
        Intent intent=new Intent(getActivity(),FindRoomActivity.class);
        startActivity(intent);

    }

    public void buttonAddPostClicked (View view) {
        Intent intent=new Intent(getActivity(),AddPostActivity.class);
        startActivity(intent);

    }

    public void flipperImage(int image){
        ImageView imageView=new ImageView(getActivity());
        imageView.setBackgroundResource(image);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.setAutoStart(true);

        //animation

        viewFlipper.setInAnimation(getActivity(),android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(getActivity(),android.R.anim.slide_out_right);

    }



}
