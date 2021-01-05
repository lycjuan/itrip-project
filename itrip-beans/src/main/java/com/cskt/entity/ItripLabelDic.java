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
* ClassName: ItripLabelDic 
* Description: 
* date: 2021/1/5 10:29
* @author 咏殇
* @version
* @since JDK 1.8
*/
/**
    * 标签字典表
    */
@ApiModel(value="com-cskt-entity-ItripLabelDic")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "itrip_label_dic")
public class ItripLabelDic implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * key值
     */
    @TableField(value = "name")
    @ApiModelProperty(value="key值")
    private String name;

    /**
     * value值
     */
    @TableField(value = "value")
    @ApiModelProperty(value="value值")
    private String value;

    /**
     * 描述
     */
    @TableField(value = "description")
    @ApiModelProperty(value="描述")
    private String description;

    /**
     * 父级标签id(1级标签则为0)
     */
    @TableField(value = "parent_id")
    @ApiModelProperty(value="父级标签id(1级标签则为0)")
    private Long parentId;

    /**
     * 标签图片地址
     */
    @TableField(value = "pic")
    @ApiModelProperty(value="标签图片地址")
    private String pic;

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