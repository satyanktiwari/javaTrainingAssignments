package daySixteen.webDriverArchitechture;

public class RemoteWebDriver implements WebDriver {

	@Override
	public void findElement() {
		System.out.println("Element found");
		
	}

	@Override
	public void findElements() {
		System.out.println("Elements found");
		
	}

	@Override
	public void get(String url) {
		System.out.println("Enter the Url");
		
	}

	@Override
	public String getTitle() {
		
		return "Some tile";
	}

	@Override
	public String getUrl() {
		
		return "https://google.com";
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("Following value entered: "+ value);
		
	}

	@Override
	public void click() {
		System.out.println("action click was performed");
		
	}

	@Override
	public void close() {
		System.out.println("Driver closed");
		
	}

}
