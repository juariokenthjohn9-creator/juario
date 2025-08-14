package Banking;

public class bankingClass {
    private int accountNo;
    private int pin;

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public boolean verifyAccount(int inputAccountNo, int inputPin) {
        return this.accountNo == inputAccountNo && this.pin == inputPin;
    }
}