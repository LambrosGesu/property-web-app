package gr.codehub.team7.propertywebapp.forms;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class RepairSearchForm {
    private static final int SSN_MIN_SIZE = 9;
    private static final int SSN_MAX_SIZE = 9;
    private static final String SSN_PATTERN = "^[0-9]*$";
    private static final String DATE_PATTERN = "[0-9]+-[0-9]+-[0-9]$";

    @Pattern(regexp = DATE_PATTERN, message = "{register.date.pattern.invalid}")
    private String repairDate;
    @Pattern(regexp = DATE_PATTERN, message = "{register.date.pattern.invalid}")
    private String BetweenDate1;
    @Pattern(regexp = DATE_PATTERN, message = "{register.date.pattern.invalid}")
    private String BetweenDate2;
    @Pattern(regexp = SSN_PATTERN, message = "{register.ssn.pattern.invalid}")
    @Size(min = SSN_MIN_SIZE, max = SSN_MAX_SIZE, message = "{register.ssn.size.invalid}")
    private String SSN;


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
