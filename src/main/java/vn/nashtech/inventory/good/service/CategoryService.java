package vn.nashtech.inventory.good.service;

import vn.nashtech.inventory.good.api.dto.CategoryRequest;
import vn.nashtech.inventory.good.database.entity.CategoryEntity;

public interface CategoryService {

  void create(CategoryRequest req);
  CategoryEntity updateCategory(Long id, CategoryRequest req);
  void deleteCategory(Long id);
  
}
