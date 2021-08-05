import java.util.List;

public interface DictionaryDAO {
    void add(DictEntry dictEntry);
    void addTranslate(DictEntry dictEntry, String newValue);
    void update(DictEntry dictEntry);
    void deleteByKey(String key);
    void deleteTranslate(DictEntry dictEntry);
    List<DictEntry> findAll();
    DictEntry findByKey(String key);
    DictEntry findByValue(String value);
    DictEntry findByKey(String key, String language);
    DictEntry findByValue(String value, String language);
}
