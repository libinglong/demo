package com.huli.saas.multirenter.autogen.test_data.service.impl;

import com.huli.saas.multirenter.autogen.test_data.mapper.ProjectMapper;
import com.huli.saas.multirenter.autogen.test_data.service.IProjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 项目表，一个项目集成了一个或多个资源 服务实现类
 * </p>
 *
 * @author libinglong
 * @since 2019-11-20
 */
@Service
public class ProjectServiceImpl extends ServiceImpl<ProjectMapper, Project> implements IProjectService {

}
