package com.wx.product.service;

import com.wx.product.model.Product;

import java.util.List;

/**
 * ProductService
 */
public interface ProductService {

    /**
     * 列表
     * @return
     */
    List<Product> listAllProduct();

    /**
     * 新增
     * @param product
     * @return
     */
    int createProduct(Product product);

    /**
     * 修改
     * @param product
     * @return
     */
    int updateProduct(Product product);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteProduct(Long id);

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<Product> listProduct(int pageNum, int pageSize);

    /**
     * 详情
     * @param id
     * @return
     */
    Product getProduct(Long id);
}
