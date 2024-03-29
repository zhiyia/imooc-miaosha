package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.ItemStockDO;
import org.apache.ibatis.annotations.Param;

public interface ItemStockDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Mon Jan 21 10:24:31 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Mon Jan 21 10:24:31 CST 2019
     */
    int insert(ItemStockDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Mon Jan 21 10:24:31 CST 2019
     */
    int insertSelective(ItemStockDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Mon Jan 21 10:24:31 CST 2019
     */
    ItemStockDO selectByPrimaryKey(Integer id);
    ItemStockDO selectByItemId(Integer itemId);

    int decreaseStock(@Param("itemId") Integer itemId,@Param("amount") Integer amount);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Mon Jan 21 10:24:31 CST 2019
     */
    int updateByPrimaryKeySelective(ItemStockDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_stock
     *
     * @mbg.generated Mon Jan 21 10:24:31 CST 2019
     */
    int updateByPrimaryKey(ItemStockDO record);
}