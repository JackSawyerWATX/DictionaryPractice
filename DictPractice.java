import java.util.HashMap;
import java.util.Map;

public class DictPractice {
    public static void main (String[] args) {
    // English to Spanish Dictionary
    Map<String,String> engSpanDict = new HashMap<String,String>();
    //Dictionary entries
    engSpanDict.put("Monday", "Lunes");
    engSpanDict.put("Tuesday", "Martes");
    engSpanDict.put("Wednesday", "Miércoles");
    engSpanDict.put("Thursday", "Jueves");
    engSpanDict.put("Friday", "Viernes");
    engSpanDict.put("Saturday", "Sábado");
    engSpanDict.put("Sunday", "Domingo");
    //Rertieveing from the dictionary
    System.out.println(engSpanDict.get("Monday"));
    System.out.println(engSpanDict.get("Tuesday"));
    System.out.println(engSpanDict.get("Wednesday"));
    System.out.println(engSpanDict.get("Thursday"));
    System.out.println(engSpanDict.get("Friday"));
    System.out.println(engSpanDict.get("Saturday"));
    System.out.println(engSpanDict.get("Sunday"));
    //print out all keys
    System.out.println("English - " + engSpanDict.keySet());
    //print out all values
    System.out.println("Espanol - " + engSpanDict.values());
    //print out size
    System.out.println("The number of entries in this dictionary is: " + engSpanDict.size());
        //Shopping list
        Map<String,Boolean> shopList = new HashMap<String,Boolean>();
        // stuff in the shopping list
        shopList.put("Bacon", true);
        shopList.put("Bread", Boolean.TRUE);
        shopList.put("Ice Cream", Boolean.TRUE);
        shopList.put("Bourbon", Boolean.FALSE);
        shopList.put("Cauliflower", false);
        // retrieve items
        System.out.println(shopList.get("Bacon"));
        System.out.println(shopList.get("Bourbon"));
        System.out.println(shopList.get("Ice Cream"));
        System.out.println(shopList.get("Bread"));
        System.out.println(shopList.get("Cauliflower"));
        //Key-Value Pairs print out
        System.out.println(shopList.toString());
        //Is empty?
        System.out.println(shopList.isEmpty());
        //remove items
        shopList.remove("Bourbon");
        //Key-Value Pairs print out
        System.out.println(shopList.toString());
        //replace items
        shopList.replace("Bread", Boolean.FALSE);
        //Key-Value Pairs print out
        System.out.println(shopList.toString());
        // clear the dictionary
        shopList.clear();
        //Key-Value Pairs print out
        System.out.println(shopList.toString());
        //Is empty?
        System.out.println(shopList.isEmpty());
    }
}

