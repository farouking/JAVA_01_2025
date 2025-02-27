import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rollArrList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int num = randMachine.nextInt(20) + 1; // range 20
            rollArrList.add(num);
        }
        return rollArrList;
    }

    public char getRandomLetter() {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray(); 
        Random newRandom = new Random();
        return alphabet[newRandom.nextInt(26)]; 
    }

    public String generatePassword() {
        String password = "";
        for (int i = 0; i < 8; i++) {
            password += getRandomLetter();
        }
        return password;
    }

    public String[] getNewPasswordSet() {
        String[] passwordSet = new String[6];
        for (int i = 0; i < 6; i++) {
            passwordSet[i] = generatePassword();
        }
        return passwordSet;
    }

    public int[] shuffleArray(int[] arr) {
        int[] newArr = arr.clone(); // Create a copy of the array
        for (int i = 0; i < newArr.length; i++) { // Loop through the array length
            int indexOne = randMachine.nextInt(newArr.length);
            int indexTwo = randMachine.nextInt(newArr.length);

            int temp = newArr[indexTwo];
            newArr[indexTwo] = newArr[indexOne];
            newArr[indexOne] = temp;
        }
        return newArr;
    }
}