package com.huli.saas.multirenter.autogen;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 * base控制器
 * </p>
 *
 * @author plugin
 * @since 2019-12-01
 */
public class BaseController<T> {

    @Autowired
    protected IService<T> iService;

    @PostMapping
    public boolean save(@RequestBody T entity){
        return iService.save(entity);
    }

    @DeleteMapping
    public boolean delete(@RequestBody T entity){
        return iService.remove(new QueryWrapper<>(entity));
    }

    @PutMapping
    public boolean update(@RequestPart("entity")T entity,@RequestPart("condition")T condition){
        return iService.update(entity,new UpdateWrapper<>(condition));
    }

    @PostMapping(params = "queryPage")
    public IPage<T> entities(@RequestPart("page") Page<T> page, @RequestPart("condition") T condition){
        return iService.page(page,new QueryWrapper<>(condition));
    }

}