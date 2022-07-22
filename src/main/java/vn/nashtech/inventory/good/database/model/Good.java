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
}
