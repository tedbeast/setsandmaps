import java.util.HashSet;
import java.util.Set;

/**
 * Service class should be able to add numbers to set, check if a number is contained, and remove numbers from a set
 */
public class NumberSetService {
    // Sets contain unique elements (no duplicates - ie, the number 2 either is or is not contained in the set - not at a certain index)
    // vs, Lists contain ordered elements (in an index, allowing for duplicates)
    // Integer is a wrapper class - it's a class that is used to create Objects that wrap around primitive types - 
    // Java offers automatic conversion from wrapper classes to primitives, because Collections can't store primitives
    Set<Integer> numbers;
    public NumberSetService(){
        // eg, hashset, treeset all implement set functionality
        numbers = new HashSet(); 
    }
    /**
     * add a new unique number to numbers
     * @param num
     */
    public void addToNumbers(int num){
        // autoboxing - the primitive automatically gets 'boxed' into an Object
        numbers.add(num);
    }

    /**
     * check if a number already exists in numbers
     */
    public boolean checkNumbers(int num){
        return numbers.contains(num);
    }
    /**
     * remove a number
     */
    public void removeNumber(int num){
        numbers.remove(num);
    }

}
