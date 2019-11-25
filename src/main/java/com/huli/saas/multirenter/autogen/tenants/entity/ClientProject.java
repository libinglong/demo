package com.huli.saas.multirenter.autogen.tenants.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author plugin
 * @since 2019-11-25
 */

@Data
@Accessors(chain = true)
public class ClientProject implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 客户端id
     */
    private Long clientId;
    /**
     * 项目id
     */
    private Long projectId;
    /**
     * 运行时参数
     */
    private String context;

}
