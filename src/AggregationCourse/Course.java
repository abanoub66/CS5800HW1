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

    public void print() {
        System.out.println(name + ", " +
                instructorsFirstAndLastNames() +  ", " +
                textbooksTitlesAndAuthors());
    }

    private String instructorsFirstAndLastNames() {
        StringBuilder firstAndLastNames = new StringBuilder();
        for (Instructor i : instructors) {
            firstAndLastNames.append(i.getFirstName()).append(" ").append(i.getLastName()).append(" ");
        }
        return firstAndLastNames.toString().stripTrailing();
    }

    private String textbooksTitlesAndAuthors() {
        StringBuilder titlesAndAuthors = new StringBuilder();
        for (Textbook i : textbooks) {
            titlesAndAuthors.append(i.getTitle()).append(" ").append(i.getAuthor()).append(" ");
        }
        return titlesAndAuthors.toString().stripTrailing();
    }
}
