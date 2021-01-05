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
* ClassName: ItripAreaDic 
* Description: 
* date: 2021/1/5 10:29
* @author 咏殇
* @version
* @since JDK 1.8
*/
/**
    * 区域字典表
    */
@ApiModel(value="com-cskt-entity-ItripAreaDic")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_area_dic")
public class ItripAreaDic implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 区域名称
     */
    @TableField(value = "name")
    @ApiModelProperty(value="区域名称")
    private String name;

    /**
     * 区域编号
     */
    @TableField(value = "area_no")
    @ApiModelProperty(value="区域编号")
    private String areaNo;

    /**
     * 父级区域
     */
    @TableField(value = "parent")
    @ApiModelProperty(value="父级区域")
    private Long parent;

    /**
     * 0:未激活 1:已激活
     */
    @TableField(value = "is_activated")
    @ApiModelProperty(value="0:未激活 1:已激活")
    private Integer isActivated;

    /**
     * 是否是商圈(0:不是 1:是)
     */
    @TableField(value = "is_trading_area")
    @ApiModelProperty(value="是否是商圈(0:不是 1:是)")
    private Integer isTradingArea;

    /**
     * (0:不是 1：是)
     */
    @TableField(value = "is_hot")
    @ApiModelProperty(value="(0:不是 1：是)")
    private Integer isHot;

    /**
     * 区域级别(0:国家级 1:省级 2:市级 3:县/区)
     */
    @TableField(value = "level")
    @ApiModelProperty(value="区域级别(0:国家级 1:省级 2:市级 3:县/区)")
    private Integer level;

    /**
     * 1:国内 2：国外
     */
    @TableField(value = "is_china")
    @ApiModelProperty(value="1:国内 2：国外")
    private Integer isChina;

    @TableField(value = "pinyin")
    @ApiModelProperty(value="")
    private String pinyin;

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