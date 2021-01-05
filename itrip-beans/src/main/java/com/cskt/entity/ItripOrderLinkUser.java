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
* ClassName: ItripOrderLinkUser 
* Description: 
* date: 2021/1/5 10:29
* @author 咏殇
* @version
* @since JDK 1.8
*/
@ApiModel(value="com-cskt-entity-ItripOrderLinkUser")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_order_link_user")
public class ItripOrderLinkUser implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 订单id
     */
    @TableField(value = "order_id")
    @ApiModelProperty(value="订单id")
    private Long orderId;

    /**
     * 联系人id
     */
    @TableField(value = "link_user_id")
    @ApiModelProperty(value="联系人id")
    private Long linkUserId;

    /**
     * 入住人姓名逗号分隔
     */
    @TableField(value = "link_user_name")
    @ApiModelProperty(value="入住人姓名逗号分隔")
    private String linkUserName;

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

    private static final long serialVersionUID = 1L;
}