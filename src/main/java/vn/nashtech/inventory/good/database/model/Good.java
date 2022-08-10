package vn.nashtech.inventory.good.database.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Good {
    private Long id;
    private String productCode;
    private String productName;
    private String productDescription;
    private Integer unitId;
    public Long getId() {
      return id;
    }
    public String getProductCode() {
      return productCode;
    }
    /**
     * @return the productName
     */
    public String getProductName() {
      return productName;
    }
    /**
     * @return the productDescription
     */
    public String getProductDescription() {
      return productDescription;
    }
    /**
     * @return the unitId
     */
    public Integer getUnitId() {
      return unitId;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
      this.id = id;
    }
    /**
     * @param productCode the productCode to set
     */
    public void setProductCode(String productCode) {
      this.productCode = productCode;
    }
    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
      this.productName = productName;
    }
    /**
     * @param productDescription the productDescription to set
     */
    public void setProductDescription(String productDescription) {
      this.productDescription = productDescription;
    }
    /**
     * @param unitId the unitId to set
     */
    public void setUnitId(Integer unitId) {
      this.unitId = unitId;
    }
    
    
}
