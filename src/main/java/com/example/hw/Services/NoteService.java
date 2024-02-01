package com.example.hw.Services;

import com.example.hw.models.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteService {
    List<Note> notes = new ArrayList<>();

    public void addNewNote(Note note) {
        notes.add(note);
    }

    public List<Note> getAllNotes() {
        return notes;
    }

}
