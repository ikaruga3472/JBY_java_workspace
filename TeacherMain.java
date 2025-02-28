public class TeacherMain {
    public static void main(String[] args) {
        Teacher tea = new Teacher();
        tea.name = "tea01";
        tea.height = 180.01;
        tea.age = 99;
        tea.bloodType = "AB";
        tea.ismarriage = false;
        
        tea.foo();
        System.out.println(tea.bar("bar"));
    }
}
