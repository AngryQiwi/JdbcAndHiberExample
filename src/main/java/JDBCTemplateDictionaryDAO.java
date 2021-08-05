import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.sql.DataSource;


public class JDBCTemplateDictionaryDAO extends JdbcDaoSupport implements DictionaryDAO{

    public JDBCTemplateDictionaryDAO(DataSource dataSource) {
        super.setDataSource(dataSource);
    }

    @Override
    public void add(DictEntry dictEntry) {
        String sql = "begin;insert into original(original_word, language) values (?, ?);insert into translates(original_word, translate_word) values (?, ?);commit;";
        Object[] inputs = new Object[]{dictEntry.getKey(), dictEntry.getLanguage(), dictEntry.getKey(), dictEntry.getValue().get(0)};
        getJdbcTemplate().update(sql, inputs);
    }

    @Override
    public void addTranslate(DictEntry dictEntry, String newValue) {

    }

    @Override
    public void update(DictEntry dictEntry) {

    }

    @Override
    public void deleteByKey(String key) {

    }

    @Override
    public void deleteTranslate(DictEntry dictEntry) {

    }

    @Override
    public List<DictEntry> findAll() {
        return null;
    }

    @Override
    public DictEntry findByKey(String key) {
        return null;
    }

    @Override
    public DictEntry findByValue(String value) {
        return null;
    }

    @Override
    public DictEntry findByKey(String key, String language) {
        return null;
    }

    @Override
    public DictEntry findByValue(String value, String language) {
        return null;
    }
}
