package week5.day1.testNGExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DuplicateLead extends LoginTestLeaf {
	
	@Test
	public void duplicateLead() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement leadsTab = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		leadsTab.click();

		// find leads
		WebElement findLeadsLink = driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]"));
		findLeadsLink.click();

		// Click Phone Tab
		WebElement phoneTab = driver.findElement(By.xpath("//span[contains(text(),'Phone')]"));
		phoneTab.click();

		WebElement countryCode = driver.findElement(By.xpath("//input[@name='phoneCountryCode']"));
		countryCode.clear();
		countryCode.sendKeys("91");

		WebElement areaCode = driver.findElement(By.xpath("//input[@name='phoneAreaCode']"));
		areaCode.sendKeys("044");

		WebElement phNumber = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		phNumber.sendKeys("9952022192");

		WebElement findLeadButton = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
		findLeadButton.click();
		
		Thread.sleep(10000);
		
		WebElement firstLeadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String leadID = firstLeadID.getText();
		System.out.println("Lead ID :"+leadID);
		
		firstLeadID.click();
		
		String fNameBefore = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		
		//Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		/*String title = driver.getTitle();
		System.out.println("The Title is : "+title);
		if (title.equalsIgnoreCase("Duplicate Lead")) {
			System.out.println("The title is "+title);
			
		}*/
		String duplicateTitle = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
		if (duplicateTitle.contentEquals("Duplicate Lead")) {
			System.out.println("The Title is "+duplicateTitle);
			
		}
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String fNameAfter = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		
		if (fNameBefore.equalsIgnoreCase(fNameAfter)) {
			System.out.println("First Name has the same value before and after duplicate lead");
			
		}

	}

}
