package vn.nashtech.inventory.good.api.mapper;

import org.springframework.stereotype.Component;
import vn.nashtech.inventory.good.api.dto.GoodResponse;
import vn.nashtech.inventory.good.database.entity.GoodEntity;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class GoodMapper {
    public List<GoodResponse> mapToListRS(List<GoodEntity> goodEntities) {
        if (goodEntities == null || goodEntities.isEmpty()) {
            return Collections.emptyList();
        }
        return goodEntities.stream().map(this::mapToRS).filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    public GoodResponse mapToRS(GoodEntity good) {
        if (good == null) {
            return null;
        }
        GoodResponse goodResponse = new GoodResponse();
        goodResponse.setId(good.getId());
        goodResponse.setProductCode(good.getProductCode());
        goodResponse.setProductDescription(good.getProductDescription());
        goodResponse.setProductName(good.getProductName());
        goodResponse.setUnitId(good.getUnitId());
        return goodResponse;
    }
}
