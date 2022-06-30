package com.exceedyc.shardingdemo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商户库登录信息库
 * </p>
 *
 * @author exceedy
 * @since 2022-06-30
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("merchants")
public class Merchants extends Entity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * appId
     */
    @TableField("app_id")
    private String appId;

    /**
     * 登录账号
     */
    @TableField("`account`")
    private String account;

    /**
     * 昵称(同公司名,修改不影响公司名)
     */
    @TableField("nick_name")
    private String nickName;

    /**
     * 登录密码
     */
    @TableField("`password`")
    private String password;


}
