package com.wx.product.service;

import com.wx.product.model.ProductImg;

import java.util.List;

/**
 * ProductImgService
 */
public interface ProductImgService {

    /**
     * 列表
     * @return
     */
    List<ProductImg> listAllProductImg();

    /**
     * 新增
     * @param productImg
     * @return
     */
    int createProductImg(ProductImg productImg);

    /**
     * 修改
     * @param productImg
     * @return
     */
    int updateProductImg(ProductImg productImg);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteProductImg(Long id);

    /**
     * 详情
     * @param id
     * @return
     */
    ProductImg getProductImg(Long id);
}
