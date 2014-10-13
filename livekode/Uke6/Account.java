class Account {
	int balance;

	void deposit(int amount) {
		balance += amount;
	}

	void withdraw(int amount) {
		balance -= amount;
	}

	int getBalance() {
		return balance;
	}
}

class AccountTest {
	public static void main(String[] args) {
		Account eriksKonto = new Account();
		Account linasKonto = new Account();
		Account simonsKonto = new Account();
		eriksKonto.deposit(400);
		linasKonto.deposit(200);
		eriksKonto.withdraw(100);
		System.out.println(eriksKonto.getBalance());
		System.out.println(linasKonto.getBalance());
		System.out.println(simonsKonto.getBalance());
	}
}