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
}
