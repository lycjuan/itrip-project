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
* ClassName: ItripHotelOrder 
* Description: 
* date: 2021/1/5 10:29
* @author 咏殇
* @version
* @since JDK 1.8
*/
/**
    * 订单表
    */
@ApiModel(value="com-cskt-entity-ItripHotelOrder")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_hotel_order")
public class ItripHotelOrder implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    @ApiModelProperty(value="用户id")
    private Long userId;

    /**
     * 订单类型(0:旅游产品 1:酒店产品 2：机票产品)
     */
    @TableField(value = "order_type")
    @ApiModelProperty(value="订单类型(0:旅游产品 1:酒店产品 2：机票产品)")
    private Integer orderType;

    /**
     * 订单号
     */
    @TableField(value = "order_no")
    @ApiModelProperty(value="订单号")
    private String orderNo;

    /**
     * 交易编号
     */
    @TableField(value = "trade_no")
    @ApiModelProperty(value="交易编号")
    private String tradeNo;

    /**
     * 冗余字段 酒店id
     */
    @TableField(value = "hotel_id")
    @ApiModelProperty(value="冗余字段 酒店id")
    private Long hotelId;

    /**
     * 冗余字段 酒店名称
     */
    @TableField(value = "hotel_name")
    @ApiModelProperty(value="冗余字段 酒店名称")
    private String hotelName;

    /**
     * 房间id
     */
    @TableField(value = "room_id")
    @ApiModelProperty(value="房间id")
    private Long roomId;

    /**
     * 消耗数量
     */
    @TableField(value = "count")
    @ApiModelProperty(value="消耗数量")
    private Integer count;

    /**
     * 预订天数
     */
    @TableField(value = "booking_days")
    @ApiModelProperty(value="预订天数")
    private Integer bookingDays;

    /**
     * 入住时间
     */
    @TableField(value = "check_in_date")
    @ApiModelProperty(value="入住时间")
    private Date checkInDate;

    /**
     * 退房时间
     */
    @TableField(value = "check_out_date")
    @ApiModelProperty(value="退房时间")
    private Date checkOutDate;

    /**
     * 订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
     */
    @TableField(value = "order_status")
    @ApiModelProperty(value="订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）")
    private Integer orderStatus;

    /**
     * 支付金额
     */
    @TableField(value = "pay_amount")
    @ApiModelProperty(value="支付金额")
    private BigDecimal payAmount;

    /**
     * 支付方式:1:支付宝 2:微信 3:到店付
     */
    @TableField(value = "pay_type")
    @ApiModelProperty(value="支付方式:1:支付宝 2:微信 3:到店付")
    private Integer payType;

    /**
     * 联系手机号
     */
    @TableField(value = "notice_phone")
    @ApiModelProperty(value="联系手机号")
    private String noticePhone;

    /**
     * 联系邮箱
     */
    @TableField(value = "notice_email")
    @ApiModelProperty(value="联系邮箱")
    private String noticeEmail;

    /**
     * 特殊需求
     */
    @TableField(value = "special_requirement")
    @ApiModelProperty(value="特殊需求")
    private String specialRequirement;

    /**
     * 是否需要发票（0：不需要 1：需要）
     */
    @TableField(value = "is_need_invoice")
    @ApiModelProperty(value="是否需要发票（0：不需要 1：需要）")
    private Integer isNeedInvoice;

    /**
     * 发票类型（0：个人 1：公司）
     */
    @TableField(value = "invoice_type")
    @ApiModelProperty(value="发票类型（0：个人 1：公司）")
    private Integer invoiceType;

    /**
     * 发票抬头
     */
    @TableField(value = "invoice_head")
    @ApiModelProperty(value="发票抬头")
    private String invoiceHead;

    /**
     * 入住人名称
     */
    @TableField(value = "link_user_name")
    @ApiModelProperty(value="入住人名称")
    private String linkUserName;

    /**
     * 0:WEB端 1:手机端 2:其他客户端
     */
    @TableField(value = "book_type")
    @ApiModelProperty(value="0:WEB端 1:手机端 2:其他客户端")
    private Integer bookType;

    /**
     * 预定时间
     */
    @TableField(value = "creation_date")
    @ApiModelProperty(value="预定时间")
    private Date creationDate;

    @TableField(value = "created_by")
    @ApiModelProperty(value="")
    private Long createdBy;

    /**
     * 支付完成时间
     */
    @TableField(value = "modify_date")
    @ApiModelProperty(value="支付完成时间")
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