package designPattren.prototypeDP;

public class client {
    public static void main(String[] args) {
        Student student=new Student(1,"praveen");
        InteligentStudent is=new InteligentStudent(2,"vana",50);

        Student student2=student.copy();
        InteligentStudent is2=is.copy();
        System.out.println(student);
        System.out.println(student2);
        System.out.println(is);
        System.out.println(is2);
        System.out.println(student==student2);

        StudentColnable studentColnable=new StudentColnable(3,"Srinivas");
        StudentColnable studentColnable1=studentColnable.clone();
        System.out.println(studentColnable);
        System.out.println(studentColnable1);
        System.out.println(studentColnable==studentColnable);


    }
}
