package ru.gb.course1.notebookonfragment.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.gb.course1.notebookonfragment.R;


public class NotesListFragment extends Fragment {


    public NotesListFragment() {
        // Required empty public constructor
    }


    public static NotesListFragment newInstance() {

        return new NotesListFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notes_list, container, false);
    }
}