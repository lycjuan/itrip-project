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
* ClassName: ItripHotelExtendProperty 
* Description: 
* date: 2021/1/5 10:29
* @author 咏殇
* @version
* @since JDK 1.8
*/
@ApiModel(value="com-cskt-entity-ItripHotelExtendProperty")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_hotel_extend_property")
public class ItripHotelExtendProperty implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 酒店id
     */
    @TableField(value = "hotel_id")
    @ApiModelProperty(value="酒店id")
    private Long hotelId;

    /**
     * 推广属性
     */
    @TableField(value = "extend_property_id")
    @ApiModelProperty(value="推广属性")
    private Long extendPropertyId;

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