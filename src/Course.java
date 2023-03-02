public class Course {
    Teacher teacherOfCourse;
    String nameOfCourse;
    String codeOfCourse;
    String prefixOfCourse;
    int noteOfCourse;
    int verbalGrade;



    Course(String nameOfCourse,String codeOfCourse,String prefixOfCourse){
        this.nameOfCourse=nameOfCourse;
        this.codeOfCourse=codeOfCourse;
        this.prefixOfCourse=prefixOfCourse;
        this.noteOfCourse=0;
    }

    void addTeacher(Teacher teacherOfCourse){
        if (teacherOfCourse.branch.equals(this.prefixOfCourse)){
            this.teacherOfCourse=teacherOfCourse;
        }
        else{
            System.out.println("Öğretmen ve Ders Bölümleri uyuşmuyor.");
        }
    }
    void printTeacherInfo(){
        this.teacherOfCourse.printOfTheTeacherInfo();
    }


}
