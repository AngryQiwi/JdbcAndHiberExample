package entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "original")
public class Original {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "original_id")
    private long originalId;
    @Column(name = "original_word")
    private String originalWord;
    @Column(name = "language")
    private String originalLanguage;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "original", cascade = CascadeType.ALL)
    private List<Translates> translates;

    public Original() {
    }

    public Original(String originalWord, String originalLanguage, List<Translates> translates) {
        this.originalWord = originalWord;
        this.originalLanguage = originalLanguage;
        this.translates = translates;
    }

    public Original(long originalId, String originalWord, String originalLanguage, List<Translates> translates) {
        this.originalId = originalId;
        this.originalWord = originalWord;
        this.originalLanguage = originalLanguage;
        this.translates = translates;
    }

    public long getOriginalId() {
        return originalId;
    }

    public void setOriginalId(long originalId) {
        this.originalId = originalId;
    }

    public String getOriginalWord() {
        return originalWord;
    }

    public void setOriginalWord(String originalWord) {
        this.originalWord = originalWord;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public List<Translates> getTranslates() {
        return translates;
    }

    public void setTranslates(List<Translates> translates) {
        this.translates = translates;
    }
}
