package com.wx.product.mapper;

import com.wx.product.model.ProductImg;
import com.wx.product.model.ProductImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductImgMapper {
    long countByExample(ProductImgExample example);

    int deleteByExample(ProductImgExample example);

    int deleteByPrimaryKey(Long productImgId);

    int insert(ProductImg record);

    int insertSelective(ProductImg record);

    List<ProductImg> selectByExample(ProductImgExample example);

    ProductImg selectByPrimaryKey(Long productImgId);

    int updateByExampleSelective(@Param("record") ProductImg record, @Param("example") ProductImgExample example);

    int updateByExample(@Param("record") ProductImg record, @Param("example") ProductImgExample example);

    int updateByPrimaryKeySelective(ProductImg record);

    int updateByPrimaryKey(ProductImg record);
}