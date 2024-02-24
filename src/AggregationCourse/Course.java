package AggregationCourse;

public class Course {

    private final String name;
    private final Instructor[] instructors;
    private final Textbook[] textbooks;

    public Course(String name, Instructor[] instructors, Textbook[] textbooks) {
        this.name = name;
        this.instructors = instructors;
        this.textbooks = textbooks;
    }

    public Course(String name, Instructor instructor, Textbook textbook) {
        this(name, new Instructor[]{instructor}, new Textbook[]{textbook});
    }

    public Course(String name, Instructor[] instructors, Textbook textbook) {
        this(name, instructors, new Textbook[]{textbook});
    }

    public Course(String name, Instructor instructor, Textbook[] textbooks) {
        this(name, new Instructor[]{instructor}, textbooks);
    }

    @Override
    public String toString() {
        return name + ", " +
                arrayToString(instructors) +  ", " +
                arrayToString(textbooks);
    }

    private String arrayToString(Object[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object o : array) {
            stringBuilder.append(o.toString()).append(" ");
        }
        return stringBuilder.toString().stripTrailing();
    }
}
