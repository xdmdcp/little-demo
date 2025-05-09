package cn.chenlijian.little.demo.log.common;

import cn.chenlijian.little.common.entity.log.ApiLogDTO;
import cn.chenlijian.little.starter.log.publisher.LogPublisher;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 数据库日志发布者
 * <p>
 * 该服务类负责将API调用的日志信息输出到日志系统中
 * 主要作用是通过日志记录API调用的详细情况，以便于后续审计或问题排查
 *
 * @author chenlijian
 * @since 2025/05/09 08:05
 */
@Slf4j
@Service
public class DatabaseLogPublisher implements LogPublisher {
    /**
     * 发布日志记录
     * <p>
     * 本方法接收一个ApiLogDTO对象，将其转换为JSON字符串，并记录到日志系统中
     * 主要用于记录API调用的日志信息，以便于后续的分析和审计
     *
     * @param record 操作日志记录对象，包含日志的相关信息
     */
    @Override
    public void publish(ApiLogDTO record) {
        // TODO 实现自定义操作日志记录的逻辑
        log.info("数据库记录日志：{}", JSONUtil.toJsonStr(record));
    }
}
