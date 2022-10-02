package  com.demo.maps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Trainee {
    private Integer traineeId;
    private String name;

    public Trainee(Integer traineeId, String name) {
        super();
        this.traineeId = traineeId;
        this.name = name;
    }

    // Computed based on trainee id
    // Will return same value for same trainee ids
    @Override
    public int hashCode() {
        final int primeNumber = 17;
        int value = primeNumber * this.traineeId;
        return value;
    }

    // to check equality based on trainee Ids
    @Override
    public boolean equals(Object object) {
        boolean flag = false;
        Trainee secondObj = null;
        if (object != null)
            flag = true;
        // checking if passed object belongs to current class
        // if true then comparing trainee ids
        if (this.getClass() != object.getClass()) {
            secondObj = (Trainee) object;
            if (this.traineeId == secondObj.traineeId) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public Integer getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(Integer traineeId) {
        this.traineeId = traineeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // overriding toString to print object references
    @Override
    public String toString() {
        return this.traineeId + " " + this.name;
    }

}

class KeyClassDemo {
    public static void main(String[] args) {
        Trainee t1 = new Trainee(101, "Jack");
        Trainee t2 = new Trainee(102, "Mary");
        Trainee t3 = new Trainee(103, "Jane");

        // Creating a map with trainee object as keys
        //and corresponding batch name as values
        HashMap<Trainee, String> traineeMap = new HashMap<>();
        traineeMap.put(t1, "Dec-LC1");
        traineeMap.put(t2, "Jan-LC2");
        traineeMap.put(t3, "Feb-LC3");
        System.out.println(traineeMap);

        // let us find batch name of trainee t2
        System.out.println(traineeMap.get(t2));

        // updating trainee id of existing trainee object
        // gets updated in map as well
        t2.setTraineeId(108);
        System.out.println(traineeMap);

        // let us try adding another object but with same attribute values
        Trainee t4 = new Trainee(101, "Jack");
        traineeMap.put(t4, "Mar-LC1");
        System.out.println(traineeMap); //map updates value of t1 object
        //hence t1 and t4 are considered to be same

        Trainee t5 = new Trainee(101, "Jignesh");
        traineeMap.put(t4, "sep-LC1");
        System.out.println(traineeMap);

        String traineeDetails = "105,Lily:Jan20-Lc2+106,Peter:Feb-Lc2+107,Jerry:Mar-LC1";
        String[] plusSplitted = traineeDetails.replaceAll(",", " ").split("\\+");

        System.out.println(Arrays.toString(plusSplitted));

        for(String val : plusSplitted){
            String[] valSplitted = val.split(":");
            String[] eleSplitted;
            Trainee newTrainee = null;
            for(String ele : valSplitted){
                if(valSplitted[0].equals(ele)){
                    eleSplitted = ele.split(" ");
                    newTrainee = new Trainee( Integer.parseInt(eleSplitted[0]), eleSplitted[1]);
                }

            }
            traineeMap.put(newTrainee, valSplitted[1]);
        }
        System.out.println(traineeMap);
    }
}