package com.imooc.miaosha.dao;

import org.apache.ibatis.annotations.*;

import com.imooc.miaosha.domain.User;

@Mapper
public interface UserDao {
	
	@Select("select * from user where id = #{id}")
	public User getById(@Param("id")int id	);

	@Insert("insert into user(id, name)values(#{id}, #{name})")
	public int insert(User user);
//
//	@Update("update user(id, name)values(#{id}, #{name})")
//	public void update(User user);
	
}
