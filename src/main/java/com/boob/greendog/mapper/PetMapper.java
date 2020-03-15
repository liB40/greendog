package com.boob.greendog.mapper;

import com.boob.greendog.model.Pet;
import com.boob.greendog.model.PetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Sun Mar 15 18:09:53 CST 2020
     */
    long countByExample(PetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Sun Mar 15 18:09:53 CST 2020
     */
    int deleteByExample(PetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Sun Mar 15 18:09:53 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Sun Mar 15 18:09:53 CST 2020
     */
    int insert(Pet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Sun Mar 15 18:09:53 CST 2020
     */
    int insertSelective(Pet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Sun Mar 15 18:09:53 CST 2020
     */
    List<Pet> selectByExampleWithRowbounds(PetExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Sun Mar 15 18:09:53 CST 2020
     */
    List<Pet> selectByExample(PetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Sun Mar 15 18:09:53 CST 2020
     */
    Pet selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Sun Mar 15 18:09:53 CST 2020
     */
    int updateByExampleSelective(@Param("record") Pet record, @Param("example") PetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Sun Mar 15 18:09:53 CST 2020
     */
    int updateByExample(@Param("record") Pet record, @Param("example") PetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Sun Mar 15 18:09:53 CST 2020
     */
    int updateByPrimaryKeySelective(Pet record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet
     *
     * @mbg.generated Sun Mar 15 18:09:53 CST 2020
     */
    int updateByPrimaryKey(Pet record);
}