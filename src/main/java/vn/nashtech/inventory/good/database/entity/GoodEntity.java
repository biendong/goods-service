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
}
