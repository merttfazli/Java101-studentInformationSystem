public class studentInformationSystem {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoca","555","TRH");
        Teacher t2 = new Teacher("Graham Bell","0000","FZK");
        Teacher t3 = new Teacher("Kül Yutmaz","1111","BIO");


        Course tarih=new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik=new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyoloji=new Course("Biyoloji","103","BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","123","4",tarih,fizik,biyoloji);
        System.out.println(s1.studentName+" isimli öğrencinin Sınav Notları.\n");
        s1.addBulkExamNote(100,65,50,70,60,80);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi","444","4",tarih,fizik,biyoloji);
        System.out.println(s2.studentName+" isimli öğrencinin sınav notları\n");
        s2.addBulkExamNote(50,30,70,90,95,38);
        s2.isPass();

    }
}
