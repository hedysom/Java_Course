import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudentTest {
    @Test
    public void testStudent(){
        Student marioRossi = new Student("Mario", "Rossi");
        Assert.assertEquals("Mario", marioRossi.getFirstName());
        Assert.assertEquals("Rossi", marioRossi.getLastName());
        Assert.assertEquals(0,marioRossi.computeAverageGrade(),0);
    }
    @Test
    public void testExams(){
        Student marioRossi = new Student("Mario", "Rossi");
        Exam p1= new Exam("Programmazione 1", new GregorianCalendar(2023, 01,12), 29);
        marioRossi.registerExam(p1);
        Assert.assertEquals(29,marioRossi.computeAverageGrade(),0);
        Exam md= new Exam("Matematica Discreta", new GregorianCalendar(2023,02,13), 18);
        marioRossi.registerExam(md);
        Assert.assertEquals(23.5, marioRossi.computeAverageGrade(),0);
    }
}
