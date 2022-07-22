package vn.nashtech.inventory.good.service;

import vn.nashtech.inventory.good.api.dto.GoodRequest;
import vn.nashtech.inventory.good.database.entity.GoodEntity;

public interface GoodService {
    void create(GoodRequest req);
    GoodEntity updateGood(Long id, GoodRequest req);
    void deleteGood(Long id);
}
