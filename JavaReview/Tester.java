public class Tester {
    public static void main(String[] args) {
        FulltimeEmployee ft = new FulltimeEmployee("a", "b", "Engineering", 10400.00);
        System.out.println(ft);
        ft.printTotalWages();
    }
}
