package com.miaoshaproject.dao;

import com.miaoshaproject.dataobject.UserPasswordDO;


public interface UserPasswordDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sat Dec 22 22:02:03 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sat Dec 22 22:02:03 CST 2018
     */
    int insert(UserPasswordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sat Dec 22 22:02:03 CST 2018
     */
    int insertSelective(UserPasswordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sat Dec 22 22:02:03 CST 2018
     */
    UserPasswordDO selectByPrimaryKey(Integer id);
    UserPasswordDO selectByUserId(Integer userId);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sat Dec 22 22:02:03 CST 2018
     */
    int updateByPrimaryKeySelective(UserPasswordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Sat Dec 22 22:02:03 CST 2018
     */
    int updateByPrimaryKey(UserPasswordDO record);
}
