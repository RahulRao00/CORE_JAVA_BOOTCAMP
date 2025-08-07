package src.WEEK_8_OOP_java.Inheritance;

class EducationalInstitute {

    void admitStudent() {
        System.out.println("Educational institute admit students ");
    }

    void conductExam() {
        System.out.println("Educational Institute Conduct Exams");
    }
}

class School extends EducationalInstitute {

    void conductExam() {
        System.out.println("School conduct unit test ");
    }

    void conductFieldTrip() {
        System.out.println("School's conduct field Trips");
    }
}

class College extends EducationalInstitute {

    void conductExam() {
        System.out.println("College's conduct Internal Assessments  ");
    }

    void conductInternship() {
        System.out.println("College's conduct Internship Programs ");
    }
}

class University extends EducationalInstitute {

    void conductExam() {
        System.out.println("University conduct Semester Exam ");
    }

    void conductResearch() {
        System.out.println("University conduct Research programs");
    }
}

public class L11_EducationalInstitute {

    public static void main(String[] args) {

        School s = new School();
        College c = new College();
        University u = new University();

        s.admitStudent();
        s.conductExam();
        s.conductFieldTrip();

        System.out.println();

        c.admitStudent();
        c.conductExam();
        c.conductInternship();

        System.out.println();

        u.admitStudent();
        u.conductExam();
        u.conductResearch();

    }
}
