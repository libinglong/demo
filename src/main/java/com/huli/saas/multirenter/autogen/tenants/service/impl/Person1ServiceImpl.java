package com.huli.saas.multirenter.autogen.tenants.service.impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.huli.saas.multirenter.autogen.tenants.entity.Person1;
import com.huli.saas.multirenter.autogen.tenants.mapper.Person1Mapper;
import com.huli.saas.multirenter.autogen.tenants.service.IPerson1Service;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author plugin
 * @since 2019-12-07
 */
@Service
public class Person1ServiceImpl extends ServiceImpl<Person1Mapper, Person1> implements IPerson1Service {

    @Override
//    @Cacheable(cacheNames = "person",key = "#a0.entity.name")
    public Person1 getOne(Wrapper<Person1> queryWrapper) {
        Person1 entity = queryWrapper.getEntity();
        entity.setName(RandomStringUtils.randomAlphabetic(5));
        return super.getOne(new QueryWrapper<>(entity),false);
    }

    @Override
    public boolean save(Person1 entity) {
        entity.setAge(RandomUtils.nextInt());
        entity.setName(RandomStringUtils.randomAlphabetic(5));
        return retBool(baseMapper.insert(entity));
    }
}
