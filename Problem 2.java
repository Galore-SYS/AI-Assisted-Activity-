public class Main {

    public static void main(String[] args) {
        int[] grade = {60, 75, 88, 74, 91};
        int mark = 75;
        int index = 0;

        int result = countPassing(grade, mark);
        System.out.println("Your result is: " + result);

        int result2 = countPassingRecursive(grade, mark, index);
        System.out.println("Your result in recursive is: " + result2);
    }

    public static int countPassing(int[] grades, int passingMark) {
        if (grades.length == 0) {
            return 0;
        }
        int passed = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= passingMark) {
                passed += 1;
            }
        }
        return passed;
    }

    // 1. index goes up by 1 each time (index + 1) to move to the next item, 
    // otherwise it would just get stuck checking the same spot forever.
    // 2. if you delete the base case, it loops endlessly.
    public static int countPassingRecursive(int[] grades, int passingMark, int index) {
        // Stop when we pass the last grade
        if (index == grades.length) {
            return 0;
        }

        // If this grade passes, count 1 + rest of the array
        if (grades[index] >= passingMark) {
            return 1 + countPassingRecursive(grades, passingMark, index + 1);
        }

        // Otherwise, count 0 (just the rest of the array)
        return countPassingRecursive(grades, passingMark, index + 1);
    }
}
