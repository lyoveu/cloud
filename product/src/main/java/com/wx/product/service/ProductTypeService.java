package com.wx.product.service;


import com.wx.product.model.ProductType;

import java.util.List;

/**
 * ProductTypeService
 */
public interface ProductTypeService {

    /**
     * 列表
     * @return
     */
    List<ProductType> listAllProductType();

    /**
     * 新增
     * @param productType
     * @return
     */
    int createProductType(ProductType productType);

    /**
     * 修改
     * @param productType
     * @return
     */
    int updateProductType(ProductType productType);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteProductType(Integer id);

    /**
     * 详情
     * @param id
     * @return
     */
    ProductType getProductType(Integer id);
}
