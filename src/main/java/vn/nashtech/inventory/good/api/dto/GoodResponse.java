package vn.nashtech.inventory.good.api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoodResponse {
    private Long id;
    private String productCode;
    private String productName;
    private String productDescription;
    private Integer unitId;
    /**
     * @return the id
     */
    public Long getId() {
      return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
      this.id = id;
    }
    /**
     * @return the productCode
     */
    public String getProductCode() {
      return productCode;
    }
    /**
     * @param productCode the productCode to set
     */
    public void setProductCode(String productCode) {
      this.productCode = productCode;
    }
    /**
     * @return the productName
     */
    public String getProductName() {
      return productName;
    }
    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
      this.productName = productName;
    }
    /**
     * @return the productDescription
     */
    public String getProductDescription() {
      return productDescription;
    }
    /**
     * @param productDescription the productDescription to set
     */
    public void setProductDescription(String productDescription) {
      this.productDescription = productDescription;
    }
    /**
     * @return the unitId
     */
    public Integer getUnitId() {
      return unitId;
    }
    /**
     * @param unitId the unitId to set
     */
    public void setUnitId(Integer unitId) {
      this.unitId = unitId;
    }
    
    
}
