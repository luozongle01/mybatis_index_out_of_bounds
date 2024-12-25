package demo;

import entity.City;
import mapper.CityMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CityDemo {

    public static void main(String[] args) throws IOException {
        try (InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml")) {

            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
                CityMapper mapper = sqlSession.getMapper(CityMapper.class);
                List<City> all = mapper.findAll();
                System.out.println(all);
            }
        }
    }
}
