package Scope;

public class Ids {
    static boolean isGoodId(String s){
        if(s == null) return false;
        for(String t : goodIds){
            if(s.equals(t)) return true;
        }
        return false;
    }
    private Ids(){}

    private final static String[] goodIds =
            {"012",
                    "014",
                    "021",
                    "022",
                    "091",
                    "193",
                    "199",
                    "224",
                    "479",
                    "412",
                    "620",
                    "922"
            };
}
