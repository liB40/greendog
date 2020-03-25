package com.boob.greendog.mapper;

import com.boob.greendog.model.Appointment;
import com.boob.greendog.model.AppointmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppointmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Sat Mar 21 21:55:56 CST 2020
     */
    long countByExample(AppointmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Sat Mar 21 21:55:56 CST 2020
     */
    int deleteByExample(AppointmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Sat Mar 21 21:55:56 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Sat Mar 21 21:55:56 CST 2020
     */
    int insert(Appointment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Sat Mar 21 21:55:56 CST 2020
     */
    int insertSelective(Appointment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Sat Mar 21 21:55:56 CST 2020
     */
    List<Appointment> selectByExampleWithRowbounds(AppointmentExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Sat Mar 21 21:55:56 CST 2020
     */
    List<Appointment> selectByExample(AppointmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Sat Mar 21 21:55:56 CST 2020
     */
    Appointment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Sat Mar 21 21:55:56 CST 2020
     */
    int updateByExampleSelective(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Sat Mar 21 21:55:56 CST 2020
     */
    int updateByExample(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Sat Mar 21 21:55:56 CST 2020
     */
    int updateByPrimaryKeySelective(Appointment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbg.generated Sat Mar 21 21:55:56 CST 2020
     */
    int updateByPrimaryKey(Appointment record);
}