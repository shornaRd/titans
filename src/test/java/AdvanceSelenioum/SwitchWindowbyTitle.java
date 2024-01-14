package AdvanceSelenioum;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitchWindowbyTitle {
	
	public void main (String [] args) {
		
	}	
		
		public static void WindowByTitle(WebDriver driver, String title) {
			
			String currentWindow = driver.getWindowHandle();
			
		Set<String> allWindow = driver.getWindowHandles();
		for(String winName: allWindow) {
			//1 Amazon.com, spend less,smile more
			//2 Amazon.com, best seller item
			// Amazon.com, amazon basic
			//Amazon.com, amazon sing
				
		if(!driver.switchTo().window(winName).getTitle().equals(title)) {
			
			driver.switchTo().window(currentWindow);
	 
	
				}
			}
				
			}
			
}
	
