package cn.edu.seu.market.user.service.impl;

import cn.edu.seu.market.user.entity.TUser;
import cn.edu.seu.market.user.mapper.TUserMapper;
import cn.edu.seu.market.user.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-02-27
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
