package com.huli.saas.multirenter.autogen.tenants.service.impl;


import com.huli.saas.multirenter.autogen.tenants.entity.Person;
import com.huli.saas.multirenter.autogen.tenants.mapper.PersonMapper;
import com.huli.saas.multirenter.autogen.tenants.service.IPersonService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author plugin
 * @since 2019-12-01
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

}
