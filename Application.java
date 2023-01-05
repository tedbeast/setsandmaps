import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        NumberSetService nss = new NumberSetService();
        Scanner sc = new Scanner(System.in);
        // the while loop allows the menu to repeat, so the user may continuously add numbers
        while(true){
            System.out.println(nss.numbers);
            System.out.println("add | check | remove");
            String choice = sc.nextLine();
            if(choice.equals("add")){
                // 3 steps on this line - take in a String input - convert it to int - add it to the set in service class
                nss.addToNumbers(Integer.parseInt(sc.nextLine()));
            }else if(choice.equals("check")){
                boolean b = nss.checkNumbers(Integer.parseInt(sc.nextLine()));
                if(b){
                    System.out.println("that number exists");
                }else{
                    System.out.println("that number does not exist");
                }
            }else if(choice.equals("remove")){
                String numberInput = sc.nextLine();
                int number = Integer.parseInt(numberInput);
                nss.removeNumber(number);
            }
        }
    }
}
/**
 * The collections hierarchy
 * Lists: ordered lists of elements, allow duplicates
 * Sets: collections of unique elements - very efficient for this task
 * Queues - kind of a line at a store - first in, first out - EG a tech support channel
 * Stacks - kind of a like a stack of plates - last in, first out - EG undo/redo buttons (a stack of changes) , or email
 * 
 * (maps are not a collection, because they aren't storing collections of objects, but collections of pairs of objects)
 * Maps: unique keys, each of which is mapped to another value
 */