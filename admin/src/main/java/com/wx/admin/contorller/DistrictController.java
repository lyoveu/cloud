package com.wx.admin.contorller;

import com.wx.admin.common.BaseController;
import com.wx.admin.common.api.CommonResult;
import com.wx.admin.dto.ProvinceDto;
import com.wx.admin.service.DistrictService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 地区管理
 */
@Api(tags = "DistrictController", description = "地区管理")
@Slf4j
@RestController
@RequestMapping("/district")
public class DistrictController extends BaseController {
    
    @Autowired
    private DistrictService districtService;


    @ApiOperation("获取所有地区列表")
    @GetMapping("/tree")
    public CommonResult<List<ProvinceDto>> getDistricts() {
        return CommonResult.success(districtService.getDistrictTree());
    }

}
