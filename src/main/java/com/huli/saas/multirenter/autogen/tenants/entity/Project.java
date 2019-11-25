package com.huli.saas.multirenter.autogen.tenants.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
import java.time.LocalDateTime;

/**
 * <p>
 * 项目表，一个项目集成了一个或多个资源
 * </p>
 *
 * @author plugin
 * @since 2019-11-25
 */

@Data
@Accessors(chain = true)
public class Project implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 项目名称
     */
    private String name;
    /**
     * 项目描述
     */
    private String description;
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
    private String createUser;
    /**
     * 更新用户
     */
    private String updateUser;

}
