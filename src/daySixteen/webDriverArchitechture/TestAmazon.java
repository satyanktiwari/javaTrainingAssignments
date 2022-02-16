package daySixteen.webDriverArchitechture;

public class TestAmazon {

	public static void main(String[] args) {
		String browser = "Chrome";
		//WebDriver is an interface 
		WebDriver driver =null;
		
		//Cross browser logic
		if(browser.equals("Chrome")) {
			//Top Casting
			driver = new ChromeDriver();
		} else if(browser.equals("FireFox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("Safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("Enter the correct browser");
		}
		
		driver.get("https://www.amazon.com");
		driver.getTitle();
		driver.getUrl();
		driver.findElement();
		driver.findElements();
		driver.sendKeys("sending text to amazon");
		driver.click();
		driver.close();

	}

}
