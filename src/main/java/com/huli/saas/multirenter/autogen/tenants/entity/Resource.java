package com.huli.saas.multirenter.autogen.tenants.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
import java.time.LocalDateTime;

/**
 * <p>
 * 资源表
 * </p>
 *
 * @author plugin
 * @since 2019-11-25
 */

@Data
@Accessors(chain = true)
public class Resource implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(type = IdType.ID_WORKER)
    private Long id;
    /**
     * 资源名称
     */
    private String name;
    /**
     * 资源描述
     */
    private String description;
    /**
     * 项目id 一个项目对应多个资源
     */
    private Integer projectId;
    /**
     * 资源类型 0:url
     */
    private Integer type;
    /**
     * 资源定位 资源类型为0时对应的是url
     */
    private String location;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
    /**
     * 创建用户
     */
    private Long createUser;
    /**
     * 更新用户
     */
    private Long updateUser;

}
