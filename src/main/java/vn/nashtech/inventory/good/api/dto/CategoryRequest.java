package vn.nashtech.inventory.good.api.dto;

import java.util.Date;

public class CategoryRequest {
  private String categoryCode;
  private String categoryName;
  private String categoryDescription;
  private Date createDate;
  private Date modifyDate;
  public String getCategoryCode() {
    return categoryCode;
  }
  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }
  public String getCategoryName() {
    return categoryName;
  }
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }
  public String getCategoryDescription() {
    return categoryDescription;
  }
  public void setCategoryDescription(String categoryDescription) {
    this.categoryDescription = categoryDescription;
  }
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }
  public Date getModifyDate() {
    return modifyDate;
  }
  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }
  
  
}
