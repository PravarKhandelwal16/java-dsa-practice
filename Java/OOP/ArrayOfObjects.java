class Student{
    String name;
    int rollNo;
    int age;
}

public class ArrayOfObjects {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.rollNo = 001;
        s1.name = "Pravar";
        s1.age = 19;

        Student s2 = new Student();
        s2.rollNo = 002;
        s2.name = "Ishan";
        s2.age = 18;

        Student s3 = new Student();
        s3.rollNo = 003;
        s3.name = "Attharv";
        s3.age = 20;

        Student std[] = new Student[3];
        std[0] = s1;
        std[1] = s2;
        std[2] = s3;

        // for(int i = 0;i< std.length;i++){
        //     System.out.println(std[i].name + ":" + std[i].age);
        // }

        for(Student student : std){
            System.out.println(student.name + ":" + student.age);
        }
    }
}

// Implementation of Array of Objects using Enhanced For Loop
