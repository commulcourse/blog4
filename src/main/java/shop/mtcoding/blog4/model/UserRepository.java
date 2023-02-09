package shop.mtcoding.blog4.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserRepository {

        public User findById(int id);

        public List<User> findAll();

        public int insert(@Param("username") String username, @Param("password") String password,
                        @Param("email") String email);

        public int updateById(@Param("username") String username, @Param("password") String password,
                        @Param("email") String email);

        public int deleteById(int id);
}
// 일단 크게 아이디 하나 짜리, findAll, CRUD만들어야 한다.