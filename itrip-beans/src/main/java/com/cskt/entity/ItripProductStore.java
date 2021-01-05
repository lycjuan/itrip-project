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
* ClassName: ItripProductStore 
* Description: 
* date: 2021/1/5 10:29
* @author 咏殇
* @version
* @since JDK 1.8
*/
/**
    * 原始库存表
    */
@ApiModel(value="com-cskt-entity-ItripProductStore")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_product_store")
public class ItripProductStore implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
     */
    @TableField(value = "product_type")
    @ApiModelProperty(value="商品类型(0:旅游产品 1:酒店产品 2:机票产品)")
    private Integer productType;

    /**
     * 商品id
     */
    @TableField(value = "product_id")
    @ApiModelProperty(value="商品id")
    private Long productId;

    /**
     * 商品库存
     */
    @TableField(value = "store")
    @ApiModelProperty(value="商品库存")
    private Integer store;

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