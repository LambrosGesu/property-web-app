package gr.codehub.team7.propertywebapp.forms;

public class RepairSearchForm {
    String repairDate;
    String BetweenDate1;
    String BetweenDate2;
    String SSN;


    public String getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(String repairDate) {
        this.repairDate = repairDate;
    }

    public String getBetweenDate1() {
        return BetweenDate1;
    }

    public void setBetweenDate1(String betweenDate1) {
        BetweenDate1 = betweenDate1;
    }

    public String getBetweenDate2() {
        return BetweenDate2;
    }

    public void setBetweenDate2(String betweenDate2) {
        BetweenDate2 = betweenDate2;
    }

    public String getSSN() { return SSN; }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

}
