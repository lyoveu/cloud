package com.wx.product.service.impl;

import com.wx.product.mapper.ProductTypeMapper;
import com.wx.product.model.ProductType;
import com.wx.product.model.ProductTypeExample;
import com.wx.product.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ProductTypeService实现类
 */
@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private ProductTypeMapper productTypeMapper;

    @Override
    public List<ProductType> listAllProductType() {
        return productTypeMapper.selectByExample(new ProductTypeExample());
    }

    @Override
    public int createProductType(ProductType productType) {
        return productTypeMapper.insertSelective(productType);
    }

    @Override
    public int updateProductType(ProductType productType) {
        return productTypeMapper.updateByPrimaryKeySelective(productType);
    }

    @Override
    public int deleteProductType(Integer id) {
        return productTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public ProductType getProductType(Integer id) {
        return productTypeMapper.selectByPrimaryKey(id);
    }
}
