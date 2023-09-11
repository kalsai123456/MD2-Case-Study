package readandwrite;

import managedictionary.Word;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteDictionary {
    public static void writeDictionary(List<Word> wordList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("WordOfDictionary.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(wordList);
            outputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
        }
    }

    public static List<Word> readDictionary() {
        try {
            FileInputStream fileInputStream = new FileInputStream("WordOfDictionary.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<Word>) objectInputStream.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
