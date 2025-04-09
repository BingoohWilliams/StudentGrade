public class Student {
    String name;
    private double score1, score2, score3, score4;

    public Student(String name, double score1, double score2, double score3, double score4){
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
    }

    public double getAverage(){
        return (score1 + score2 + score3 + score4) / 4;
    }

    public Boolean isPass(){
        if (getAverage() >= 50){
            return true;
        }
        else{
            return false;
        }
    }
}
