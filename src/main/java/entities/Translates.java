package entities;

import javax.persistence.*;

@Entity
@Table(name = "translates")
public class Translates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "translate_id")
    private long translateId;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "original_id")
    private Original original;
    @Column(name = "translate_word")
    private String translateWord;

    public Translates() {
    }

    public Translates(long translateId, Original original, String translateWord) {
        this.translateId = translateId;
        this.original = original;
        this.translateWord = translateWord;
    }

    public Translates(Original original, String translateWord) {
        this.original = original;
        this.translateWord = translateWord;
    }

    public long getTranslateId() {
        return translateId;
    }

    public void setTranslateId(long translateId) {
        this.translateId = translateId;
    }

    public Original getOriginal() {
        return original;
    }

    public void setOriginal(Original original) {
        this.original = original;
    }

    public String getTranslateWord() {
        return translateWord;
    }

    public void setTranslateWord(String translateWord) {
        this.translateWord = translateWord;
    }
}
