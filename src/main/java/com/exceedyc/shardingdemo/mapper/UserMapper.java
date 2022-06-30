package com.exceedyc.shardingdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.exceedyc.shardingdemo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author exccedy
 * @date 2022/6/30
 **/
@Repository
public interface UserMapper extends BaseMapper<User> {
}
