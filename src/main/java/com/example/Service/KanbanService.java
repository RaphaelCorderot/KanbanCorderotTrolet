package com.example.Service;

import com.example.Models.Kanban;
import com.example.Repository.KanbanRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class KanbanService {
    @Autowired
    private KanbanRepository kanbanRepository;

    public Kanban SaveAndUpdate(Kanban kanban)
    {
        return this.kanbanRepository.save(kanban);
    }
    public Kanban GetKanban(int id)
    {
        return this.kanbanRepository.getById(id);
    }
}
