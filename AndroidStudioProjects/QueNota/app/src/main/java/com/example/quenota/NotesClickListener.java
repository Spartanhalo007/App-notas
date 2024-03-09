package com.example.quenota;

import androidx.cardview.widget.CardView;

import com.example.quenota.Models.Notes;

public interface NotesClickListener {
    void onClick (Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
