// Choose this code, because I just finished this question today.
import java.util.*;

public class Letter_Combinations {
    public List<String> letterCombinations(String d) {
        List<String> ans = new ArrayList<>();
        if(d.length() == 0){
            return ans;
        }

        for(int i = 0; i < d.length(); i++){
            String letter =  getLetter(d.charAt(i));
            List<String> newans = new ArrayList<>();
            for(int j = 0; j < ans.size(); j++){
                for (int k = 0; k < letter.length(); k++){
                    newans.add(ans.get(j) + Character.toString(letter.charAt(k)));
                }
            }
            ans = newans;
        }
        return ans;
    }

    private String getLetter(char digit){
        switch(digit){
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
            case '0':
                return " ";
            default:
                return "";
        }
    }
}

