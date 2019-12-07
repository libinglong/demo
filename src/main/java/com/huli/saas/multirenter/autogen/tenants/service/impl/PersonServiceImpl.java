package com.huli.saas.multirenter.autogen.tenants.service.impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.huli.saas.multirenter.autogen.tenants.entity.Person;
import com.huli.saas.multirenter.autogen.tenants.mapper.PersonMapper;
import com.huli.saas.multirenter.autogen.tenants.service.IPersonService;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.cache.annotation.Cacheable;
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
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

    @Override
//    @Cacheable(cacheNames = "person",key = "#a0.entity.name")
    public Person getOne(Wrapper<Person> queryWrapper) {
        Person entity = queryWrapper.getEntity();
        entity.setName(RandomStringUtils.randomAlphabetic(5));
        return super.getOne(new QueryWrapper<>(entity),false);
    }

    @Override
    public boolean save(Person entity) {
        entity.setAge(RandomUtils.nextInt());
        entity.setName(RandomStringUtils.randomAlphabetic(5));
        return retBool(baseMapper.insert(entity));
    }
}
