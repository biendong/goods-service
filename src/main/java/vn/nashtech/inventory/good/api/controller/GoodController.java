package vn.nashtech.inventory.good.api.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.nashtech.inventory.good.api.dto.GoodRequest;
import vn.nashtech.inventory.good.api.dto.GoodResponse;
import vn.nashtech.inventory.good.api.mapper.GoodMapper;
import vn.nashtech.inventory.good.service.GoodService;

@RestController
@RequestMapping("/good")
public class GoodController {
    private final GoodService goodService;
    private final GoodMapper goodMapper;

    @Autowired
    public GoodController(GoodService goodService, GoodMapper goodMapper) {
        this.goodService = goodService;
        this.goodMapper = goodMapper;
    }

    @ApiOperation(value = "Create good", nickname = "createGoodsUsingPOST", notes = "", tags={ "good-controller" })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = GoodResponse.class),
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found") })
    @PostMapping("")
    public ResponseEntity<?> create(@ApiParam(value = "requestBody") @RequestBody GoodRequest request){
        goodService.create(request);
        return ResponseEntity.ok("success");
    }

    @ApiOperation(value = "Update good", nickname = "updateGoodsUsingGET", notes = "", response = GoodResponse.class, tags={ "good-controller", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = GoodResponse.class),
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found") })
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@ApiParam(value = "requestBody") @RequestBody GoodRequest request, @ApiParam(value = "Good id",required=true) @PathVariable(value = "id") String id) {
        GoodResponse response = goodMapper.mapToRS(goodService.updateGood(Long.parseLong(id), request));
        return ResponseEntity.ok(response);
    }

    @ApiOperation(value = "Delete good", nickname = "deleteGoodsUsingGET", notes = "", tags={ "good-controller", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = GoodResponse.class),
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found") })
    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@ApiParam(value = "Good id",required=true) @PathVariable(value = "id") String id) {
        goodService.deleteGood(Long.parseLong(id));
        return ResponseEntity.ok("success");
    }
}
