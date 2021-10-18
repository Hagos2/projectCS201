package Scope;

public class Market {
    private final String APPLES = "apples";
    private final String ORANGES = "oranges";
    private final String BLUEBERRIES = "blueberries";
    private final String PLUMS = "plums";
    private final String CHEESE = "cheese";
    private final String BEEF = "beef";
    private final String DILL = "dill";
    private final String YOGURT = "yogurt";

    private final String[] STORE_ITEMS =
            {APPLES ,
                    ORANGES ,
                    BLUEBERRIES,
                    PLUMS ,
                    CHEESE,
                    BEEF,
                    DILL,
                    YOGURT
            };

    boolean carriesFoodItem(String itemName){
        if(itemName == null) return false;
        for(String s : STORE_ITEMS){
            if(itemName.equals(s)) return true;
        }
        return false;
    }
}
