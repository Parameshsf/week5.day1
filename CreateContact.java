package week5.day1.testNGExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateContact extends LoginTestLeaf {

	@Test
	public void createContact() throws InterruptedException {
		// TODO Auto-generated method stub

		WebElement contactTab = driver.findElement(By.linkText("Contacts"));
		contactTab.click();

		WebElement createContacTab = driver.findElement(By.linkText("Create Contact"));
		createContacTab.click();

		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstNameField']"));
		firstName.sendKeys("Parameswaran");

		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastNameField']"));
		lastName.sendKeys("Sudarsanam");

		WebElement firstNameLocal = driver.findElement(By.xpath("//input[@name='firstNameLocal']"));
		firstNameLocal.sendKeys("Paramesh");

		WebElement lastNameLocal = driver.findElement(By.xpath("//input[@name='lastNameLocal']"));
		lastNameLocal.sendKeys("S");

		WebElement department = driver.findElement(By.xpath("//input[@name='departmentName']"));
		department.sendKeys("Testing");

		WebElement description = driver.findElement(By.xpath("//textarea[@id='createContactForm_description']"));
		description.sendKeys("Selenium Testing Exercise");

		WebElement primaryEmail = driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]"));
		primaryEmail.sendKeys("parameshsf@gmail.com");

		Select stateDD = new Select(driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']")));
		stateDD.selectByVisibleText("Arkansas");

		WebElement createContactButton = driver.findElement(By.xpath("//input[@name='submitButton']"));
		createContactButton.click();

		WebElement editButton = driver.findElement(By.xpath("(//div[@class='frameSectionExtra'])[2]/a"));
		editButton.click();

		WebElement updateDesc = driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']"));
		updateDesc.clear();

		WebElement impNote = driver.findElement(By.xpath("//textarea[@name='importantNote']"));
		impNote.sendKeys("This is Selenium Automation Testing Exercise");

		WebElement updateButton = driver.findElement(By.xpath("//input[@name='submitButton']"));
		updateButton.click();

		Thread.sleep(10000);

		WebElement updateScreenTitle = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_contacts']"));
		System.out.println("After update action done, the page title is '" + updateScreenTitle.getText() + "'");

	}
}
