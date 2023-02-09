package shop.mtcoding.blog4.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BoardRepository {

        public Board findById(int id);

        public List<Board> findAll();

        public int insert(@Param("title") String title, @Param("content") String content,
                        @Param("thumbnail") String thumbnail, @Param("userId") int userId);

        public int updateById(@Param("id") int id, @Param("title") String title, @Param("content") String content,
                        @Param("thumbnail") String thumbnail);

        public int deleteById(int id);

}
