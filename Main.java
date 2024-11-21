 /*
  * @ Autho Noria 
   about lab  and student of lab who are learn smth
   we know this lab is sbout AP lab we lrean java lang
   and ones of project of java is it.

  */

public class Main {
    public static void main(String[] args) {
        // ایجاد دو دانشجو
        Student student1 = new Student("0987654", "James Gosling", 18);
        Student student2 = new Student("1234567", "Dennis Ritchie", 17.5);

        // چاپ اطلاعات دانشجویان
        student1.printStudentInfo();
        student2.printStudentInfo();

        // ایجاد شئ از کلاس Lab
        Lab lab = new Lab("Mr.Smith", "Monday", 30);

        // اضافه کردن دانشجویان به کارگاه
        lab.enrollStudent(student1);
        lab.enrollStudent(student2);
        lab.setAvgGrade(85.5);

        // چاپ اطلاعات کارگاه
        lab.printLabInfo();
    }
}