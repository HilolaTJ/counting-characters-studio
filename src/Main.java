public class Main {

    public static void main(String[] args){
        CharacterCounter myCharacterCounter = new CharacterCounter();
        String myUsersInput = myCharacterCounter.getUserInput();
        myCharacterCounter.countCharacters(myUsersInput);
    }
}
