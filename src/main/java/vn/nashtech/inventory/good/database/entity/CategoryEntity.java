package vn.nashtech.inventory.good.database.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;
import lombok.Setter;
import vn.nashtech.inventory.good.database.model.Category;

@Entity
@Table(name =  "category")
@DynamicUpdate
@Setter
public class CategoryEntity extends Category{

  @Id
  @Column(name = "id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long getId() {return super.getId();}

  @Override
  @Column(name = "code")
  public String getCategoryCode() {return super.getCategoryCode();}

  @Override
  @Column(name = "name")
  public String getCategoryName() {return super.getCategoryName();}

  @Override
  @Column(name = "description")
  public String getCategoryDescription() {return super.getCategoryDescription();}

  @Override
  @Column(name = "create")
  public Date getCreateDate() { return super.getCreateDate(); }
  
  @Override
  @Column(name = "modify")
  public Date getModifyDate() { return super.getModifyDate(); }
  
}
