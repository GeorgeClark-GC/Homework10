public class Main {
    public static void main(String[] args) {
        System.out.println("Example1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);
        System.out.println("Example2");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчёта — " + fullName.toUpperCase());
        System.out.println("Example1");
        String firstNameNew = "Семён";
        String middleNameNew = "Семёнович";
        String lastNameNew = "Иванов";
        String fullNameNew = lastNameNew + " " + firstNameNew + " " + middleNameNew;
        String correctFullName = fullNameNew.replace("ё", "е");
        System.out.println("Ф.И.О. сотрудника — " + correctFullName);
    }
}