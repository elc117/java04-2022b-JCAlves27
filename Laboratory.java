import java.util.ArrayList;

public class Laboratory {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;

    public Laboratory() {
    }

    public Laboratory(String name) {
        this.name = name;
        this.students = new ArrayList<Student>();
        this.professors = new ArrayList<Professor>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMember(Student s) {
        this.students.add(s);
    }

    public void addMember(Professor p) {
        this.professors.add(p);
    }

    public ArrayList<String> getContactInfos() {

        ArrayList<String> contact = new ArrayList<String>();

        for (Professor p : professors) {
            contact.add(p.getContactInfo());
        }

        for (Student s : students) {
            contact.add(s.getContactInfo());
        }
        return contact;
    }

    public boolean userExists(String userId) {

        boolean Status = false;

        for (Student s : students) {
            Status = s.getuserId();
        }
        // COMPLETE-ME
        // Verifique se existe o userId na lista de estudantes ou de professores

    }

    public int countMembers() {
        // COMPLETE-ME
        // Retorne o total de membros do laboratório (estudantes e professores)

    }