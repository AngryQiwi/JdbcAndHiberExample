import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> translates = new ArrayList<>();
        /*translates.add("22тыщи222");
        translates.add("двойки");*/
        DictEntry entry = new DictEntry("22222", translates, "num");
        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DictionaryDAOConfig.class);
        JDBCTemplateDictionaryDAO jdbcTemplateDictionaryDAO = (JDBCTemplateDictionaryDAO) context.getBean("jdbcTemplateDictionaryDAO");
        jdbcTemplateDictionaryDAO.add(entry);*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DictionaryDAOConfig.class);
        HibernateDictionaryDAO dictionaryDAO = (HibernateDictionaryDAO) context.getBean("hibernateDictionaryDAO");
        dictionaryDAO.add(entry);
    }
}
