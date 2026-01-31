package commons;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	private final DriverManager driverManager;
	public Hooks(DriverManager driverManager) {
		this.driverManager=driverManager;
	}
	@Before
	public void setup() {
		driverManager.initDriver();
	}
//	@After
	public void close() {
		driverManager.quitDriver();
	}
}
