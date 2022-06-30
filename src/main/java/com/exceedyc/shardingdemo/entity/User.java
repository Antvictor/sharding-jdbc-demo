package com.exceedyc.shardingdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 客户端用户
 * </p>
 *
 * @author exceedy
 * @since 2021-10-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("`user`")
public class User extends Entity {


    /**
     * 唯一标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 微信标识
     */
    @TableField("wx_open_id")
    private String wxOpenId;

    /**
     * 手机号
     */
    private Long phone;

    /**
     * 昵称
     */
    @TableField("nick_name")
    private String nickName;

    /**
     * 链址
     */
    @TableField("`hash`")
    private String hash;

    /**
     * 实名状态，是否通过。0: 未认证，1:认证成功，2: 认证失败
     */
    @TableField("real_status")
    private Integer realStatus;

    /**
     * 账户状态
     */
    @TableField("`status`")
    private Integer status;

    /**
     * 密文密码，配合手机号使用，当微信登录绑定后，去其他端登录时，需要重新设定的，不然只能通过手机号+验证码方式登录。
     */
    @TableField("`password`")
    private String password;

    /**
     * 用户头像
     */
    @TableField("avatars")
    private String avatars;

    /**
     * 转移服务返回的publicKey
     */
    @TableField("public_key")
    private String publicKey;

    /**
     * 转移服务返回的id
     */
    @TableField("nftse_id")
    private Long nftseId;

    /**
     * 用户签约
     */
    @TableField("`sign_contract`")
    private Boolean signContract;

    /**
     * 邮箱
     */
    @TableField("`email`")
    private String email;

    /**
     * 修改昵称的次数
     */
    @TableField("`change_nickname_num`")
    private Integer changeNicknameNum;
}
