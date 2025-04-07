import java.util.Scanner;

public class StudentSort {

    static class Student{
    String name;
    double grade;

    Student(String name, double grade){
        this.name = name;
        this.grade = grade;
    }

    public String toString(){
        return name +" - "+grade;
    }
}

public static void insertionSort(Student[] arr){
    for(int i = 1; i < arr.length; i++){
        Student key = arr[i];
        int j = i - 1;

        while(j >= 0 && arr[j].grade > key.grade){
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students? ");
        int numberStudent = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[numberStudent];

        for(int i = 0; i < numberStudent; i++){
            System.out.println("Enter details of student #"+(i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Grade: ");
            double grade = sc.nextDouble();
            sc.nextLine();
            

            students[i] = new Student(name, grade);
        }

        insertionSort(students);

        System.out.println("Sorted Students by Grade (Ascending)");

        for(Student s : students){
            System.out.println(s);
        }
    

    }
}
