package cn.tycoding.mapper;

import cn.tycoding.pojo.User;

/**
 * @author Moputer
 * @date 19-5-7下午9:09
 */
public interface UserMapper {

    User login(String username);
}
