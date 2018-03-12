
package BCIT.comp1451.A00972783.Lab4b;

import static org.junit.Assert.*;

import org.junit.Test;
 
@SuppressWarnings("unused")
public class BankAccountsTest {

	private BankAccount bank;
	
	public BankAccountTest()
	{
		bank = new BankAcount();
	}
	
	
	public void testGetFirstName()
	{
		bank.setFirstName("Jerry");
		assertsEquals("Jerry", bank.GetFirstName());
	}
	
	
	@Test
	public void testGetLastName() {
		bank.setLastName("Garcia");
		assertsEquals("Garcia", bank.GetLastName());
	}
	
	
	@Test
	public void testGetFullName() {
		bank.setFirstName("Jerry");
		bank.setLastName("Garcia");
		assertEquals("Jerry Garcia", bank.GetFullName());
	}
	
	@Test
	public void testGetEmail() {
		bank.setEmail("example@gmail.com");
		assertEquals("example@gmail.com", bank.getEmail());
	}

	
	@Test
	public void testSetGetTransID() {
		bank.setTransID("A001");
		assertEquals("A001", bank.getTransID());
		
				}
	
	
	@Test
	public void testSetGetPhoneNumber() {
		bank.setPhoneNumber("778-888-8888");
		assertEquals("778-888-8888", bank.getPhoneNumber());
	}

	
	@Test
	public void testSetGetAddress() {
		bank.setAddress("222 100 St Surrey BC");
		assertEquals("222 100 St Surrey BC", bank.getAddress(), 0.1);
	}

	
	@Test
	public void testDepositChecking() {
		bank.DepositToChecking(1000);
		assertEquals(1000, bank.getCheckingBalance(), 0.1);
	}
	
	
	@Test
	public void testWithdrawalChecking() {
		bank.WithdrawFromChecking(1000);
		assertEquals(1000, bank.getCheckingBalance(), 0.1);
	}
	
	@Test
	public void testDepositSaving() {
		bank.DepositToSaving(1000);
		assertEquals(1000, bank.getSavingBalance(), 0.1);
	}
	
	
	@Test
	public void testWithdrawalChecking() {
		bank.WithdrawFromChecking(1000);
		assertEquals(1000, bank.getSavingBalance(), 0.1);
	}
	
	

	@Test
	public void testGetAccountMakeDate() {
		bank.setAccountMakeDate("2017 02 02");
		assertEquals("2017 02 02", bank.getAcountMakeDate());
	}

	
	
	@Test
	public void testGetAccountID() {
		bank.setAccountID("A001");
		assertEquals("A001", bank.getAccountID());
	}

	
	@Test
	public void testIsAcountPremium() {
		bank.setIsAccountPremium(true);
		assertEquals(true, bank.isAccountPremium());
	}

	
	@Test
	public void testIsAccountBasic() {
		bank.setIsAccountBasic(true);
		assertEquals(true, bank.isAccountBasic());
	}
	
	
	@Test
	public void testIsAcccountUSD() {
		bank.setIsAccountUSD(true);
		assertEquals(true, isAccountUSD());
	}
	
	
	@Test
	public void testGetInterestRate() {
		bank.setInterestRate(.05);
		assertEquals(.05, bank.getInterestRate());
	}
	
}
