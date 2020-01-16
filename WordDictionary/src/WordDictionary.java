import java.util.HashMap;
public class WordDictionary {
    private HashMap<String, String> WordDictionary = new HashMap<>();

    public void addWord(String english, String korean) {
        WordDictionary.put(english, korean);
    }

    public String find(String english) {
        english.toLowerCase();
        for (String key : WordDictionary.keySet()) {
            if (key.toLowerCase().equals(english.toLowerCase())) {
                return WordDictionary.get(key);
            }
        }
        return null;
    }
}
