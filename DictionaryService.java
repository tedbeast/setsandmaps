import java.util.HashMap;
import java.util.Map;
/**
 * store word keys to definition values
 * keys are unique - definitions are not
 */
public class DictionaryService {
    Map<String, String> words;
    public DictionaryService(){
        words = new HashMap();
    }
/**
 * add a word/definition pair
 * @param word
 * @param definition
 */
    public void addWordDefinitionPair(String word, String definition){
        words.put(word, definition);
    }
    /**
     * get the definition value using a word key
     * @param word
     * @return
     */
    public String retrieveDefinition(String word){
        return words.get(word);
    }
}
