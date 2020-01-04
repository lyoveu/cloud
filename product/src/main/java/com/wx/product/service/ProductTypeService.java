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
     * @param newsType
     * @return
     */
    int createProductType(ProductType newsType);

    /**
     * 修改
     * @param newsType
     * @return
     */
    int updateProductType(ProductType newsType);

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
