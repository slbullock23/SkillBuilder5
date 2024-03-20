/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * @author (Saniyah L Bullock)
 * @version (3-19-2024)
 */
public class SkillBuilder5
{
    /**
     * Calculates the prefix average of array data and returns the prefix average
     * in a new array.  The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     *         from data.
     */
    public static double[] prefixAverage(double[] data)
    {
        int m = data.length; // takes the length of the array
        double[] avg = new double[m]; // creates a new array with the same length

        double sum = 0; // initializes the variable for the sum
        for (int i = 0; i < m; i++) { // for i less than the length of the array
            sum += data[i]; // adds the array data to the variable for sum
            avg[i] = sum / (i + 1); // adds the averages to the new array
        }
        return avg;
    }

    /**
     * Finds the location in array anArray where value is located.  If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param searchValue value to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the value in the array; -1 otherwise.
     */
    public static int  indexOf(int searchValue, int[] anArray)
    {
        for (int i = 0; i < anArray.length; i++) { // for i less than the array length
            if (anArray[i] == searchValue) { // if the value is the same as the search value
                return i; // Return index if value is found // return where the value is
            }
        }
        return -1; // if not, return -1
    }

    /**
     * Finds the location in array anArray where string s is located.  If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param s a string to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the string s in the array; -1 otherwise.
     */
    public static int  indexOf(String s, String[] anArray)
    {
        for (int i = 0; i < anArray.length; i++) { // for i less than the length of the array
            if (anArray[i].equals(s)) { // if the string equals the string in the param (s)
                return i; // return the index
            }
        }
        return -1; // if not, return -1
    }

    /**
     * Finds all occurrence of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     * @param s string to search for in array
     * @param anArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String s, String[] anArray) {
        int counter = 0; // creates a variable for counting the times s occurs in the array
        for (int i = 0; i < anArray.length; i++) { // for i less than the length of the array
            if (anArray[i].equals(s)) { // if the string equals the string
                counter++; // add 1 to the occurrence counter
            }
        }

        String[] newArr = new String[anArray.length - counter]; // creating a new array with the same length

        int arrIndex = 0; // initializes the arrIndex variable
        for (int i = 0; i < anArray.length; i++) { // for i less than the length of the array
            if (!anArray[i].equals(s)) { // if the string does not equal the string
                newArr[arrIndex] = anArray[i]; // assigns anArray[i] to the index of the new array, swaps them
                arrIndex++; // moves to the next index
            }
        }

        return newArr; // if false, returns the new array with the string removed from it
    }

    /**
     * Reverses an array of integers.
     * @param anArray the array whose contents should be reversed.
     */
    public static void reverse(int[] anArray) {
        int length = anArray.length; // initializes the length of an array to an int
        for (int i = 0; i < length/2; i++) { // for i less than the length
            int temp = anArray[i]; // assigns each item in the array to temp
            anArray[i] = anArray[length - i - 1]; // swaps the item at index with its opposite // for example, 1 swaps with 10
            anArray[length - i - 1] = temp; // assigns temp to it
        }
}
}
