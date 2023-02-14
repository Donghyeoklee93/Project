/*
 * CaAverHigh.java
 * @author Donghyeok.Lee
 * 27/11/2022
 */
public class CaAverHigh {
    // data members
    private String arrName[] = new String[100];
    private String arrLocation[] = new String[100];
    private String arrDay[] = new String[100];
    private String answer;

    // constructor
    public CaAverHigh() {
    }

    // set methods - one for every input
    public void setName(String arrName[]) {
        this.arrName = arrName;
    }

    public void setLocation(String arrLocation[]) {
        this.arrLocation = arrLocation;
    }

    public void setDay(String arrDay[]) {
        this.arrDay = arrDay;
    }

    // compute - process
    public void Aver() {
        if (arrDay[0] == null) {
            answer = "No item has been entered/provided.";
        } else {
            double sum = 0;
            int indexNumber = 0;
            double average;

            for (int k = 0; k < arrDay.length; k++) {
                if (arrDay[k] != null) {
                    sum = sum + Integer.parseInt(arrDay[k]);
                    indexNumber = indexNumber + 1;
                }
            }
            average = sum / indexNumber;
            answer = "The assigned item type is Landscape Project."
                    + "\nThe average execution Time(Day) of all the Landscape Project entered until that point : "
                    + average;
        }
    }

    public void High() {
        if (arrDay[0] == null) {
            answer = "No item has been entered/provided.";
        } else {
            int maxValue = Integer.parseInt(arrDay[0]);
            int order = 0;

            for (int m = 1; m < arrDay.length; m++) {
                if ((arrDay[m] != null) && (Integer.parseInt(arrDay[m]) > maxValue)) {
                    maxValue = Integer.parseInt(arrDay[m]);
                    order = order + 1;
                }
            }
            answer = "The item with the highest mandatory state : " + arrName[order]
                    + "\nProject location : " + arrLocation[order]
                    + "\nThe highest mandatory state : " + maxValue;
        }
    }

    // get methods - one for every output
    public String getAnswer() {
        return answer;
    }
}
