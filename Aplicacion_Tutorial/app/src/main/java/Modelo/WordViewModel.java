package Modelo;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

import Entidad.Word;
import Repositorio.WordRepository;

public class WordViewModel {
    private WordRepository mRepository;

    private final LiveData<List<Word>> mAllWords;

    public WordViewModel (Application application) {
        super();
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }
    LiveData<List<Word>> getAllWords() { return mAllWords; }

    public void insert(Word word) { mRepository.insert(word); }

}
