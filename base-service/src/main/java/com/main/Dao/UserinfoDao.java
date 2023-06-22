package com.main.Dao;

import com.main.Entity.UserinfoEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@ApiModel("用户信息表Dao接口")
@Mapper
public interface UserinfoDao {
    /**
     * 根据用户ID查询用户信息
     * @param id
     * @return UserinfoEntity
     */
    @ApiModelProperty("根据用户ID查询用户信息")
    @Select("select * from userinfo where id = #{id}")
    UserinfoEntity getId(long id);
}
