package com.iit.ex1.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.iit.ex1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private ImageView mMainImage;
    private ImageView mHatImage;
    private ImageView mLunetImage;
    private ImageView mBarbImage;
    public MainFragment() {    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        mMainImage = (ImageView) view.findViewById(R.id.main_image);
        mMainImage.setImageResource(R.drawable.main_photo);
        mHatImage = (ImageView) view.findViewById(R.id.hat_image);

        mLunetImage = (ImageView) view.findViewById(R.id.lunet_image);

        mBarbImage = (ImageView) view.findViewById(R.id.barb_image);
    }

    public void setComponent(int controlId) {
        switch (controlId) {
            case R.id.radio_button_none:
                mHatImage.setVisibility(View.GONE);

                mLunetImage.setVisibility(View.GONE);

                mBarbImage.setVisibility(View.GONE);
                break;
            case R.id.radio_button_hat_panama:
                mHatImage.setVisibility(View.VISIBLE);
                mHatImage.setImageResource(R.drawable.chapeau_1);
                break;

            case R.id.radio_button_lunette:
                mLunetImage.setVisibility(View.VISIBLE);
                mLunetImage.setImageResource(R.drawable.lunette);
                break;

            case R.id.radio_button_barbe:
                mBarbImage.setVisibility(View.VISIBLE);
                mBarbImage.setImageResource(R.drawable.barbe);
                break;
        }
    }
}
