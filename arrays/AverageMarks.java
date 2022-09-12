package arrays;

public class AverageMarks {
    public static void main(String[] args){
        int marks[] = {55,78,66,33,55};
        int sum=0;
        for(int i=0;i<marks.length;i++){
            // System.out.println(marks[i]);
            sum+=marks[i];
        }
        float avg=sum/marks.length;
        System.out.println(avg);
    }
}
