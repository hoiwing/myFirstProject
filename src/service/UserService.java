package service;

import domain.PageBean;
import domain.User;

import java.util.List;
import java.util.Map;

/**
 * 用户管理的业务接口
 */
public interface UserService {

    /**
     * 查询用户的所有信息
     */
    public List<User> findAll();

    /**
     * 登录方法
     * @param user
     * @return
     */
    public User login(User user);

    /**
     * 保存User
     */
    public void addUser(User user);

    /**
     * 根据id 删除User
     * @param id
     */
    public void deleteUser(String id);

    /**
     * 根据id 查询User
     * @param id
     * @return
     */
    public User findUserById(String id);

    /**
     * 修改用户信息
     * @param user
     */
    public void updateUser(User user);

    /**
     * 批量删除用户
     * @param uids
     */
    public void delSelectedUser(String[] uids);

    /**
     * 分页条件查询
     * @param currentPage
     * @param rows
     * @param condition
     * @return
     */
    PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);
}
