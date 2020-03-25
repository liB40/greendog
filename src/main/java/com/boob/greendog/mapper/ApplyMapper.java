package com.boob.greendog.mapper;

import com.boob.greendog.model.Apply;
import com.boob.greendog.model.ApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ApplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Sat Mar 21 21:55:55 CST 2020
     */
    long countByExample(ApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Sat Mar 21 21:55:55 CST 2020
     */
    int deleteByExample(ApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Sat Mar 21 21:55:55 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Sat Mar 21 21:55:55 CST 2020
     */
    int insert(Apply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Sat Mar 21 21:55:55 CST 2020
     */
    int insertSelective(Apply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Sat Mar 21 21:55:55 CST 2020
     */
    List<Apply> selectByExampleWithRowbounds(ApplyExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Sat Mar 21 21:55:55 CST 2020
     */
    List<Apply> selectByExample(ApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Sat Mar 21 21:55:55 CST 2020
     */
    Apply selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Sat Mar 21 21:55:55 CST 2020
     */
    int updateByExampleSelective(@Param("record") Apply record, @Param("example") ApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Sat Mar 21 21:55:55 CST 2020
     */
    int updateByExample(@Param("record") Apply record, @Param("example") ApplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Sat Mar 21 21:55:55 CST 2020
     */
    int updateByPrimaryKeySelective(Apply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table apply
     *
     * @mbg.generated Sat Mar 21 21:55:55 CST 2020
     */
    int updateByPrimaryKey(Apply record);
}