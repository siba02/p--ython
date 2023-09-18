import java.util.*;

class Demo {
    Scanner sc;
    int roll;
    float age;
    char gender;

    void read() {
        sc = new Scanner(System.in);
        System.out.println("enter roll no");
        roll = sc.nextInt();
        System.out.println("enter age");
        age = sc.nextFloat();
        System.out.println("enter gender");
        gender = sc.next().charAt(0);
    }

    void display() {
        System.out.println("Rollno= " + roll + "Age= " + age + "Gender= " + gender);
    }

    public static void main(String a[]) {
        Demo ob = new Demo();
        ob.read();
        ob.display();
    }
}