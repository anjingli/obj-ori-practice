class StudentMain {
  public static void main(String[] args) {
    Student s1 = new Student("Artemis");
    
    System.out.println("The student's name is " + s1.getName() + ".");
    System.out.println("Their ID is " + s1.getStudentID() + "."); 
    System.out.println("Their mark stays the same.");
    s1.setFinalMark(100);
    System.out.println("Their mark is now: " + s1.getFinalMark() + ".");
    
    Student s2 = new Student("Ann", 100);
    
    // Uses setName() to set to full name
    s2.setName("Annabeth");

    System.out.println("\nThe student's name is " + s2.getName() + ".");
    System.out.println("Their ID is " + s2.getStudentID() + "."); 
    System.out.println("Their mark drops by 1%.");
    s2.setFinalMark(99);
    System.out.println("Their mark is now: " + s2.getFinalMark() + ".");
  }
}