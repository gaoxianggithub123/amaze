package com.demo.amaze.login.mapper;

import com.demo.amaze.login.entity.Info;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface InfoMapper {
    @Select("SELECT * FROM `info`")
    List<Info> findAll();
    @Select("select * from 'info' where id =#{id}")
    Info findInfo(@Param("id") String id);
    @Delete("DELETE  FROM 'info' WHERE id=#{id}")
    int deleteInfo(@Param("id") String id);
    @Insert("INSERT INTO 'info' VALUES(#{id}),#{name},#{sex},#{city},#{sign},#{score},#{mark},#{job},#{wealth}")
    int insertInfo(@Param("id") String id,@Param("name") String name,@Param("sex") String sex,@Param("city") String city,@Param("sign") String sign,
                   @Param("score") String score,@Param("mark") String mark,@Param("job") String job,@Param("wealth") String wealth);
    @Select("SELECT `name`,score,mark,wealth FROM info")
    List<Info> chartsDemo();
}
