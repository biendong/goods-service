package vn.nashtech.inventory.good.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import vn.nashtech.inventory.good.service.GoodService;

@RestController
public class GoodController {
    private final GoodService goodService;
    @Autowired
    public GoodController(GoodService goodService) {
        this.goodService = goodService;
    }


}
