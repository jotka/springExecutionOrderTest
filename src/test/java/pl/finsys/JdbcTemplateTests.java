package pl.finsys;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.finsys.jdbc.JdbcRepository;

import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 04.07.13
 * Time: 12:12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/pl/finsys/jdbc/jdbcConfig.xml")
public class JdbcTemplateTests {
    private
    @Autowired
    JdbcRepository jdbcRepository;

    @Test
    public void shouldAutowire() {
        assertThat(jdbcRepository != null);
    }


    @Test
    public void shoudUseJdbcTemplate() {
        List list = jdbcRepository.useJdbcTemplate();
        assertThat(list).isNotEmpty();
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }
    }

}
