package com.wx.admin.contorller;

import com.wx.admin.common.BaseController;
import com.wx.admin.common.api.CommonResult;
import com.wx.admin.model.Province;
import com.wx.admin.service.ProvinceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 省管理
 */
@Api(tags = "ProvinceController", description = "省管理")
@Slf4j
@RestController
@RequestMapping("/province")
public class ProvinceController extends BaseController {
    
    @Autowired
    private ProvinceService provinceService;


    @ApiOperation("获取所有省列表")
    @GetMapping("/listAll")
    public CommonResult<List<Province>> getProvinceList() {
        return CommonResult.success(provinceService.listAllProvince());
    }

    @ApiOperation("添加省")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult createProvince(@RequestBody Province province) {
        CommonResult commonResult;
        int count = provinceService.createProvince(province);
        if (count == 1) {
            commonResult = CommonResult.success(province);
            log.debug("createProvince success:{}", province);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("createProvince failed:{}", province);
        }
        return commonResult;
    }

    @ApiOperation("更新指定id省信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public CommonResult updateProvince(@RequestBody Province provinceDto) {
        CommonResult commonResult;
        int count = provinceService.updateProvince(provinceDto);
        if (count == 1) {
            commonResult = CommonResult.success(provinceDto);
            log.debug("updateProvince success:{}", provinceDto);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("updateProvince failed:{}", provinceDto);
        }
        return commonResult;
    }

    @ApiOperation("删除指定id的省")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public CommonResult deleteProvince(@PathVariable("id") Integer id) {
        int count = provinceService.deleteProvince(id);
        if (count == 1) {
            log.debug("deleteProvince success :id={}", id);
            return CommonResult.success(null);
        } else {
            log.debug("deleteProvince failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation("获取指定id的省详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommonResult<Province> province(@PathVariable("id") Integer id) {
        return CommonResult.success(provinceService.getProvince(id));
    }
}
