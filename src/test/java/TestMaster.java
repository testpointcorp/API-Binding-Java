import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


import com.gargoylesoftware.htmlunit.WebClient;
import com.mashape.unirest.http.Unirest;


import testpoint.Vansah;

public class TestMaster
{

	private static WebDriver driver;
	static GetBrowserInstance browser=new GetBrowserInstance();
	
	
	public static void main (String[] args) throws Exception
	{

		TestMaster1 test1 = new TestMaster1();
		
		
		TestMaster1.main(args);
		
		
	}

}




