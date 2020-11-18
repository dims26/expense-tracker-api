package com.dims.expensetrackerapi.services;

import com.dims.expensetrackerapi.domain.Category;
import com.dims.expensetrackerapi.exceptions.EtBadRequestException;
import com.dims.expensetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryService {

    List<Category> fetchAllCategories(Integer userId);
    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;
    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;
    void removeCategoryWithAllTransactions(Integer userID, Integer categoryId) throws EtResourceNotFoundException;
}
