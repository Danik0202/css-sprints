import java.util.*;

public class StudentAwards {
    Student theMostGPA(ArrayList<Student> students) {
        BestStudent bestStudent = (list) -> {
            Double maxGpa = Double.MIN_VALUE;
            int index = 0;
            for (int i = 0; i < list.size(); i++) {
                if (maxGpa < list.get(i).getGpa()) {
                    maxGpa = list.get(i).getGpa();
                    index = i;
                }
            }
            return list.get(index);
        };
        return bestStudent.theBest(students);
    }


    Student theMostAge(ArrayList<Student> students){
        BestStudent bestStudent = (list) -> {
            Integer maxGpa = Integer.MIN_VALUE;
            int index = 0;
            for (int i = 0; i < list.size(); i++) {
                if (maxGpa < list.get(i).getAge()) {
                    maxGpa = list.get(i).getAge();
                    index = i;
                }
            }
            return list.get(index);
        };
        return bestStudent.theBest(students);
    }

    Student theHighest(ArrayList<Student> students){
        BestStudent bestStudent = (list) -> {
            Integer maxGpa = Integer.MIN_VALUE;
            int index = 0;
            for (int i = 0; i < list.size(); i++) {
                if (maxGpa < list.get(i).getHeight()) {
                    maxGpa = list.get(i).getHeight();
                    index = i;
                }
            }
            return list.get(index);
        };
        return bestStudent.theBest(students);
    }


}
