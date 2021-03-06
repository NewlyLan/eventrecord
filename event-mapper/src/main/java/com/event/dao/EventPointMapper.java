package com.event.dao;

import com.event.entry.EventPoint;
import com.event.entry.EventPointKey;

public interface EventPointMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table er_event_point
     *
     * @mbg.generated Sun Oct 25 02:25:26 CST 2020
     */
    int deleteByPrimaryKey(EventPointKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table er_event_point
     *
     * @mbg.generated Sun Oct 25 02:25:26 CST 2020
     */
    int insert(EventPoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table er_event_point
     *
     * @mbg.generated Sun Oct 25 02:25:26 CST 2020
     */
    int insertSelective(EventPoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table er_event_point
     *
     * @mbg.generated Sun Oct 25 02:25:26 CST 2020
     */
    EventPoint selectByPrimaryKey(EventPointKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table er_event_point
     *
     * @mbg.generated Sun Oct 25 02:25:26 CST 2020
     */
    int updateByPrimaryKeySelective(EventPoint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table er_event_point
     *
     * @mbg.generated Sun Oct 25 02:25:26 CST 2020
     */
    int updateByPrimaryKey(EventPoint record);
}