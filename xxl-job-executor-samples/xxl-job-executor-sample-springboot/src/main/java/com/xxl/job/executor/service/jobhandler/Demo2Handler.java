package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHander;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/4/9 0009.
 */
@JobHander("lizhenDemo2Handler")
@Service
public class Demo2Handler extends IJobHandler {
    @Override
    public ReturnT<String> execute(String... params) throws Exception {
        System.out.println("Demo2Handler执行。。。。======================="+ params[0]);
        ReturnT.SUCCESS.setContent("真好");
        return ReturnT.SUCCESS;
    }
}
