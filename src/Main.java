public class Main {
    public static void main(String[] args) {
        // case 1
        System.out.println("Case 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // case 2
        System.out.println("Case 2");
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperFullName);

        // case 3
        System.out.println("case 3");
        String fullName1 = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — "+ fullName1.replace('ё', 'е'));
    }
}