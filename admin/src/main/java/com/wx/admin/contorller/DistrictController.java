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
 * 地区管理
 */
@Api(tags = "DistrictController", description = "地区管理")
@Slf4j
@RestController
@RequestMapping("/district")
public class DistrictController extends BaseController {
    
    @Autowired
    private ProvinceService provinceService;


    @ApiOperation("获取所有地区列表")
    @GetMapping("/listAll")
    public CommonResult<List<Province>> getProvinceList() {
        return CommonResult.success(provinceService.listAllProvince());
    }

}
