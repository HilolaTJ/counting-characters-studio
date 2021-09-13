import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCounter {

    // Class Variables

    // Constructors

    public CharacterCounter(){
    }
    // Methods
    public void countCharacters(String wordToCount) {

        // Make string case-insensitive
        wordToCount = wordToCount.toLowerCase();

        char[] arrayOfChars = wordToCount.toCharArray();
        HashMap<Character, Integer> myCharacterCount = new HashMap<>();
        for (int i = 0; i < arrayOfChars.length; i++) {

            // Exclude non-alphabetic characters
            if(Character.isLetter(arrayOfChars[i]) == false) {
                // exclude it!
                continue;
            }

            // Add or update the count of each character into the hash map
            char theCharacter = arrayOfChars[i];
            if (myCharacterCount.containsKey(theCharacter) == false) {
                // does not contain the key
                myCharacterCount.put(theCharacter, 1);
            } else {
                // does contain teh key
                Integer theValue = myCharacterCount.get(theCharacter);
                theValue = theValue + 1;
                myCharacterCount.put(theCharacter, theValue);
            }
        }
        ArrayList<Character> myCharacterKeys = new ArrayList<>(myCharacterCount.keySet());
        for(int i = 0; i < myCharacterKeys.size(); i++) {
           Integer theValue = myCharacterCount.get(myCharacterKeys.get(i));
           System.out.println(myCharacterKeys.get(i) + ": " + theValue);
        }
    }

    public String getUserInput(){
        Scanner myScanner = new Scanner(System.in);

        String myUsersInput = myScanner.nextLine();

        myScanner.close();

        return myUsersInput;
    }
}
