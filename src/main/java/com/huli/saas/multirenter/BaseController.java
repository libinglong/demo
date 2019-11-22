package com.huli.saas.multirenter;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author libinglong HLJF0921
 * <a href="mailto:libinglong@huli.com">libinglong:libinglong@huli.com</a>
 * @since 2019/11/20
 */
public class BaseController<T> {
    
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
        //todo
        throw new UnsupportedOperationException();
//        UpdateWrapper<T> wrapper = new UpdateWrapper<>(entityVO);
//        return iService.update(entityVO,null);
    }

    @GetMapping
    public List<T> entities(T entityVO){
        return iService.list(new QueryWrapper<>(entityVO));
    }
    
    @GetMapping("page")
    public IPage<T> selectPage(IPage<T> iPage, T entityVO){
        return iService.page(iPage,new QueryWrapper<>(entityVO));
    }
    
}
