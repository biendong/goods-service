package vn.nashtech.inventory.good.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.nashtech.inventory.good.api.dto.GoodRequest;
import vn.nashtech.inventory.good.database.entity.GoodEntity;
import vn.nashtech.inventory.good.database.repository.GoodRepository;
import vn.nashtech.inventory.good.service.GoodService;

@Service
@Slf4j
public class GoodServiceImpl implements GoodService {
    private final GoodRepository goodRepository;

    @Autowired
    public GoodServiceImpl(GoodRepository goodRepository) {
        this.goodRepository = goodRepository;
    }

    @Override
    public void create(GoodRequest req) {
        GoodEntity entity = new GoodEntity();
        mapperData(entity, req);
        goodRepository.save(entity);
    }

    @Override
    public GoodEntity updateGood(Long id, GoodRequest req) {
        GoodEntity good = goodRepository.findById(id).orElse(null);
        if (good != null) {
            mapperData(good, req);
            return goodRepository.save(good);
        }
        return null;
    }

    @Override
    public void deleteGood(Long id) {
        goodRepository.deleteById(id);
    }

    private void mapperData(GoodEntity good, GoodRequest req) {
        good.setProductCode(req.getProductCode());
        good.setProductDescription(req.getProductDescription());
        good.setProductName(req.getProductName());
        good.setUnitId(req.getUnitId());
    }
}
