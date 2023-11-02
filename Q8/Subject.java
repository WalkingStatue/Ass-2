package MCA;

public class Subject extends Student {
    private int subject_id;
    private String subject_name;
    private boolean elective;

    public Subject(int student_id, String student_name, String address, int[] marks, int subject_id, String subject_name, boolean elective) {
        super(student_id, student_name, address, marks);
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.elective = elective;
    }

    public void setSubjectId(int subject_id) {
        this.subject_id = subject_id;
    }

    public int getSubjectId() {
        return subject_id;
    }

    public void setSubjectName(String subject_name) {
        this.subject_name = subject_name;
    }

    public String getSubjectName() {
        return subject_name;
    }

    public void setElective(boolean elective) {
        this.elective = elective;
    }

    public boolean isElective() {
        return elective;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSubject ID: " + subject_id + "\nSubject Name: " + subject_name + "\nElective: " + elective;
    }
}
