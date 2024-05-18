package ObjectOrientedProgramming.Encapsulation;

class Account {

    // Private data members to hide the data.
    private long acc_no;
    private String name, email;
    private float amount;

    // Public getter and setter methods to manipulate data.
    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public float getAmount() {
        return amount;
    }
}

public class JavaEncapsulation {

    public static void main(String[] args) {

        Account acc = new Account();

        acc.setAcc_no(90482098491L);
        acc.setName("ABC");
        acc.setEmail("abc@gmail.com");
        acc.setAmount(100000f);

        System.out.println("Account No.: " + acc.getAcc_no() + "\nName: " + acc.getName() + "\nEmail: " + acc.getEmail()
                + "\nAmount: " + acc.getAmount());
    }
}
