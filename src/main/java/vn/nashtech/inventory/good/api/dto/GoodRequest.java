package vn.nashtech.inventory.good.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoodRequest {
    private String productCode;
    private String productName;
    private String productDescription;
    private Integer unitId;
    public String getProductCode() {
      return productCode;
    }
    public void setProductCode(String productCode) {
      this.productCode = productCode;
    }
    public String getProductName() {
      return productName;
    }
    public void setProductName(String productName) {
      this.productName = productName;
    }
    public String getProductDescription() {
      return productDescription;
    }
    public void setProductDescription(String productDescription) {
      this.productDescription = productDescription;
    }
    public Integer getUnitId() {
      return unitId;
    }
    public void setUnitId(Integer unitId) {
      this.unitId = unitId;
    }
    
    
}
