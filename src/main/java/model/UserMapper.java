package oit.is.z0793.kaizi.janken.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

  @Select("SELECT id,name from users where id = 2")
  User selectMyName();

  @Select("SELECT id,name from users")
  ArrayList<User> selectName();

  @Select("SELECT id,user_1,user_2,user_1_hand,user_2_hand from matches where id = #{id}")
  User selectById(int id);


}
