package vn.nashtech.inventory.good.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import vn.nashtech.inventory.good.api.dto.CategoryRequest;
import vn.nashtech.inventory.good.database.entity.CategoryEntity;
import vn.nashtech.inventory.good.database.repository.CategoryRepository;
import vn.nashtech.inventory.good.service.CategoryService;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService{

  private final CategoryRepository categoryRepository;

  @Autowired
  public CategoryServiceImpl(CategoryRepository categoryRepository) {
      this.categoryRepository = categoryRepository;
  }

  @Override
  public void create(CategoryRequest req) {
    CategoryEntity entity = new CategoryEntity();
      mapperData(entity, req);
      categoryRepository.save(entity);
  }

  @Override
  public CategoryEntity updateCategory(Long id, CategoryRequest req) {
      CategoryEntity category = categoryRepository.findById(id).orElse(null);
      if (category != null) {
          mapperData(category, req);
          return categoryRepository.save(category);
      }
      return null;
  }

  @Override
  public void deleteCategory(Long id) {
      categoryRepository.deleteById(id);
  }

  private void mapperData(CategoryEntity category, CategoryRequest req) {
    category.setCategoryCode(req.getCategoryCode());
    category.setCategoryName(req.getCategoryName());
    category.setCategoryDescription(req.getCategoryDescription());
    category.setCreateDate(req.getCreateDate());
    category.setModifyDate(req.getModifyDate());
  }
}
