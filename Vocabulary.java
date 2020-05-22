package com.example.agendiario;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "vocabularies")

public class Vocabulary {

   

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "vocabularyId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "vocabularyWord")
    private String mWord;

    private String mMeaning;

    public Vocabulary(@Nullable String word, String meaning, int level, String creationDate) {
        mWord = word;
        mMeaning = meaning;
        mLevel = level;
        mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getWord() {
        return mWord;
    }

    public void setWord(String word) {
        mWord = word;
    }

    public String getMeaning() {
        return mMeaning;
    }

    public void setMeaning(String meaning) {
        mMeaning = meaning;
    }

    public int getLevel() {
        return mLevel;
    }

    public void setLevel(int level) {
        mLevel = level;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    private int mLevel;
    private String mCreationDate;

}


//muito bom
