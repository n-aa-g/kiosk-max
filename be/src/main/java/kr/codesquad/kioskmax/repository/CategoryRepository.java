package kr.codesquad.kioskmax.repository;

import kr.codesquad.kioskmax.domain.Category;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepository {
    NamedParameterJdbcTemplate jdbcTemplate;

    public List<Category> findAll() {
        return null;
    }
}
