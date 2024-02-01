package com.example.hw.controllers;

import com.example.hw.Services.NoteService;
import com.example.hw.models.Note;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class NoteController {

    private NoteService noteService;

    @GetMapping("/main")
    public String showName(@RequestParam("name") String name,
                            Model model) {
        model.addAttribute("name", name);
        return "main";
    }

    @GetMapping("/notes")
    public String getNotes(Model model) {
        model.addAttribute("notes", noteService.getAllNotes());
        return "notes";
    }

    @PostMapping("/notes")
    public String addNewNote(Note note, Model model) {
        noteService.addNewNote(note);
        model.addAttribute("notes", noteService.getAllNotes());
        return "notes";
    }
}
