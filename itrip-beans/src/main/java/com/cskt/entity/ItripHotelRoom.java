package com.cskt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* ClassName: ItripHotelRoom 
* Description: 
* date: 2021/1/5 10:29
* @author 咏殇
* @version
* @since JDK 1.8
*/
/**
    * 酒店房间表
    */
@ApiModel(value="com-cskt-entity-ItripHotelRoom")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_hotel_room")
public class ItripHotelRoom implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 酒店ID
     */
    @TableField(value = "hotel_id")
    @ApiModelProperty(value="酒店ID")
    private Long hotelId;

    /**
     * 房间名称
     */
    @TableField(value = "room_title")
    @ApiModelProperty(value="房间名称")
    private String roomTitle;

    /**
     * 房间价格
     */
    @TableField(value = "room_price")
    @ApiModelProperty(value="房间价格")
    private BigDecimal roomPrice;

    /**
     * 酒店床型
     */
    @TableField(value = "room_bed_type_id")
    @ApiModelProperty(value="酒店床型")
    private Long roomBedTypeId;

    /**
     * 是否包含早餐
     */
    @TableField(value = "is_having_breakfast")
    @ApiModelProperty(value="是否包含早餐")
    private Integer isHavingBreakfast;

    /**
     * 1:在线付 2:到店付 3:不限
     */
    @TableField(value = "pay_type")
    @ApiModelProperty(value="1:在线付 2:到店付 3:不限")
    private Integer payType;

    /**
     * 满意度（冗余字段，在用户评论后更新）
     */
    @TableField(value = "satisfaction")
    @ApiModelProperty(value="满意度（冗余字段，在用户评论后更新）")
    private Long satisfaction;

    /**
     * 是否可预订(0:不可以 1:可以)
     */
    @TableField(value = "is_book")
    @ApiModelProperty(value="是否可预订(0:不可以 1:可以)")
    private Integer isBook;

    /**
     * 是否可取消(0:不可 1:可以)
     */
    @TableField(value = "is_cancel")
    @ApiModelProperty(value="是否可取消(0:不可 1:可以)")
    private Integer isCancel;

    /**
     * 是否及时响应(0:不及时 1:及时)
     */
    @TableField(value = "is_timely_response")
    @ApiModelProperty(value="是否及时响应(0:不及时 1:及时)")
    private Integer isTimelyResponse;

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