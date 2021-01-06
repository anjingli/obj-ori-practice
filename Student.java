public class Student {
    
    private String name;
    private double finalMark;
    private final int STUDENT_ID;
    private static int nextID = 1;   
    public static final double STARTING_MARK = 50.0;
    
    public Student(String name) {
        this(name, STARTING_MARK);
    }
    
    public Student(String name, double startingMark) {
        this.name = name;
        STUDENT_ID = getNextID();
        finalMark = startingMark;
    }
    
    public String getName() { 
        return name; 
    }
    
    public int getStudentID() { 
        return STUDENT_ID; 
    }
    
    public double getFinalMark() { 
        return finalMark; 
    }
    
    public void setName(String newName) { 
        name = newName; 
    }
    
    public void setFinalMark(double newMark) { 
        finalMark = newMark; 
    }
    
    private static int getNextID() {
        int id = nextID;
        nextID++;
        return id;
    }
}