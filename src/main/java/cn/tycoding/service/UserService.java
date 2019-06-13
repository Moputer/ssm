package cn.tycoding.service;

import cn.tycoding.pojo.User;

/**
 * @author Moputer
 * @date 19-5-7下午9:09
 */
public interface UserService extends BaseService<User> {

    User login(String username);
}
