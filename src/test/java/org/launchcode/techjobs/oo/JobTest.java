package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.testng.Assert.*;

public class JobTest {
    String name = "Product tester";
    Employer employer = new Employer("ACME");
    Location location = new Location("Desert");

    Job myJob = new Job();
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(job1, job2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job aJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newLine = System.lineSeparator();
        String start = String.valueOf(aJob.toString().charAt(0));
        String end = String.valueOf(aJob.toString().charAt(aJob.toString().length() - 1));
        assertEquals(newLine, start);
        assertEquals(newLine, end);
    }

    @Test
   public void testToStringContainsCorrectLabelsAndData() {
        String newLine = System.lineSeparator();
        Job aJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String actual = aJob.toString();
        String expected = newLine +
                "ID: " + aJob.getId() + newLine +
                "Name: " + aJob.getName() + newLine +
                "Employer: " + aJob.getEmployer() + newLine +
                "Location: " + aJob.getLocation() + newLine +
                "Position Type: " + aJob.getPositionType() + newLine +
                "Core Competency: " + aJob.getCoreCompetency() + newLine;

        assertEquals(actual, expected);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        String newLine = System.lineSeparator();
        Job emptyJob = new Job();
        Job emptyJobFields = new Job("", null, null, null, null);

        String actual = emptyJob.toString();
        String expected = newLine +
                "ID: " + emptyJobFields.getId() + newLine +
                "Name: " + "Data not available" + newLine +
                "Employer: " + "Data not available" + newLine +
                "Location: " + "Data not available" + newLine +
                "Position Type: " + "Data not available" + newLine +
                "Core Competency: " + "Data not available" + newLine;

        assertEquals(actual, "OOPS! This job does not seem to exist.");
        assertEquals(emptyJobFields, expected);
    }
}

