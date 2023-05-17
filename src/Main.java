import java.util.*;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }
public static void task1() {
    List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    System.out.println();
    System.out.println("Task 1");
    for (Integer num : nums) {
        if(num % 2 ==0) {
            System.out.print(num + " ");
        }
    }
    System.out.println();
} // end of task1

public static void task2() {
    List<Integer> numsList = new ArrayList<>(List.of(100, 1, 14, 2, 3, 4, 4, 66, 5, 5, 6, 7, 44));
    Set<Integer> numsSet = new HashSet<>();
    System.out.println("Task 2");
    for (Integer num : numsList) {
        if(num % 2 ==0) {
            numsSet.add(num);
        }
    }
    numsList = new ArrayList<>(numsSet);
    Collections.sort(numsList);
    System.out.println(numsList);
} // end of task2
    public static void task3() {
        List<String> wordsList = new ArrayList<>(List.of("один", "два","два", "три", "три", "три", "число", "число"));
        Set<String> wordsSet = new HashSet<>(wordsList);

        System.out.println("Task 3");
        System.out.println(wordsSet);

    } // end of task3

    public static void task4() {
        List<String> wordsList = new ArrayList<>(List.of("один", "два","два", "три", "три", "три", "число", "число"));
        Map<String, Integer> wordsMap = new HashMap<>();

        System.out.println("Task 4");
        for (String word : wordsList) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
        System.out.println(wordsMap);
    } // end of task4

} //edn of main