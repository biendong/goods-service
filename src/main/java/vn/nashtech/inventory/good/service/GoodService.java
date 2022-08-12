package vn.nashtech.inventory.good.service;

import vn.nashtech.inventory.good.api.dto.GoodRequest;
import vn.nashtech.inventory.good.database.entity.GoodEntity;

import java.util.List;

public interface GoodService {
    void create(GoodRequest req);
    GoodEntity updateGood(Long id, GoodRequest req);
    List<GoodEntity> listGoods();
    void deleteGood(Long id);
}
