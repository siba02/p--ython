import java.util.*;

class First {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int roll;
        float age;
        char gender;
        System.out.println("enter the roll value");
        roll = sc.nextInt();
        System.out.println("enter age");
        age = sc.nextFloat();
        System.out.println("enter gender");
        gender = sc.next().charAt(0);
        System.out.println("Rollno= " + roll + "Age= " + age + "Gender= " + gender);
    }
}