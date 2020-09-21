package com.journals.iomcworld.ui.fragments;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.snackbar.Snackbar;
import com.journals.iomcworld.R;
import com.journals.iomcworld.databinding.FragmentJournalContactBinding;
import com.journals.iomcworld.model.ContactResponse;
import com.journals.iomcworld.ui.viewmodel.JournalListViewModel;


import java.util.Objects;

public class JournalContactFragment extends Fragment implements View.OnClickListener {

    FragmentJournalContactBinding fragmentContactBinding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fragmentContactBinding = FragmentJournalContactBinding.inflate(getLayoutInflater(), container, false);

        fragmentContactBinding.txtDailUK.setOnClickListener(this);
        fragmentContactBinding.txtmail.setOnClickListener(this);


        return fragmentContactBinding.getRoot();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txtDailUK:
                Intent intent1 = new Intent(Intent.ACTION_DIAL);
                String temp1 = "tel:" + fragmentContactBinding.txtDailUK.getText().toString();
                intent1.setData(Uri.parse(temp1));
                startActivity(intent1);
                break;
            case R.id.txtmail:
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{fragmentContactBinding.txtmail.getText().toString()});

                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (ActivityNotFoundException ex) {
                    Toast.makeText(requireActivity(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
                break;



        }
    }


}