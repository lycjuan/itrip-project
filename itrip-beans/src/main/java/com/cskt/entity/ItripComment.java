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
* ClassName: ItripComment 
* Description: 
* date: 2021/1/5 10:29
* @author 咏殇
* @version
* @since JDK 1.8
*/
/**
    * 评论表
    */
@ApiModel(value="com-cskt-entity-ItripComment")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_comment")
public class ItripComment implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 如果产品是酒店的话 改字段保存酒店id
     */
    @TableField(value = "hotel_id")
    @ApiModelProperty(value="如果产品是酒店的话 改字段保存酒店id")
    private Long hotelId;

    /**
     * 商品id
     */
    @TableField(value = "product_id")
    @ApiModelProperty(value="商品id")
    private Long productId;

    /**
     * 订单id
     */
    @TableField(value = "order_id")
    @ApiModelProperty(value="订单id")
    private Long orderId;

    /**
     * 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
     */
    @TableField(value = "product_type")
    @ApiModelProperty(value="商品类型(0:旅游产品 1:酒店产品 2:机票产品)")
    private Integer productType;

    /**
     * 评论内容
     */
    @TableField(value = "content")
    @ApiModelProperty(value="评论内容")
    private String content;

    /**
     * 用户编号
     */
    @TableField(value = "user_id")
    @ApiModelProperty(value="用户编号")
    private Long userId;

    /**
     * 是否包含图片(当用户上传评论时检测)0:无图片 1:有图片
     */
    @TableField(value = "is_having_img")
    @ApiModelProperty(value="是否包含图片(当用户上传评论时检测)0:无图片 1:有图片")
    private Integer isHavingImg;

    /**
     * 位置评分
     */
    @TableField(value = "position_score")
    @ApiModelProperty(value="位置评分")
    private Integer positionScore;

    /**
     * 设施评分
     */
    @TableField(value = "facilities_score")
    @ApiModelProperty(value="设施评分")
    private Integer facilitiesScore;

    /**
     * 服务评分
     */
    @TableField(value = "service_score")
    @ApiModelProperty(value="服务评分")
    private Integer serviceScore;

    /**
     * 卫生评分
     */
    @TableField(value = "hygiene_score")
    @ApiModelProperty(value="卫生评分")
    private Integer hygieneScore;

    /**
     * 综合评分
     */
    @TableField(value = "score")
    @ApiModelProperty(value="综合评分")
    private Integer score;

    /**
     * 出游类型
     */
    @TableField(value = "trip_mode")
    @ApiModelProperty(value="出游类型")
    private Long tripMode;

    /**
     * 是否满意（0：有待改善 1：值得推荐）
     */
    @TableField(value = "is_ok")
    @ApiModelProperty(value="是否满意（0：有待改善 1：值得推荐）")
    private Integer isOk;

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