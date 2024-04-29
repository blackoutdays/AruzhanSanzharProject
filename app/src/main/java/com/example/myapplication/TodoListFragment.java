package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TodoListFragment extends Fragment {

    private RecyclerView recyclerView;
    private TodoListAdapter adapter;
    private List<String> todoList;

    public TodoListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_todo_list, container, false);

        // Initialize RecyclerView
        recyclerView = view.findViewById(R.id.recyclerViewToDoList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Initialize data
        initData();

        // Initialize adapter
        adapter = new TodoListAdapter(getContext(), todoList);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void initData() {
        // Dummy data for demonstration
        todoList = new ArrayList<>();
        todoList.add("Charynskiy Kan'on");
        todoList.add("Shymbulak");
        todoList.add("Almaty Zoo");
        todoList.add("Kolsai lakes National Natural Park");
    }
}
