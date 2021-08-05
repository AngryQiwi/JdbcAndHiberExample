import entities.Original;
import entities.Translates;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HibernateDictionaryDAO implements DictionaryDAO{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void add(DictEntry dictEntry) {
        Original original = new Original();
        original.setOriginalLanguage("num");
        original.setOriginalWord("12321");
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(original);
        session.getTransaction().commit();
        session.close();

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
