package cn.tycoding.service;

import cn.tycoding.pojo.Customer;
import cn.tycoding.pojo.PageBean;

/**
 * @author Moputer
 * @date 19-5-7下午9:09
 */
public interface CustomerService extends BaseService<Customer> {

    /**
     * 分页查询
     * @param customer 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页的记录数
     * @return
     */
    PageBean findByPage(Customer customer, int pageCode, int pageSize);

}
