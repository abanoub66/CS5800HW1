package AggregationCourse;

public class CourseDriver {

    public static void main(String[] args) {
        testWithOneTextbookAndOneProfessor();
        testWithTwoTextbooksAndTwoProfessors();
    }

    private static void testWithOneTextbookAndOneProfessor() {
        Course cs5800 = new Course("Advanced Software Engineering",
                new Instructor("Nima", "Davarpanah", "3-2636"),
                new Textbook("Clean Code", "Robert Martin", "Pearson Education"));
        System.out.println(cs5800);
    }

    private static void testWithTwoTextbooksAndTwoProfessors() {
        Instructor[] instructors = twoInstructors();
        Textbook[] textbooks = twoTextbooks();
        Course cs5800 = new Course("Advanced Software Engineering", instructors, textbooks);
        System.out.println(cs5800);
    }

    private static Instructor[] twoInstructors() {
        Instructor nimaDavarpanah = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor johnKorah = new Instructor("John", "Korah", "8-15");
        return new Instructor[]{nimaDavarpanah, johnKorah};
    }

    private static Textbook[] twoTextbooks(){
        Textbook cleanCode = new Textbook("Clean Code", "Robert Martin", "Pearson Education");
        Textbook designPatterns = new Textbook("Design Patterns", "Erich Gamma", "Addison-Wesley");
        return new Textbook[]{cleanCode, designPatterns};
    }
}
