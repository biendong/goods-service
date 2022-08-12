package vn.nashtech.inventory.good.database.entity;

import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import vn.nashtech.inventory.good.database.model.Good;

import javax.persistence.*;

@Entity
@Table(name = "good")
@DynamicUpdate
@Setter
public class GoodEntity extends Good {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {return super.getId();}

    @Override
    @Column(name = "product_code")
    public String getProductCode() {return super.getProductCode();}

    @Override
    @Column(name = "product_name")
    public String getProductName() {return super.getProductName();}

    @Override
    @Column(name = "product_description")
    public String getProductDescription() {return super.getProductDescription();}

    @Override
    @Column(name = "unit_id")
    public Integer getUnitId() { return super.getUnitId(); }
    
    

}
