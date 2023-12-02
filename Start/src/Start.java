// single-line comment
/*
    multi-line comment
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Start {
    static Random rand = new Random();

    public static void main(String[] args) {
        //generateJokerNumbers();
        int[] randomNumbers = generateRandomNumbers(10);

        // function, that prints an integer array
        printArray(randomNumbers);

        // function, that calculates the sum of all array elements
        int sum = calculateSum(randomNumbers);
        System.out.println("Summe: " + sum);

        // function, that calculates the avg of all array elements
        double avg = calculateAvg(randomNumbers);
        System.out.println("Durchschnitt: " + avg);

        int[] lottoNumbers = generateLottoNumbers();
        printArray(lottoNumbers);

        // min aller lottoNumbers heraussuchen
        int min = findMin(lottoNumbers);
        System.out.println("Min: " + min);

        // max aller lottoNumbers heraussuchen
        int max = findMax(lottoNumbers);
        System.out.println("Max: " + max);

        sortArr(lottoNumbers);
        printArray(lottoNumbers);

        Arrays.sort(lottoNumbers);
    }

    static void sortArr(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 1; j < (array.length-i); j++){
                if (array[j-1] > array[j]){
                    swapArrValues(array, j-1, j);
                }
            }
        }
    }

    static void swapArrValues(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    static int findMin(int[] numbers) {
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        return min;
    }

    static int findMax(int[] numbers) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        return max;
    }

    static int[] generateLottoNumbers() {
        int filledElements = 0;
        int[] lottoNumbers = new int[6];

        while (filledElements < lottoNumbers.length) {

            int randomNumber = rand.nextInt(45) + 1;

            if (!contains(lottoNumbers, randomNumber)) {
                lottoNumbers[filledElements] = randomNumber;
                filledElements++;
            }

        }

        return lottoNumbers;
    }

    static boolean contains(int[] haystack, int needle) {
        for (int tmpNumber : haystack) {
            if (tmpNumber == needle) {
                return true;
            }
        }
        return false;
    }

    static int calculateSum(int[] numbers) {
        int sum = 0;

        for (int tmpNumber : numbers) {
           sum += tmpNumber;
        }

        return sum;
    }

    static double calculateAvg(int[] numbers) {
        double sum = calculateSum(numbers);
        return sum / numbers.length;
    }

    static void printArray(int[] numbers) {
        for (int tmpNumber : numbers) {
            System.out.print(tmpNumber + " ");
        }
        System.out.print("\n");
    }

    static int[] generateRandomNumbers(int length) {
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }

        return numbers;
    }

    static int sum(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * generiert 6 zufällige Joker-Zahlen zwischen 0 und 9 wobei jede mehrfach vorkommen kan.
     * Anschließend werden sie noch ausgegeben.
     */
    static void generateJokerNumbers() {
        // Joker-Zahlen (6 zufällige Zahlen zwischen 0 und 9, wobei jede mehrfach vorkommen kann)
        int[] jokerNumbers = new int[6];

        for (int i = 0; i < jokerNumbers.length; i++) {
            jokerNumbers[i] = rand.nextInt(10);
        }

        for (int tmpNumber : jokerNumbers) {
            System.out.print(tmpNumber + " ");
        }
    }

    static void start() throws IOException {
        System.out.println("Start");

        byte veryShortNumber = 22;
        System.out.println(veryShortNumber);

        short shortNumber = 555;
        System.out.println(shortNumber);

        int number = 1234567;
        System.out.println(number);

        boolean isValid = true;
        char letter = 'T';

        String firstName = "Thomas";
        String lastname = "Hintersteiner";
        String fullName = firstName + " " + lastname;

        System.out.println(fullName);

        if (shortNumber > 500) {
            System.out.println(shortNumber + " ist größer als 500");
        } else {
            System.out.println(shortNumber + " ist kleiner oder gleich 500");
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        int[] numbers = {1, 2, 4, 5, 9, 8};

        for (int tmpNumber : numbers) {
            System.out.println(tmpNumber);
        }

        for (char tmpLetter : firstName.toCharArray()) {
            System.out.println(tmpLetter);
        }

        int[] randomNumbers = new int[10];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rand.nextInt(100) + 1;
        }

        for (int tmpNumber : randomNumbers) {
            System.out.println(tmpNumber);
        }

        // Einlesen einer Eingabe von der Konsole
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Geben Sie bitte den aktuellen Wochentag ein: ");
        String dayOfWeek = reader.readLine();
        System.out.println("heute ist: " + dayOfWeek);
    }

}
