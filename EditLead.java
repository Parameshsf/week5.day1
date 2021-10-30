package week5.day1.testNGExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditLead extends LoginTestLeaf {

	@Test
	public void editLead() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement leadsTab = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		leadsTab.click();

		// find leads
		WebElement findLeadsLink = driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]"));
		findLeadsLink.click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Parameswaran");

		/*
		 * // Click Phone Tab WebElement phoneTab =
		 * driver.findElement(By.xpath("//span[contains(text(),'Phone')]"));
		 * phoneTab.click();
		 * 
		 * WebElement countryCode =
		 * driver.findElement(By.xpath("//input[@name='phoneCountryCode']"));
		 * countryCode.clear(); countryCode.sendKeys("91");
		 * 
		 * WebElement areaCode =
		 * driver.findElement(By.xpath("//input[@name='phoneAreaCode']"));
		 * areaCode.sendKeys("044");
		 * 
		 * WebElement phNumber =
		 * driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		 * phNumber.sendKeys("9952022192");
		 */

		WebElement findLeadButton = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
		findLeadButton.click();

		Thread.sleep(3000);

		WebElement firstLeadID = driver
				.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String leadID = firstLeadID.getText();
		System.out.println("Lead ID :" + leadID);

		firstLeadID.click();
		String title = driver.findElement(By.xpath("//div[text()='View Lead']")).getText();
		System.out.println("The Title is " + title);
		String companyNameBeforeEdit = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Company Name Before Edit is " + companyNameBeforeEdit);

		// Edit Lead
		driver.findElement(By.linkText("Edit")).click();

		WebElement compName = driver.findElement(By.id("updateLeadForm_companyName"));
		compName.clear();
		compName.sendKeys("MayBach");
		// Click Update
		driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();

		String companyNameAfterEdit = driver.findElement(By.id("viewLead_companyName_sp")).getText();

		if (companyNameBeforeEdit.equalsIgnoreCase(companyNameAfterEdit)) {
			System.out.println("Company Name Before Edit '" + companyNameBeforeEdit + "' and Company Name Aftet Edit '"
					+ companyNameAfterEdit + "' are same");

		} else {
			System.out.println("After Edit, The company Name has been changed as " + compName.getText());
		}

	}

}
