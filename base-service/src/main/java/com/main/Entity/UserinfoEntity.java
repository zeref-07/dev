package com.main.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("用户信息表Entity类")
@Data
public class UserinfoEntity {
  @ApiModelProperty("id 用户编号")
  private long id;

  @ApiModelProperty("username 用户名")
  private String username;

  @ApiModelProperty("password 密码")
  private String password;

  @ApiModelProperty("email 邮箱")
  private String email;

  @ApiModelProperty("age 年龄")
  private long age;

  @ApiModelProperty("sex 性别")
  private long sex;

  @ApiModelProperty("tel 电话")
  private String tel;

  @ApiModelProperty("addr 地址")
  private String addr;

  @ApiModelProperty("card 身份证号")
  private String card;

  @ApiModelProperty("married 婚姻状态")
  private long married;

  @ApiModelProperty("salary 薪水")
  private double salary;
}
