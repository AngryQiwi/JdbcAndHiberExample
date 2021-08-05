import java.util.ArrayList;

public class DictEntry {
    private String key;
    private ArrayList<String>  value;
    private String language;

    public DictEntry(String key, ArrayList<String> value, String language) {
        this.key = key;
        this.value = value;
        this.language = language;
    }

    public DictEntry() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ArrayList<String> getValue() {
        return value;
    }

    public void setValue(ArrayList<String> value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return key + '-' + value + ';';
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}

