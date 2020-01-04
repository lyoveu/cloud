package com.wx.product.service.impl;

import com.github.pagehelper.PageHelper;
import com.wx.product.mapper.ProductMapper;
import com.wx.product.model.Product;
import com.wx.product.model.ProductExample;
import com.wx.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ProductService实现类
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> listAllProduct() {
        return productMapper.selectByExample(new ProductExample());
    }

    @Override
    public int createProduct(Product product) {
        return productMapper.insertSelective(product);
    }

    @Override
    public int updateProduct(Product product) {
        return productMapper.updateByPrimaryKeySelective(product);
    }

    @Override
    public int deleteProduct(Long id) {
        return productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Product> listProduct(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return productMapper.selectByExample(new ProductExample());
    }

    @Override
    public Product getProduct(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }
}
