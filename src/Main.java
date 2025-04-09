import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Bill",34 ,56 ,78 ,90));
        students.add(new Student("Gimbo",50 ,56,69 ,70));
        students.add(new Student("Bingooh",46 ,86 ,75 ,97));
        students.add(new Student("Davet",64 ,61 ,84 ,93));
        students.add(new Student("Elon",03 ,05 ,87 ,96));

        double total = 0;
        double highestAverage = 0;
        Student topStudent = null;

        for (Student student: students){
            double average = student.getAverage();
            total += average;

            if (average > highestAverage) {
                highestAverage = average;
                topStudent = student;
            }
        }

        double overallAverage = total / students.size();

        for (Student student: students) {
            String status = student.isPass() ? "Passed" : "Failed";
            System.out.printf("Name: %s | Average Score: %.2f | Status: %s\n", student.name, student.getAverage(), status);
        }

        System.out.println("\n🎉 Top Student:");
        System.out.printf("Name: %s | Average Score: %.2f | Status: %s\n",
                topStudent.name, highestAverage, topStudent.isPass() ? "Passed" : "Failed");

    }
}
