package com.huli.saas.multirenter.autogen.tenants.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huli.saas.multirenter.autogen.BaseController;
import com.huli.saas.multirenter.autogen.tenants.entity.Project;


/**
 * <p>
 * 项目表，一个项目集成了一个或多个资源
 * </p>
 *
 * @author plugin
 * @since 2019-11-25
 */
@RestController
@RequestMapping("tenants/project")
public class ProjectController extends BaseController<Project> {


}