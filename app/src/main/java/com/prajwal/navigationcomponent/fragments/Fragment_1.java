package com.prajwal.navigationcomponent.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.prajwal.navigationcomponent.R;

/**
 * Created by Prajwal Waingankar
 * on 06-Oct-20.
 * Github: prajwalmw
 */


public class Fragment_1 extends Fragment {
Button button;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_screen_1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        button = view.findViewById(R.id.button);
        button.setOnClickListener(v -> {

//            NavController navController = new NavController(this.getContext());
//            navController.navigate(R.id.fragment_2);

//            new Fragment_1Args.Builder().setArg1("Hello Prajwal !!!");

//            NavDirections action =
//                    Fragment_1Directions.actionFragment1ToFragment2();


//            new Fragment_1Args.Builder().setArg1("Hello Prajwal !!!").build();


//            NavDirections action = Fragment_1Directions.actionFragment1ToFragment2().setArg1("Hello Prajwal !!!!");
//            Navigation.findNavController(view).navigate(action);

        });
    }
}
