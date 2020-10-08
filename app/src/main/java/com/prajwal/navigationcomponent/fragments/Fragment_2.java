package com.prajwal.navigationcomponent.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;


//import com.prajwal.navigationcomponent.Fragment_Screen_2.Fragment_2Args;
import com.prajwal.navigationcomponent.R;

/**
 * Created by Prajwal Waingankar
 * on 06-Oct-20.
 * Github: prajwalmw
 */


public class Fragment_2 extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_screen_2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        NavDirections navDirections = Fragment_1Directions.actionFragment1ToFragment2().;
//        Navigation.findNavController(view).navigate(navDirections);
//        String toast_message = new Fragment_1Args.Builder().getArg1();
//
        //correct code...
//        if(getArguments() != null)
//        {
//            String toast_message = Fragment_2Args.fromBundle(getArguments()).getArg1();
//            Toast.makeText(view.getContext(), "Message: "+ toast_message, Toast.LENGTH_SHORT).show();
//        }



    }
}
