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
}
