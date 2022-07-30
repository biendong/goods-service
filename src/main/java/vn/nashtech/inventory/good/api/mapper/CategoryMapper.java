package vn.nashtech.inventory.good.api.mapper;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import vn.nashtech.inventory.good.api.dto.CategoryResponse;
import vn.nashtech.inventory.good.api.dto.GoodResponse;
import vn.nashtech.inventory.good.database.entity.CategoryEntity;

public class CategoryMapper {

  public List<CategoryResponse> mapToListRS(List<CategoryEntity> categoryEntities){
    if (categoryEntities == null || categoryEntities.isEmpty()) {
      return Collections.emptyList();
  }
  return categoryEntities.stream().map(this::mapToRS).filter(Objects::nonNull)
          .collect(Collectors.toList());
  }
  
  public CategoryResponse mapToRS(CategoryEntity category) {
    if (category == null) {
      return null;
  }
  CategoryResponse categoryResponse = new CategoryResponse();
  categoryResponse.setId(category.getId());
  categoryResponse.setCategoryCode(category.getCategoryCode());
  categoryResponse.setCategoryName(category.getCategoryName());
  categoryResponse.setCategoryDescription(category.getCategoryDescription());
  categoryResponse.setCreateDate(category.getCreateDate());
  categoryResponse.setModifyDate(category.getModifyDate());
  return categoryResponse;
  }
}
