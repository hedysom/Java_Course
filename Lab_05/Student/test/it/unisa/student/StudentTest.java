package it.unisa.student;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class StudentTest {
    @Test
    public void newStudentTest() {
        Student student = new Student("Dario", "Di Nucci");
        Assert.assertEquals("Dario", student.getFirstName());
        Assert.assertEquals("Di Nucci", student.getLastName());
        Assert.assertTrue(student.getExams().isEmpty());
    }

    @Test
    public void oneExamTest() {
        Student student = new Student("Dario", "Di Nucci");

        Exam exam = new Exam("Object Oriented Programming", new GregorianCalendar(2023, Calendar.JANUARY, 10), 30);
        student.registerExam(exam);

        Assert.assertEquals(1, student.getExams().size(), 0);
        Assert.assertEquals(30, student.computeAverageGrade(), 0);
    }

    @Test
    public void twoExamTest() {
        Student student = new Student("Dario", "Di Nucci");

        Exam exam1 = new Exam("Object Oriented Programming", new GregorianCalendar(2023, Calendar.JANUARY, 10), 30);
        student.registerExam(exam1);

        Exam exam2 = new Exam("Software Engineering", new GregorianCalendar(2024, Calendar.JANUARY, 20), 28);
        student.registerExam(exam2);

        Assert.assertEquals(2, student.getExams().size(), 0);
        Assert.assertEquals(29, student.computeAverageGrade(), 0);
    }

    @Test
    public void studentsOrderTest() {
        Student student1 = new Student("Alessandro", "De Maio");
        Student student = new Student("Antonio", "D'Urso");
        Student student2 = new Student("Dario", "Di Nucci");
        Student student3 = new Student("Eugenio", "Greco");
        Student student4 = new Student("Ivan", "Chiello");
        List<Student> lista = new ArrayList<Student>();
        lista.add(student);
        lista.add(student1);
        lista.add(student2);
        lista.add(student3);
        lista.add(student4);
        Collections.sort(lista);
        Assert.assertEquals("Chiello", lista.get(0).getLastName());
        Assert.assertEquals("Greco", lista.get(4).getLastName());
    }
}