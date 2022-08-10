package vn.nashtech.inventory.good.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import vn.nashtech.inventory.good.api.dto.CategoryRequest;
import vn.nashtech.inventory.good.api.dto.CategoryResponse;
import vn.nashtech.inventory.good.api.dto.GoodResponse;
import vn.nashtech.inventory.good.api.mapper.CategoryMapper;
import vn.nashtech.inventory.good.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

  private final CategoryService categoryService;
  private final CategoryMapper categoryMapper;
  
  @Autowired
  public CategoryController(CategoryService categoryService, CategoryMapper categoryMapper) {
      this.categoryService = categoryService;
      this.categoryMapper = categoryMapper;
  }

  @ApiOperation(value = "Create category", nickname = "createCategorysUsingPOST", notes = "", tags={ "category-controller" })
  @ApiResponses(value = {
          @ApiResponse(code = 200, message = "OK", response = GoodResponse.class),
          @ApiResponse(code = 201, message = "Created"),
          @ApiResponse(code = 401, message = "Unauthorized"),
          @ApiResponse(code = 403, message = "Forbidden"),
          @ApiResponse(code = 404, message = "Not Found") })
  @PostMapping("")
  public ResponseEntity<?> create(@ApiParam(value = "requestBody") @RequestBody CategoryRequest request){
    categoryService.create(request);
      return ResponseEntity.ok("success");
  }

  @ApiOperation(value = "Update category", nickname = "updateCategorysUsingGET", notes = "", response = GoodResponse.class, tags={ "category-controller", })
  @ApiResponses(value = {
          @ApiResponse(code = 200, message = "OK", response = GoodResponse.class),
          @ApiResponse(code = 201, message = "Created"),
          @ApiResponse(code = 401, message = "Unauthorized"),
          @ApiResponse(code = 403, message = "Forbidden"),
          @ApiResponse(code = 404, message = "Not Found") })
  @PutMapping("/{id}")
  public ResponseEntity<?> update(@ApiParam(value = "requestBody") @RequestBody CategoryRequest request, @ApiParam(value = "Category id",required=true) @PathVariable(value = "id") String id) {
      CategoryResponse response = categoryMapper.mapToRS(categoryService.updateCategory(Long.parseLong(id), request));
      return ResponseEntity.ok(response);
  }

  @ApiOperation(value = "Delete category", nickname = "deleteCategorysUsingGET", notes = "", tags={ "category-controller", })
  @ApiResponses(value = {
          @ApiResponse(code = 200, message = "OK", response = GoodResponse.class),
          @ApiResponse(code = 201, message = "Created"),
          @ApiResponse(code = 401, message = "Unauthorized"),
          @ApiResponse(code = 403, message = "Forbidden"),
          @ApiResponse(code = 404, message = "Not Found") })
  @DeleteMapping("{id}")
  public ResponseEntity<?> delete(@ApiParam(value = "Category id",required=true) @PathVariable(value = "id") String id) {
    categoryService.deleteCategory(Long.parseLong(id));
      return ResponseEntity.ok("success");
  }
}
