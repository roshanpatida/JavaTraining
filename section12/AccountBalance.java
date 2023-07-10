
package section12;

class Account
{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;
    
    public Account(String acc,String n,String add,String phno,String dob)
    {
        accNo=acc;
        name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    }
    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;};
    public String getPhno(){return phno;}
    public String getDOB(){return dob;}
    public long getBalance(){return balance;}
    
    public void setAddress(String add)
    {
        address=add;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
            
}

class LoanAccount extends Account
{

    public LoanAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }
    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}

class SavingsAccount extends LoanAccount
{

    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }
    public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}



public class AccountBalance{ 

    public static void main(String[] args) 
    {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("S0001", "John Doe", "123 Main St", "1234567890", "01-01-1990");

        // Deposit some amount into the savings account
        savingsAccount.deposit(5000);
        
        System.err.println("deposit = "+savingsAccount.balance);
        // Withdraw some amount from the savings account
        savingsAccount.withdraw(2000);
        
        System.err.println(" after withdraw = "+savingsAccount.balance);

        // Display the account details and balance
        System.out.println("Account Number: " + savingsAccount.getAccNo());
        System.out.println("Account Holder Name: " + savingsAccount.getName());
        System.out.println("Address: " + savingsAccount.getAddress());
        System.out.println("Phone Number: " + savingsAccount.getPhno());
        System.out.println("Date of Birth: " + savingsAccount.getDOB());
        System.out.println("Current Balance: $" + savingsAccount.getBalance());
        
        savingsAccount.payEMI(500);
        System.err.println("after emi = "+savingsAccount.balance);
        
    }
 }   