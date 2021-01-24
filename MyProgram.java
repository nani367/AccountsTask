import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyProgram {

    public static void main(String[] args) {
        // Accounts retrieved from Database using SQL
        Account account1 = new Account("First Account", 29);
        Account account2 = new Account("Second Account", 20);
        Account account3 = new Account("Third Account", 35);
       

        // 1. Query all Account objects and put them in a List
        List<Account> accounts = new ArrayList<>(Arrays.asList(account1, account2, account3));

        // 2. Use the List size function to get how many account we have
        int howManyAccounts = accounts.size();

        // 3. Loop the Accounts List to find the sum of all Age fields
        int sumOfAllAge = 0;
        for(Account account : accounts){
            sumOfAllAge += account.getAge();
        }

        // 4. Calculate the average Age
        double averageAge = sumOfAllAge/(1.0*howManyAccounts);

        // 5. Loop the Accounts List and fill the Average_Age__c field
        for(Account account : accounts){
            account.setAverage_Age__c(averageAge);
        }
    }
}
