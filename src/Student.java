import java.awt.*;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String studentName;
    String studentNumber;
    String classes;
    double avarage;
    boolean isPass;

    Student(String studentName,String studentNumber,String classes,Course c1,Course c2,Course c3){
        this.studentName=studentName;
        this.studentNumber=studentNumber;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }
    void addBulkExamNote(int firstCourse, int verbalGradeForFirst,int secondCourse,int verbalGradeForSecond,
                         int thirdCourse,int verbalGraderForThird){
        if ((firstCourse>=0 && firstCourse<=100)&&(verbalGradeForFirst>=0 && verbalGradeForFirst<=100))
        {
            this.c1.noteOfCourse=firstCourse;
            this.c1.verbalGrade=verbalGradeForFirst;
        }
        else{
            System.out.println("1.Dersin Sınav Notunu veya Sözlü Notunu Belirlenen Aralıkta Giriniz.\n");
        }
        if ((secondCourse>=0 && secondCourse<=100)&&(verbalGradeForSecond>=0 && verbalGradeForSecond<=100)){
            this.c2.noteOfCourse=secondCourse;
            this.c2.verbalGrade=verbalGradeForSecond;
        }
        else{
            System.out.println("2. Dersin Sınav Notunu veya Sözlü Notunu Belirlenen Aralıkta Giriniz.\n");
        }
        if ((thirdCourse>=0 && thirdCourse<=100)&&(verbalGraderForThird>=0 && verbalGraderForThird<=100)){
            this.c3.noteOfCourse=thirdCourse;
            this.c3.verbalGrade=verbalGraderForThird;
        }
        else {
            System.out.println("3.Dersin Sınav Notunu veya Sözlü Notunu Belirlenen Aralıkta Giriniz.\n");
        }
    }

    void isPass(){
        this.avarage=(avarageC1()+avarageC2()+avarageC3())/3.0;
        printNote();
        if (this.avarage>55){
            System.out.println("Sınıfı Başarılı bir şekilde geçtiniz.\n");
            this.isPass=true;
        }
        else{
            System.out.println("Sınıfı Geçemediniz.\n");
            this.isPass=false;
        }
    }
    void printNote(){
        System.out.println(c1.nameOfCourse+" dersinin sınav notu: "+ avarageC1());
        System.out.println(c2.nameOfCourse+" dersinin sınav notu: "+avarageC2());
        System.out.println(c3.nameOfCourse+" dersinin sınav notu: "+avarageC3());
        System.out.println();
        System.out.println("Ortalamanız: "+this.avarage);
    }
      double avarageC1(){
        double total=(this.c1.noteOfCourse*0.8)+(this.c1.verbalGrade*0.2);
        return  total;
    }
    double avarageC2(){
        double total=(this.c2.noteOfCourse*0.7)+(this.c2.verbalGrade*0.3);
        return  total;
    }
    double avarageC3(){
        double total=(this.c3.noteOfCourse*0.75)+(this.c3.verbalGrade*0.25);
        return  total;
    }

}
