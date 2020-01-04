package com.wx.admin.contorller;


import com.wx.admin.common.BaseController;
import com.wx.admin.common.api.CommonPage;
import com.wx.admin.common.api.CommonResult;
import com.wx.admin.model.OnlineMessage;
import com.wx.admin.service.OnlineMessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 在线留言管理
 */
@Api(tags = "OnlineMessageController", description = "在线留言管理")
@RestController
@RequestMapping("/online/message")
@Slf4j
public class OnlineMessageController extends BaseController {
    
    @Autowired
    private OnlineMessageService onlineMessageService;


    @ApiOperation("获取所有在线留言列表")
    @GetMapping("/listAll")
    public CommonResult<List<OnlineMessage>> getOnlineMessageList() {
        return CommonResult.success(onlineMessageService.listAllOnlineMessage());
    }

    @ApiOperation("添加在线留言")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult createOnlineMessage(@RequestBody OnlineMessage onlineMessage) {
        CommonResult commonResult;
        int count = onlineMessageService.createOnlineMessage(onlineMessage);
        if (count == 1) {
            commonResult = CommonResult.success(onlineMessage);
            log.debug("createOnlineMessage success:{}", onlineMessage);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("createOnlineMessage failed:{}", onlineMessage);
        }
        return commonResult;
    }

    @ApiOperation("更新指定id在线留言信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public CommonResult updateOnlineMessage(@RequestBody OnlineMessage onlineMessageDto) {
        CommonResult commonResult;
        int count = onlineMessageService.updateOnlineMessage(onlineMessageDto);
        if (count == 1) {
            commonResult = CommonResult.success(onlineMessageDto);
            log.debug("updateOnlineMessage success:{}", onlineMessageDto);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("updateOnlineMessage failed:{}", onlineMessageDto);
        }
        return commonResult;
    }

    @ApiOperation("删除指定id的在线留言")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public CommonResult deleteOnlineMessage(@PathVariable("id") Long id) {
        int count = onlineMessageService.deleteOnlineMessage(id);
        if (count == 1) {
            log.debug("deleteOnlineMessage success :id={}", id);
            return CommonResult.success(null);
        } else {
            log.debug("deleteOnlineMessage failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation("分页查询在线留言列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public CommonResult<CommonPage<OnlineMessage>> listOnlineMessage(@RequestParam(value = "pageNum", defaultValue = "1")
                                                             @ApiParam("页码") Integer pageNum,
                                                                     @RequestParam(value = "pageSize", defaultValue = "3")
                                                             @ApiParam("每页数量") Integer pageSize) {
        List<OnlineMessage> onlineMessageList = onlineMessageService.listOnlineMessage(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(onlineMessageList));
    }

    @ApiOperation("获取指定id的在线留言详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommonResult<OnlineMessage> onlineMessage(@PathVariable("id") Long id) {
        return CommonResult.success(onlineMessageService.getOnlineMessage(id));
    }
}
