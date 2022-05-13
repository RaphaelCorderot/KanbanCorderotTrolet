package com.example.Repository;

import com.example.Models.Kanban;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KanbanRepository extends JpaRepository<Kanban, Integer> {
}