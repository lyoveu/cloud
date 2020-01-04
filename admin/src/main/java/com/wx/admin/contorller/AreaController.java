package com.wx.admin.contorller;

import com.wx.admin.common.BaseController;
import com.wx.admin.common.api.CommonResult;
import com.wx.admin.model.Area;
import com.wx.admin.service.AreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 区县管理
 */
@Api(tags = "AreaController", description = "区县管理")
@Slf4j
@RestController
@RequestMapping("/area")
public class AreaController extends BaseController {
    
    @Autowired
    private AreaService areaService;


    @ApiOperation("获取所有区县列表")
    @GetMapping("/listAll")
    public CommonResult<List<Area>> getAreaList() {
        return CommonResult.success(areaService.listAllArea());
    }

    @ApiOperation("添加区县")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult createArea(@RequestBody Area area) {
        CommonResult commonResult;
        int count = areaService.createArea(area);
        if (count == 1) {
            commonResult = CommonResult.success(area);
            log.debug("createArea success:{}", area);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("createArea failed:{}", area);
        }
        return commonResult;
    }

    @ApiOperation("更新指定id区县信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public CommonResult updateArea(@RequestBody Area areaDto) {
        CommonResult commonResult;
        int count = areaService.updateArea(areaDto);
        if (count == 1) {
            commonResult = CommonResult.success(areaDto);
            log.debug("updateArea success:{}", areaDto);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("updateArea failed:{}", areaDto);
        }
        return commonResult;
    }

    @ApiOperation("删除指定id的区县")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public CommonResult deleteArea(@PathVariable("id") Integer id) {
        int count = areaService.deleteArea(id);
        if (count == 1) {
            log.debug("deleteArea success :id={}", id);
            return CommonResult.success(null);
        } else {
            log.debug("deleteArea failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation("获取指定id的区县详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommonResult<Area> area(@PathVariable("id") Integer id) {
        return CommonResult.success(areaService.getArea(id));
    }
}
