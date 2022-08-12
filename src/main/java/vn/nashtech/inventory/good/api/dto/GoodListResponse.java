package vn.nashtech.inventory.good.api.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GoodListResponse {
    List<GoodResponse> responses = new ArrayList<>();
}
