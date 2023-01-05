import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        DictionaryService ds = new DictionaryService();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(ds.words);
            System.out.println("put | get");
            String choice = sc.nextLine();
            if(choice.equals("put")){
                String key = sc.nextLine();
                String value = sc.nextLine();
                ds.addWordDefinitionPair(key, value);
            }else if(choice.equals("get")){
                String key = sc.nextLine();
                System.out.println(ds.retrieveDefinition(key));
            }
        }
    }
}