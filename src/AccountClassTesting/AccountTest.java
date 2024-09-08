package AccountClassTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AccountTest {

    @Test
    void testGetBalance() {
        Account account = new Account();
        assertEquals(0.0, account.getBalance());
    }

    @Test
    void testDeposit() {
        Account account = new Account();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void testWithdraw() {
        Account account = new Account();
        account.deposit(100.0);
        assertEquals(50.0, account.withdraw(50.0));
        assertEquals(50.0, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Account account = new Account();
        account.deposit(100.0);
        assertEquals(0.0, account.withdraw(200.0));
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void testWithdrawAllFunds() {
        Account account = new Account();
        account.deposit(100.0);
        assertEquals(100.0, account.withdraw(100.0));
        assertEquals(0.0, account.getBalance());
    }

  
}