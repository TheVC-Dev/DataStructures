public class Tester{
    public static void main(String[] args){
       int[] numbers1 = {4, 7, 2, 9, 5};
       int[] numbers2 = {2, 4, 6, 8};
       int[] numbers3 = {};

       System.out.println(RecursionAssignment.countOdd(numbers1, 0));
       System.out.println(RecursionAssignment.countOdd(numbers2, 0));
       System.out.println(RecursionAssignment.countOdd(numbers3, 0));

       int[] numbers4 = {4, 7, 2, 9, 5};
       int[] numbers5 = {-8, -3, -12, -5};
       int[] numbers6 = {20};

       System.out.println(RecursionAssignment.findMaximum(numbers4, 0));
       System.out.println(RecursionAssignment.findMaximum(numbers5, 0));
       System.out.println(RecursionAssignment.findMaximum(numbers6, 0));

       int[] numbers7 = {4, 7, 2, 7, 7};
       int[] numbers8 = {4, 7, 2};
       int[] numbers9 = {};

       System.out.println(RecursionAssignment.countOccurrences(numbers7, 7, 0));
       System.out.println(RecursionAssignment.countOccurrences(numbers8, 9, 0));
       System.out.println(RecursionAssignment.countOccurrences(numbers9, 5, 0));
    }
}
