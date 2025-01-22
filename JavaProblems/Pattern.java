package JavaProblems;
import java.util.HashMap;
public class Pattern {

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean result = wordPattern(pattern, s);
        System.out.println(result); //result is True

        pattern = "abba";
        s = "dog cat cat fish";
        result = wordPattern(pattern, s);
        System.out.println(result); //result is False
    }

    public static boolean wordPattern(String pattern, String s) {

        boolean flag = false;
        HashMap<Character,String> match = new HashMap<Character, String>();

        String[] word = s.split(" ");

        if(pattern.length() == word.length){

            for(int i=0; i<pattern.length(); i++){
                char letter = pattern.charAt(i);
                String temp = word[i];

                if(!match.containsKey(letter)){ //key not inside
                    if(match.containsValue(temp)){ //value inside but not from the same key
                        return false;
                    }
                    else if(!match.containsValue(temp)){ //value and key not found
                        match.put(letter, temp);
                        flag = true;
                    }

                    //System.out.println()
                }
                else if(match.containsKey(letter)){ //key inside
                    if(match.get(letter).equals(temp)){ //key and value are the same
                        flag = true;
                    }
                    else{ //value is not the same
                        return false;
                    }
                }



            }




        }



        return flag;



    }

}
