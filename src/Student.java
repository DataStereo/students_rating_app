public class Student {
    private int rating;
    private String name;
    public static  double totalRating;
    public static int studentCount;

    public Student (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    // Set students rating, increase total rating, increase number of students
    public void setRating(int rating) {
        totalRating = totalRating + rating;
        this.rating = rating;
        studentCount ++;
    }

    public static double getAvgRating(){
        if (studentCount == 0){
            return 0;
        } return totalRating/studentCount;
    }

    // Compare rating of the current student (this) with the of another student (student)
    public boolean betterStudent(Student student){
        return this.rating > student.getRating();
    }

    public void changeRating(int rating){
        totalRating = totalRating - this.rating + rating;
        this.rating = rating;
    }

    public static void removeStudent(Student student){
        totalRating -= student.rating;
        studentCount --;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Rating: " + rating;
    }
}
