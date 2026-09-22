public class RecursionAssignment{
    public static int countOdd(int[] numbers, int index){
        //base case
        if (index == numbers.length){
            return 0;
        }
        int isOdd = (numbers[index] % 2 != 0) ? 1 : 0;
        return isOdd + countOdd(numbers, index + 1);
    }

    public static int findMaximum(int[] numbers, int index){
        if (numbers.length == 0){
            throw new IllegalArgumentException("List cannot be empty");
        }
        if (index == numbers.length - 1){
            return numbers[index];
        }
        else{
            return Math.max(numbers[index], findMaximum(numbers, index+1));
        }
    }

    public static int countOccurrences(int[] numbers, int target, int index){
        if (index == numbers.length){
            return 0;
        }

        if(numbers[index] == target){
            return 1 + countOccurrences(numbers, target, index + 1);
        }else{
            return countOccurrences(numbers, target, index + 1);
        }

    }

}
