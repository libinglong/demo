package com.huli.saas.multirenter.autogen.tenants.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 规则表，一个规则应该获取到某个资源所对应的的所有的上下文，如client_id,project_id,resource_id
 * </p>
 *
 * @author plugin
 * @since 2019-11-25
 */

@Data
@Accessors(chain = true)
public class ResourceRule implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(type = IdType.ID_WORKER)
    private Long id;
    /**
     * 规则名称
     */
    private String name;
    /**
     * 规则描述
     */
    private String description;
    /**
     * 规则类型
     */
    private Integer ruleType;
    /**
     * 规则定义
     */
    private String rule;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    private LocalDate updateTime;
    /**
     * 创建用户
     */
    private String createUser;
    /**
     * 更新用户
     */
    private String updateUser;

}
