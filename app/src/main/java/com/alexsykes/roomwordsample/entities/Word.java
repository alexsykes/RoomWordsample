package com.alexsykes.roomwordsample.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name="word")
    private String mWord;
    private int numLetters;

    public Word(@NonNull String mWord) {
        this.mWord = mWord;
        this.numLetters = mWord.length();
    }

    public int getNumLetters() {
        return numLetters;
    }

    public void setNumLetters(int numLetters) {
        this.numLetters = numLetters;
    }

    public String getWord() {
        return this.mWord;
    }
}
