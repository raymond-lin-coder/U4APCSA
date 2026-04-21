import java.util.ArrayList;

public class SortStudent {
    public static void swap(int index1, int index2, ArrayList<Student> students) {
        Student temp = students.set(index1, students.get(index2));
        students.set(index2, temp);
    }
    public static ArrayList<Student> sortStudents(ArrayList<Student> studentsToSort) {
        for(int i = 0; i < studentsToSort.size(); i++) {
            for(int j = 0; j < studentsToSort.size(); j++) {
                for(int k = j + 1; k < studentsToSort.size(); k++) {
                    if (studentsToSort.get(j).getGpa() < studentsToSort.get(k).getGpa()) {
                        swap(j, k, studentsToSort);
                    }
                }
            }
        }
        for(int i = 0; i < studentsToSort.size(); i++) {
            for(int j = 0; j < studentsToSort.size(); j++) {
                for(int k = j + 1; k < studentsToSort.size(); k++) {
                    if (studentsToSort.get(j).getFirstName().compareTo(studentsToSort.get(k).getFirstName()) > 0) {
                        swap(j, k, studentsToSort);
                    }
                }
            }
        }
        for(int i = 0; i < studentsToSort.size(); i++) {
            for(int j = 0; j < studentsToSort.size(); j++) {
                for(int k = j + 1; k < studentsToSort.size(); k++) {
                    if (studentsToSort.get(j).getLastName().compareTo(studentsToSort.get(k).getLastName()) > 0) {
                        swap(j, k, studentsToSort);
                    }
                }
            }
        }
        return studentsToSort;
    }
}
