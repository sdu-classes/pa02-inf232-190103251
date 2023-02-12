public class MainC{
    public static void main(String[] args) {
        Person person = new Person("Baltabay","Shamalgan");
        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.getAddress());

        Student student = new Student("Aryn", "Kaskelen","IT",2023,17.89);
        System.out.println(student);
        System.out.println(student.getProgram());
        System.out.println(student.getYear());
        System.out.println(student.getFee());

        Staff staff = new Staff("Satbek teacher", "Almaty","SDU",500000.0);
        System.out.println(staff);
        System.out.println(staff.getSchool());
        System.out.println(staff.getPay());
    }
}