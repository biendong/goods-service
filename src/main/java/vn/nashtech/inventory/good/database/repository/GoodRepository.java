package vn.nashtech.inventory.good.database.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.nashtech.inventory.good.database.entity.GoodEntity;

@Repository
public interface GoodRepository extends CrudRepository<GoodEntity, Long>  {
}
