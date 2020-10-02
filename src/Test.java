public class Test {
    public static void main(String[] args) {
        String a = "its my String";
        char c = ' ';
        long l = a.chars().filter(ch -> ch== c).count();
        System.out.println(l);
    }
}
