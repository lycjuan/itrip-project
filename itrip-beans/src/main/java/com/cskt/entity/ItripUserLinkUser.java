package com.cskt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* ClassName: ItripUserLinkUser 
* Description: 
* date: 2021/1/5 10:29
* @author 咏殇
* @version
* @since JDK 1.8
*/
@ApiModel(value="com-cskt-entity-ItripUserLinkUser")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_user_link_user")
public class ItripUserLinkUser implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 常用联系人姓名
     */
    @TableField(value = "link_user_name")
    @ApiModelProperty(value="常用联系人姓名")
    private String linkUserName;

    /**
     * 证件号码
     */
    @TableField(value = "link_id_card")
    @ApiModelProperty(value="证件号码")
    private String linkIdCard;

    /**
     * 常用联系人电话
     */
    @TableField(value = "link_phone")
    @ApiModelProperty(value="常用联系人电话")
    private String linkPhone;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    @ApiModelProperty(value="用户id")
    private Integer userId;

    @TableField(value = "creation_date")
    @ApiModelProperty(value="")
    private Date creationDate;

    @TableField(value = "created_by")
    @ApiModelProperty(value="")
    private Long createdBy;

    @TableField(value = "modify_date")
    @ApiModelProperty(value="")
    private Date modifyDate;

    @TableField(value = "modified_by")
    @ApiModelProperty(value="")
    private Long modifiedBy;

    /**
     * 逻辑删除（0:未删除；1：删除）
     */
    @TableField(value = "is_deleted")
    @ApiModelProperty(value="逻辑删除（0:未删除；1：删除）")
    private Integer isDeleted;

    /**
     * 证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)
     */
    @TableField(value = "link_id_card_type")
    @ApiModelProperty(value="证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)")
    private Integer linkIdCardType;

    private static final long serialVersionUID = 1L;
}