public class StudentManagementApplication {
    public static void main(String[] args) {
        System.out.println("This will cause a test failure");
        throw new RuntimeException("Test failure");
    }
}