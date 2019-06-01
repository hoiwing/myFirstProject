package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import domain.PageBean;
import domain.User;
import service.UserService;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {

    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        //调用dao完成查询
        return dao.findAll();
    }

    @Override
    public User login(User user) {
        System.out.println(user.getUsername()+"--UserServiceImpl--"+user.getPassword());
        return dao.findUserByUsernameAndPassword(user.getUsername(),user.getPassword()) ;
    }

    @Override
    public void addUser(User user) {
        dao.addUser(user);
    }

    @Override
    public void deleteUser(String id) {
        dao.delete(Integer.parseInt(id));
    }

    @Override
    public User findUserById(String id) {
        return dao.findUserById(Integer.parseInt(id));
    }

    @Override
    public void updateUser(User user) {
        dao.updateUser(user);
    }

    @Override
    public void delSelectedUser(String[] uids) {
        //1.遍历数组
        for(String id : uids){
            //调用dao删除
            dao.delete(Integer.parseInt(id));
        }
    }

    @Override
    public PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition) {
        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);

        if(currentPage <= 0){ //解决第一页仍然点击上一页的bug
            currentPage = 1;
        }


        //1.创建空的PageBean对象
        PageBean<User> pb =  new PageBean<User>();

        //2.设置参数
        pb.setCurrentPage(currentPage);
        pb.setRows(rows);

        //3.调用dao查询总记录数
        int totalCount = dao.findTotalCount(condition);
        pb.setTotalCount(totalCount);


        //4.调用dao查询List集合
        //4.1计算开始记录的索引
        int start = (currentPage - 1) * rows;
        List<User> list = dao.findByPage(start,rows,condition);
        pb.setList(list);

        //5.计算总页码
        int totalPage = (totalCount % rows) == 0 ? totalCount / rows : (totalCount/rows) + 1;
        pb.setTotalPage(totalPage);

        if(currentPage > totalPage){//分页最后一页仍然可点击的bug
            currentPage = totalPage;
            pb.setCurrentPage(currentPage);
            start = (currentPage - 1) * rows;
            List<User> lists = dao.findByPage(start,rows, condition);
            pb.setList(lists);

        }

        return pb;
    }


}
