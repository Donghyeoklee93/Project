/*
 * CaFirstLast.java
 * @author Donghyeok.Lee
 * 27/11/2022
 */
public class CaFirstLast {
    // data members
    private String arrName[] = new String[100];
    private String arrLocation[] = new String[100];
    private String arrDay[] = new String[100];
    private String answer;

    // constructor
    public CaFirstLast() {
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
    public void First() {
        if (arrDay[0] != null) {
            answer = "The project name : " + arrName[0]
                    + "\nProject location : " + arrLocation[0]
                    + "\nExecution Time(Day) of the project : " + arrDay[0];
        } else {
            answer = "No item has been entered/provided.";
        }
    }

    public void Last() {
        for (int j = 1; j < arrName.length + 1; j++) {
            if (arrDay[arrName.length - j] != null) {
                answer = "The project name : " + arrName[arrName.length - j]
                        + "\nProject location : " + arrLocation[arrLocation.length - j]
                        + "\nExecution Time(Day) of the project : " + arrDay[arrDay.length - j];
                break;

            } else if (arrDay[0] == null) {
                answer = "No item has been entered/provided.";
            }
        }
    }

    // get methods - one for every output
    public String getAnswer() {
        return answer;
    }
}
