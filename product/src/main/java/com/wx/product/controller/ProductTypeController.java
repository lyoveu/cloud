package com.wx.product.controller;


import com.wx.product.common.BaseController;
import com.wx.product.common.api.CommonResult;
import com.wx.product.model.ProductType;
import com.wx.product.service.ProductTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 产品类型管理
 */
@Api(tags = "ProductTypeController", description = "产品类型管理")
@RestController
@RequestMapping("/productType")
@Slf4j
public class ProductTypeController extends BaseController {
    
    @Autowired
    private ProductTypeService productTypeService;


    @ApiOperation("获取所有产品列表")
    @GetMapping("/listAll")
    public CommonResult<List<ProductType>> getProductTypeList() {
        return CommonResult.success(productTypeService.listAllProductType());
    }

    @ApiOperation("添加产品")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult createProductType(@RequestBody ProductType productType) {
        CommonResult commonResult;
        int count = productTypeService.createProductType(productType);
        if (count == 1) {
            commonResult = CommonResult.success(productType);
            log.debug("createProductType success:{}", productType);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("createProductType failed:{}", productType);
        }
        return commonResult;
    }

    @ApiOperation("更新指定id产品信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public CommonResult updateProductType(@RequestBody ProductType productTypeDto) {
        CommonResult commonResult;
        int count = productTypeService.updateProductType(productTypeDto);
        if (count == 1) {
            commonResult = CommonResult.success(productTypeDto);
            log.debug("updateProductType success:{}", productTypeDto);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("updateProductType failed:{}", productTypeDto);
        }
        return commonResult;
    }

    @ApiOperation("删除指定id的产品")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public CommonResult deleteProductType(@PathVariable("id") Integer id) {
        int count = productTypeService.deleteProductType(id);
        if (count == 1) {
            log.debug("deleteProductType success :id={}", id);
            return CommonResult.success(null);
        } else {
            log.debug("deleteProductType failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation("获取指定id的产品详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommonResult<ProductType> productType(@PathVariable("id") Integer id) {
        return CommonResult.success(productTypeService.getProductType(id));
    }
}
