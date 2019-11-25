package com.huli.saas.multirenter.autogen.tenants.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huli.saas.multirenter.autogen.BaseController;
import com.huli.saas.multirenter.autogen.tenants.entity.ResourceRule;


/**
 * <p>
 * 规则表，一个规则应该获取到某个资源所对应的的所有的上下文，如client_id,project_id,resource_id
 * </p>
 *
 * @author plugin
 * @since 2019-11-25
 */
@RestController
@RequestMapping("tenants/resource_rule")
public class ResourceRuleController extends BaseController<ResourceRule> {


}