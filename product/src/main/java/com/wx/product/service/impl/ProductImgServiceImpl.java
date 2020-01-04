package com.wx.product.service.impl;

import com.wx.product.mapper.ProductImgMapper;
import com.wx.product.model.ProductImg;
import com.wx.product.model.ProductImgExample;
import com.wx.product.model.ProductType;
import com.wx.product.service.ProductService;
import com.wx.product.service.ProductImgService;
import com.wx.product.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ProductImgService实现类
 */
@Service
public class ProductImgServiceImpl implements ProductImgService {

    @Autowired
    private ProductImgMapper productImgMapper;

    @Override
    public List<ProductImg> listAllProductImg() {
        return productImgMapper.selectByExample(new ProductImgExample());
    }

    @Override
    public int createProductImg(ProductImg productImg) {
        return productImgMapper.insertSelective(productImg);
    }

    @Override
    public int updateProductImg(ProductImg productImg) {
        return productImgMapper.updateByPrimaryKeySelective(productImg);
    }

    @Override
    public int deleteProductImg(Long id) {
        return productImgMapper.deleteByPrimaryKey(id);
    }

    @Override
    public ProductImg getProductImg(Long id) {
        return productImgMapper.selectByPrimaryKey(id);
    }
}
