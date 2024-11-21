public class Student {
    private String id; // شماره دانشجویی (باید شامل 7 رقم باشد)
    private String name;       // نام دانشجو
    private double grade;      // نمره دانشجو (با مقدار پیش‌فرض 0.0)

    // سازنده
    public Student(String id, String name) {
        if (id.length() != 7) {
            throw new IllegalArgumentException("شماره دانشجویی باید شامل 7 رقم باشد.");
        }
        this.id = id;
        this.name = name;
        this.grade = 0.0; // مقدار پیش‌فرض
    }

    // سازنده با نمره
    public Student(String id, String name, double grade) {
        this(id, name);
        this.setGrade(grade);
    }

    // متدهای دسترسی (گترها)
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    // متد ستتر برای نمره
    public void setGrade(double grade) {
        if (grade < 0 || grade > 20) {
            throw new IllegalArgumentException("نمره باید بین 0 تا 20 باشد.");
        }
        this.grade = grade;
    }

    // متد برای چاپ اطلاعات دانشجو
    public void printStudentInfo() {
        System.out.println(" " + name + "\nID " + id + " \nGRADE" + grade);
    }
}
