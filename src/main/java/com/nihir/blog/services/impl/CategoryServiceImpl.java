package com.nihir.blog.services.impl;

import com.nihir.blog.domain.entities.Category;
import com.nihir.blog.repos.CategoryRepo;
import com.nihir.blog.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;

    @Override
    public List<Category> listCategories() {

        return categoryRepo.findAllWithPostCount();
    }
}
