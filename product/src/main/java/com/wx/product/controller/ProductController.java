package com.wx.product.controller;


import com.wx.product.common.BaseController;
import com.wx.product.common.api.CommonPage;
import com.wx.product.common.api.CommonResult;
import com.wx.product.model.Product;
import com.wx.product.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 产品管理
 */
@Api(tags = "ProductController", description = "产品管理")
@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController extends BaseController {
    
    @Autowired
    private ProductService productService;


    @ApiOperation("获取所有产品列表")
    @GetMapping("/listAll")
    public CommonResult<List<Product>> getProductList() {
        return CommonResult.success(productService.listAllProduct());
    }

    @ApiOperation("添加产品")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult createProduct(@RequestBody Product product) {
        CommonResult commonResult;
        int count = productService.createProduct(product);
        if (count == 1) {
            commonResult = CommonResult.success(product);
            log.debug("createProduct success:{}", product);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("createProduct failed:{}", product);
        }
        return commonResult;
    }

    @ApiOperation("更新指定id产品信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public CommonResult updateProduct(@RequestBody Product productDto) {
        CommonResult commonResult;
        int count = productService.updateProduct(productDto);
        if (count == 1) {
            commonResult = CommonResult.success(productDto);
            log.debug("updateProduct success:{}", productDto);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("updateProduct failed:{}", productDto);
        }
        return commonResult;
    }

    @ApiOperation("删除指定id的产品")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public CommonResult deleteProduct(@PathVariable("id") Long id) {
        int count = productService.deleteProduct(id);
        if (count == 1) {
            log.debug("deleteProduct success :id={}", id);
            return CommonResult.success(null);
        } else {
            log.debug("deleteProduct failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation("分页查询产品列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public CommonResult<CommonPage<Product>> listProduct(@RequestParam(value = "pageNum", defaultValue = "1")
                                                             @ApiParam("页码") Integer pageNum,
                                                         @RequestParam(value = "pageSize", defaultValue = "3")
                                                             @ApiParam("每页数量") Integer pageSize) {
        List<Product> productList = productService.listProduct(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(productList));
    }

    @ApiOperation("获取指定id的产品详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommonResult<Product> product(@PathVariable("id") Long id) {
        return CommonResult.success(productService.getProduct(id));
    }
}
