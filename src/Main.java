public class Main {
    // Задание 1
    public static void main(String[] args) {
        String firstName = "Артём ";
        String middleName = "Семёнович";
        String lastName = "Ёжиков ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();


        // Задание 2

        String fullNameUpper = fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpper);
        System.out.println();


        // Задание 3

        String fullNameI = "Ежиков Артем Семенович";
        fullNameI = fullNameI.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника -" + fullNameI);


    }
}