package week5.day1.testNGExercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends LoginTestLeaf {
	//Extending LoginTestLeaf as a parent class to reuse the login method
	
	@Test
	public void createLead() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement leadsTab = driver.findElement(By.linkText("Leads"));
		leadsTab.click();

		driver.findElement(By.linkText("Create Lead")).click();

		WebElement compName = driver.findElement(By.id("createLeadForm_companyName"));
		compName.sendKeys("Cognizant");

		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Parameswaran");

		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Sudarsanam");

		// Dropdown Selection
		Select source = new Select(driver.findElement(By.name("dataSourceId")));
		
		source.selectByVisibleText("Direct Mail");
		
		List<WebElement> options = source.getOptions();
		System.out.println("Data Source ID Drop Down Values as below : ");
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
			
		}
		// Dropdown
		/*Select marketingCampaign = new Select(driver.findElement(By.name("marketingCampaignId")));
		marketingCampaign.selectByIndex(1);*/
		
		WebElement mktCamp = driver.findElement(By.name("marketingCampaignId"));
		mktCamp.sendKeys("Affiliate Sites");//Alternate way to select a dropdown value
	
		WebElement firstNameLocal = driver.findElement(By.name("firstNameLocal"));
		firstNameLocal.sendKeys("Parameswaran");

		WebElement lastNameLocal = driver.findElement(By.name("lastNameLocal"));
		lastNameLocal.sendKeys("Sudarsanam");

		WebElement salutation = driver.findElement(By.name("personalTitle"));
		salutation.sendKeys("Testing");

		WebElement birthDate = driver.findElement(By.name("birthDate"));
		birthDate.sendKeys("01/23/82");

		WebElement title = driver.findElement(By.name("generalProfTitle"));
		title.sendKeys("Create Lead by Paramesh");

		WebElement department = driver.findElement(By.name("departmentName"));
		department.sendKeys("QEA");

		WebElement annualRevenue = driver.findElement(By.name("annualRevenue"));
		annualRevenue.sendKeys("1000000");

		// Dropdown
		Select preferredCurrency = new Select(driver.findElement(By.name("currencyUomId")));
		preferredCurrency.selectByVisibleText("INR - Indian Rupee");
		// Dropdown
		Select industry = new Select(driver.findElement(By.name("industryEnumId")));
		//industry.selectByValue("IND_INSURANCE");
		industry.selectByIndex(6);//to select the value HealthCare from the dropdown using index

		WebElement numberOfEmp = driver.findElement(By.name("numberEmployees"));
		numberOfEmp.sendKeys("150");

		// DropDown
		Select owner = new Select(driver.findElement(By.name("ownershipEnumId")));
		owner.selectByValue("OWN_PARTNERSHIP");
		List<WebElement> ownerDDValues = owner.getOptions();//to get the count of dropdown values
		System.out.println("Owner Drop Down Count Size :"+ownerDDValues.size());
		

		WebElement sicCode = driver.findElement(By.name("sicCode"));
		sicCode.sendKeys("X0001");

		WebElement tickerSymbol = driver.findElement(By.name("tickerSymbol"));
		tickerSymbol.sendKeys("Automation");

		WebElement description = driver.findElement(By.name("description"));
		description.sendKeys("Selenium Automation");

		WebElement impNote = driver.findElement(By.name("importantNote"));
		impNote.sendKeys("Selenium Automation is interesting");

		WebElement countryCode = driver.findElement(By.name("primaryPhoneCountryCode"));
		countryCode.sendKeys("91");

		WebElement areaCode = driver.findElement(By.name("primaryPhoneAreaCode"));
		areaCode.sendKeys("044");

		WebElement phNumber = driver.findElement(By.name("primaryPhoneNumber"));
		phNumber.sendKeys("9952022192");

		WebElement extension = driver.findElement(By.name("primaryPhoneExtension"));
		extension.sendKeys("1234");

		WebElement personToAsk = driver.findElement(By.name("primaryPhoneAskForName"));
		personToAsk.sendKeys("Parameswaran");

		WebElement email = driver.findElement(By.name("primaryEmail"));
		email.sendKeys("parameshsf@gmail.com");

		WebElement webURL = driver.findElement(By.name("primaryWebUrl"));
		webURL.sendKeys("http://leaftaps.com/opentaps/control/main");

		WebElement generalToName = driver.findElement(By.name("generalToName"));
		generalToName.sendKeys("Parameswaran S");

		WebElement generalAttentionName = driver.findElement(By.name("generalAttnName"));
		generalAttentionName.sendKeys("Paramesh");

		WebElement address1 = driver.findElement(By.name("generalAddress1"));
		address1.sendKeys("Gemini Magnolia Apartment");

		WebElement address2 = driver.findElement(By.name("generalAddress2"));
		address2.sendKeys("Polachery");

		WebElement city = driver.findElement(By.name("generalCity"));
		city.sendKeys("Chennai");

		// DropDown
		Select country = new Select(driver.findElement(By.name("generalCountryGeoId")));
		country.selectByVisibleText("India");
		Thread.sleep(5000);
		Select state = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		state.selectByVisibleText("TAMILNADU");

		WebElement pinCode = driver.findElement(By.name("generalPostalCode"));
		pinCode.sendKeys("600127");

		WebElement pinCodeExt = driver.findElement(By.name("generalPostalCodeExt"));
		pinCodeExt.sendKeys("0000");

		String printFirstName = firstName.getText();
		System.out.println("Before Create Lead submitted, The entered First Name is :" + printFirstName);

		WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
		createLeadButton.click();
		
		Thread.sleep(5000);
		
		WebElement dispFirstName = driver.findElement(By.id("viewLead_firstName_sp"));
		System.out.println("After Create Lead submitted, The entered First Name is :" + dispFirstName.getText());

		Thread.sleep(3000);
		//driver.close();

	}

}
