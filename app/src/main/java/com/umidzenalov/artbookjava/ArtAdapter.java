package com.umidzenalov.artbookjava;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.umidzenalov.artbookjava.databinding.RecyclerViewBinding;

import java.util.ArrayList;

public class ArtAdapter extends RecyclerView.Adapter<ArtAdapter.ArtHolder>{
    ArrayList<Art> artArrayList;
    public ArtAdapter(ArrayList<Art> artArrayList){
        this.artArrayList = artArrayList;
    }

    @NonNull
    @Override
    public ArtHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ArtHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return artArrayList.size();
    }

    public class ArtHolder extends RecyclerView.ViewHolder{
        private  RecyclerViewBinding  binding;

        public ArtHolder(RecyclerViewBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }
}
