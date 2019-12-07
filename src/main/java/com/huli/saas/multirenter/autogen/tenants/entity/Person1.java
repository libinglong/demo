package com.huli.saas.multirenter.autogen.tenants.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author plugin
 * @since 2019-12-07
 */

@Data
@Accessors(chain = true)
public class Person1 implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 
     */
    private String name;
    /**
     * 
     */
    private Integer age;
    /**
     * 
     */
    private LocalDateTime createtime;

}
