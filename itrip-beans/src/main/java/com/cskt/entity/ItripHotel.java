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
* ClassName: ItripHotel 
* Description: 
* date: 2021/1/5 10:29
* @author 咏殇
* @version
* @since JDK 1.8
*/
/**
    * 酒店表
    */
@ApiModel(value="com-cskt-entity-ItripHotel")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_hotel")
public class ItripHotel implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 酒店名称
     */
    @TableField(value = "hotel_name")
    @ApiModelProperty(value="酒店名称")
    private String hotelName;

    /**
     * 所在国家id
     */
    @TableField(value = "country_id")
    @ApiModelProperty(value="所在国家id")
    private Long countryId;

    /**
     * 所在省份id
     */
    @TableField(value = "province_id")
    @ApiModelProperty(value="所在省份id")
    private Long provinceId;

    /**
     * 所在城市id
     */
    @TableField(value = "city_id")
    @ApiModelProperty(value="所在城市id")
    private Long cityId;

    /**
     * 酒店所在地址
     */
    @TableField(value = "address")
    @ApiModelProperty(value="酒店所在地址")
    private String address;

    /**
     * 酒店介绍（保存附文本）
     */
    @TableField(value = "details")
    @ApiModelProperty(value="酒店介绍（保存附文本）")
    private String details;

    /**
     * 酒店设施
     */
    @TableField(value = "facilities")
    @ApiModelProperty(value="酒店设施")
    private String facilities;

    /**
     * 酒店政策
     */
    @TableField(value = "hotel_policy")
    @ApiModelProperty(value="酒店政策")
    private String hotelPolicy;

    /**
     * 酒店类型(1:国内酒店 2:国际酒店)
     */
    @TableField(value = "hotel_type")
    @ApiModelProperty(value="酒店类型(1:国内酒店 2:国际酒店)")
    private Integer hotelType;

    /**
     * (1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)
     */
    @TableField(value = "hotel_level")
    @ApiModelProperty(value="(1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)")
    private Integer hotelLevel;

    /**
     * 是否是团购酒店
     */
    @TableField(value = "is_group_purchase")
    @ApiModelProperty(value="是否是团购酒店")
    private Integer isGroupPurchase;

    /**
     * 城市名称 冗余字段
     */
    @TableField(value = "redundant_city_name")
    @ApiModelProperty(value="城市名称 冗余字段")
    private String redundantCityName;

    /**
     * 省名称 冗余字段
     */
    @TableField(value = "redundant_province_name")
    @ApiModelProperty(value="省名称 冗余字段")
    private String redundantProvinceName;

    /**
     * 国家名称 冗余字段
     */
    @TableField(value = "redundant_country_name")
    @ApiModelProperty(value="国家名称 冗余字段")
    private String redundantCountryName;

    /**
     * 酒店库存（冗余，每天开定时任务的时候更新）
     */
    @TableField(value = "redundant_hotel_store")
    @ApiModelProperty(value="酒店库存（冗余，每天开定时任务的时候更新）")
    private Integer redundantHotelStore;

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