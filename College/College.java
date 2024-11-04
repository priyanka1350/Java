 class College {
    String collegeName;
    Principal principal;
    HOD hod;
    Professors professors;
    Students students;

    public College(String collegeName, Principal principal, HOD hod, Professors professors, Students students) {
        this.collegeName = collegeName;
        this.principal = principal;
        this.hod = hod;
        this.professors = professors;
        this.students = students;
    }

    public void displayCollegeInfo() {
        System.out.println("College: " + collegeName);
        principal.PrincipalDetails();
        // for (HOD hod : hod) {
            hod.HodDetails();
        // }
        // for (Professor professor : professors) {
            professors.ProfessorDetails();
        // }
        // for (Student students : students) {
            students.StudentDetails();
        // }
    }
}
