public class Lab {
    private String teacherName; // نام معلم
    private String dayOfWeek;    // روز هفته
    private Student[] students;   // آرایه‌ای از دانشجویان
    private int maxSize;         // حداکثر اندازه آرایه
    private int currentSize;     // اندازه فعلی آرایه
    private double avgGrade;     // میانگین نمرات

    // سازنده
    public Lab(String teacherName, String dayOfWeek, int maxSize) {
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
        this.students = new Student[maxSize]; // با سایز Maxsize ایجاد آرایه
        this.currentSize = 0; // اندازه فعلی را صفر تنظیم می‌کنیم
    }

    public double calAvg() {
        double sum = 0;
        for (Student student : students) {
            if (student != null) {
                sum += student.getGrade();
            }
        }
        return sum / currentSize;
    }

    // متد برای اضافه کردن دانشجو
    public void enrollStudent(Student student) {
        if (currentSize < maxSize) {
            students[currentSize++] = student;
            avgGrade = calAvg();
        } else {
            System.out.println("ظرفیت کارگاه پر است.");
        }
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int tgetMaxSize() {
        return maxSize;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    // متد برای چاپ اطلاعات کارگاه و دانشجویان
    public void printLabInfo() {
        System.out.println(" " + teacherName + " " + dayOfWeek);
        System.out.println(" " + avgGrade);
        
        for (int i = 0; i < currentSize; i++) {
            students[i].printStudentInfo(); // چاپ اطلاعات هر دانشجو
        }
    }
}