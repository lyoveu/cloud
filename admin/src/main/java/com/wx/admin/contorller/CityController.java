package com.wx.admin.contorller;

import com.wx.admin.common.BaseController;
import com.wx.admin.common.api.CommonResult;
import com.wx.admin.model.City;
import com.wx.admin.service.CityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 市管理
 */
@Api(tags = "CityController", description = "市管理")
@Slf4j
@RestController
@RequestMapping("/city")
public class CityController extends BaseController {
    
    @Autowired
    private CityService cityService;


    @ApiOperation("获取所有市列表")
    @GetMapping("/listAll")
    public CommonResult<List<City>> getCityList() {
        return CommonResult.success(cityService.listAllCity());
    }

    @ApiOperation("添加市")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult createCity(@RequestBody City city) {
        CommonResult commonResult;
        int count = cityService.createCity(city);
        if (count == 1) {
            commonResult = CommonResult.success(city);
            log.debug("createCity success:{}", city);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("createCity failed:{}", city);
        }
        return commonResult;
    }

    @ApiOperation("更新指定id市信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public CommonResult updateCity(@RequestBody City cityDto) {
        CommonResult commonResult;
        int count = cityService.updateCity(cityDto);
        if (count == 1) {
            commonResult = CommonResult.success(cityDto);
            log.debug("updateCity success:{}", cityDto);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("updateCity failed:{}", cityDto);
        }
        return commonResult;
    }

    @ApiOperation("删除指定id的市")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public CommonResult deleteCity(@PathVariable("id") Integer id) {
        int count = cityService.deleteCity(id);
        if (count == 1) {
            log.debug("deleteCity success :id={}", id);
            return CommonResult.success(null);
        } else {
            log.debug("deleteCity failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation("获取指定id的市详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommonResult<City> city(@PathVariable("id") Integer id) {
        return CommonResult.success(cityService.getCity(id));
    }
}
