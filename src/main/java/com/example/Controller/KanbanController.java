package com.example.Controller;

import com.example.Models.Kanban;
import com.example.Repository.KanbanRepository;
import com.example.Service.KanbanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class KanbanController {
    @Autowired
    private KanbanRepository kanbanRepository;

    @GetMapping("/kanban")
    public Kanban getKanban(@RequestParam int id) {
        return this.kanbanRepository.getById(id);
    }
    @PostMapping("/kanban")
    public Kanban SetKanban(@RequestBody Kanban kanban)
    {
        try{
            var toto =  this.kanbanRepository.save(kanban);
            return toto;
        }catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
}
