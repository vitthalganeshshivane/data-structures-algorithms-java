public class AccessModifiers {
    public static void main(String args[]) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Vitthal Shivane";
        myAcc.setPassword("Pankaj");
    }

    static class BankAccount {
        public String username;
        private String password;

        public void setPassword(String pwd) {
            password = pwd;
        }
    }
}
