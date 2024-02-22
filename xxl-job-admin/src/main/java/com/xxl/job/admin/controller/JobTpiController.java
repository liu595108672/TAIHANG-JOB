package com.xxl.job.admin.controller;

import com.xxl.job.admin.controller.annotation.PermissionLimit;
import com.xxl.job.admin.core.vo.UpdateJobCronVo;
import com.xxl.job.admin.service.XxlJobService;
import com.xxl.job.core.biz.model.ReturnT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: LiuZhaoYang
 * @create-date: 2024/2/4
 */
@RequestMapping("tpi")
@RestController
public class JobTpiController {

    private static Logger logger = LoggerFactory.getLogger(JobTpiController.class);

    @Resource
    private XxlJobService xxlJobService;

    /**
     * 提供给其他平台 根据“执行句柄名称”更新任务时间周期的接口
     *
     * 热修改，仅限更新定时时间
     *
     * @param updateJobCronVo
     * @return
     */
    @PermissionLimit(limit = false)
    @PostMapping("updateCron")
    public ReturnT<String> updateJobCron(@RequestBody UpdateJobCronVo updateJobCronVo){

        logger.info(" {} update handler cron!  handler: {}, cron: {}", updateJobCronVo.getTpiAppName(),updateJobCronVo.getExecutorHandler(),updateJobCronVo.getCronStr());

        return xxlJobService.updateJobCron(updateJobCronVo.getExecutorHandler(),updateJobCronVo.getCronStr());
    }

}

