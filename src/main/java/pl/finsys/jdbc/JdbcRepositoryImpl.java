package pl.finsys.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 04.07.13
 * Time: 12:05
 */
public class JdbcRepositoryImpl implements JdbcRepository {
    private JdbcTemplate jdbcTemplate;

    public JdbcRepositoryImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List useJdbcTemplate() {

        List list = jdbcTemplate.queryForList("SELECT * FROM T_ACCOUNT");
        return list;
    }
}
