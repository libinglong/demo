package com.huli.saas.multirenter.autogen;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;


/**
 * <p>
 * base控制器
 * </p>
 *
 * @author plugin
 * @since 2019-11-25
 */
public class BaseController<T> {

    @Autowired
    protected IService<T> iService;

    @PostMapping
    public boolean save(T entityVO){
        return iService.save(entityVO);
    }

    @DeleteMapping
    public boolean delete(T entityVO){
        return iService.remove(new QueryWrapper<>(entityVO));
    }

    @PutMapping
    public boolean update(T entityVO){
                throw new UnsupportedOperationException();
    }

    @GetMapping
    public List<T> entities(T entityVO){
        return iService.list(new QueryWrapper<>(entityVO));
    }

    @GetMapping
    public IPage<T> selectPage(IPage<T> iPage){
                throw new UnsupportedOperationException();
    }

}