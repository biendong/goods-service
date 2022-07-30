package vn.nashtech.inventory.good.database.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
  private Long id;
  private String categoryCode;
  private String categoryName;
  private String categoryDescription;
  private Date createDate;
  private Date modifyDate;
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
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
