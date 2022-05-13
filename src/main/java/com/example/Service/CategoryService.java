package com.example.Service;

import com.example.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
}
