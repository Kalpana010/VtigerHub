package vtiger;

import javax.print.attribute.standard.Fidelity;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_2 
{
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         ChromeDriver cd=new ChromeDriver();
         Actions A = new Actions(cd);
		 cd.get("https://demo.vtiger.com/vtigercrm/index.php");
	// 	 cd.manage().window().fullscreen();
		 cd.findElement(By.id("username")); 
		
		cd.findElement(By.id("password"));
		
		cd.findElement(By.xpath("//Button[text()='Sign in']")).click();
		Thread.sleep(2000);
		
		cd.findElement(By.id("appnavigator")).click();
		Thread.sleep(2000);
		
		  WebElement ele5 = cd.findElement(By.xpath("(//span[@class='module-name textOverflowEllipsis'])[1]"));
		//WebElement ele = cd.findElement(By.xpath("//span[text()=' Kampagnen']"));
		Thread.sleep(2000);
		
		Actions action = new Actions(cd);
		action.moveToElement(ele5).perform();
		   
		
		Thread.sleep(2000);
	    
		cd.findElement(By.xpath("//span[text()=' Campaigns']")).click();
		Thread.sleep(2000);
		
		cd.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(2000);
		
		cd.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("Oops");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Campaigns_editView_fieldName_targetaudience")).sendKeys("S_A_K");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Campaigns_editView_fieldName_closingdate")).sendKeys("30-4-2024");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Campaigns_editView_fieldName_targetsize")).sendKeys("10000");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Campaigns_editView_fieldName_sponsor")).sendKeys("Java");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Campaigns_editView_fieldName_numsent")).sendKeys("100");
		Thread.sleep(2000);
		
		JavascriptExecutor jse=(JavascriptExecutor)cd;
		jse.executeScript("window.scrollBy(800,0)");
		
		cd.findElement(By.id("Campaigns_editView_fieldName_budgetcost")).sendKeys("10000000");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Campaigns_editView_fieldName_actualcost")).sendKeys("500000");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Campaigns_editView_fieldName_expectedrevenue")).sendKeys("25000");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Campaigns_editView_fieldName_expectedsalescount")).sendKeys("200");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Campaigns_editView_fieldName_expectedresponsecount")).sendKeys("100");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Campaigns_editView_fieldName_actualsalescount")).sendKeys("88");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Campaigns_editView_fieldName_actualresponsecount")).sendKeys("77");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Campaigns_editView_fieldName_expectedresponsecount")).sendKeys("75");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Campaigns_editView_fieldName_expectedroi")).sendKeys("50");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Campaigns_editView_fieldName_actualroi")).sendKeys("40");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Campaigns_editView_fieldName_description")).sendKeys("do Study.....");
		Thread.sleep(2000);
		
		cd.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);
		
		cd.findElement(By.id("appnavigator")).click();
		Thread.sleep(2000);
		WebElement ele1 = cd.findElement(By.xpath("//span[text()=' MARKETING']"));
		Thread.sleep(2000);
		Actions action1 = new Actions(cd);
		action1.moveToElement(ele1).perform();
		cd.findElement(By.xpath("//span[text()=' Contacts']")).click();

		
		cd.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("kunal");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("mote");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_phone")).sendKeys("1234567890");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_mobile")).sendKeys("9021780084");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_homephone")).sendKeys("8669365248");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_otherphone")).sendKeys("8830086645");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_title")).sendKeys("java");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_department")).sendKeys("computer");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_fax")).sendKeys("hello");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_email")).sendKeys("kunalmote16@gmail.com");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Contacts_editView_fieldName_assistant")).sendKeys("testing");
		
		jse.executeScript("window.scrollBy(0,70)");
		
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_assistantphone")).sendKeys("8975690069");
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_secondaryemail")).sendKeys("motekunal@gmail.com");
		Thread.sleep(2000);
	   cd.findElement(By.cssSelector("input[id='Contacts_editView_fieldName_donotcall']")).click();		
		Thread.sleep(2000);
		cd.findElement(By.cssSelector("input[id='Contacts_editView_fieldName_emailoptout']")).click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,70)");
		cd.findElement(By.id("Contacts_editView_fieldName_reference")).click();
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_notify_owner")).click();
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_portal")).click();
		//    jse.executeScript("window.scrollBy(800,0)");
		Thread.sleep(2000);
		cd.findElement(By.name("mailingstreet")).sendKeys("pune");
		Thread.sleep(2000);
		cd.findElement(By.name("otherstreet")).sendKeys("pusad");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,70)");
		cd.findElement(By.id("Contacts_editView_fieldName_mailingpobox")).sendKeys("123");
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_otherpobox")).sendKeys("456");
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_mailingcity")).sendKeys("deccan");
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_othercity")).sendKeys("pusad");
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_mailingstate")).sendKeys("maharashtra");
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_otherstate")).sendKeys("maharashtra");
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_mailingzip")).sendKeys("441510");
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_otherzip")).sendKeys("445204");
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_mailingcountry")).sendKeys("india");
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_othercountry")).sendKeys("india");
		Thread.sleep(2000);
 		cd.findElement(By.xpath("//textarea[@name='description']")).sendKeys("king of java");
		
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_support_end_date")).clear();
		cd.findElement(By.id("Contacts_editView_fieldName_support_end_date")).sendKeys("22-04-2023");
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_support_start_date")).clear();
		Thread.sleep(2000);
		cd.findElement(By.id("Contacts_editView_fieldName_support_start_date")).sendKeys("29-05-2021");
	    Thread.sleep(2000);
		cd.findElement(By.xpath("//Button[text()='Save']")).click();
		Thread.sleep(2000);

		cd.findElement(By.id("appnavigator")).click();
		Thread.sleep(2000);
		WebElement ele2 = cd.findElement(By.xpath("//span[text()=' MARKETING']"));
		Thread.sleep(2000);
		Actions action2 = new Actions(cd);
		action2.moveToElement(ele2).perform();
		
		cd.findElement(By.xpath("//span[text()=' Leads']")).click();
		Thread.sleep(2000);
		cd.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_firstname")).sendKeys("java");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_lastname")).sendKeys("Oops");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_phone")).sendKeys("1234567890");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_company")).sendKeys("Q-spider");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_mobile")).sendKeys("1244215646");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_designation")).sendKeys("pusad");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_fax")).sendKeys("hello");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_email")).sendKeys("java@gmail.com");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_website")).sendKeys("java.com");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_annualrevenue")).sendKeys("123456");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_noofemployees")).sendKeys("118");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_secondaryemail")).sendKeys("oops@gmail.com");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_emailoptout")).click();  
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_lane")).sendKeys("pune");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_pobox")).sendKeys("12");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_code")).sendKeys("AS");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_city")).sendKeys("pune");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_country")).sendKeys("india");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_state")).sendKeys("Goa");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Leads_editView_fieldName_description")).sendKeys("do study and get job");
		Thread.sleep(2000);
		
		cd.findElement(By.xpath("//Button[text()='Save']")).click();
		Thread.sleep(2000);
		
		
		cd.findElement(By.id("appnavigator")).click();
		Thread.sleep(2000);
		WebElement ele3 = cd.findElement(By.xpath("//span[text()=' MARKETING']"));
		Thread.sleep(2000);
		Actions action3 = new Actions(cd);
		action3.moveToElement(ele3).perform();

		cd.findElement(By.xpath("//span[text()=' Organizations']")).click();
	    Thread.sleep(2000);
	    
	    cd.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")).click();
	    Thread.sleep(2000);
	    
	    cd.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("kunal");
	    Thread.sleep(2000);

	    cd.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("kunal.com");
	    Thread.sleep(2000);
	    
	    cd.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("7756481351");
	    Thread.sleep(2000);
	    
	    cd.findElement(By.id("Accounts_editView_fieldName_tickersymbol")).sendKeys("{ k }");
	    Thread.sleep(2000);
	    
	    cd.findElement(By.id("Accounts_editView_fieldName_fax")).sendKeys("k_A_S");
	    Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_otherphone")).sendKeys("4564789812");
		Thread.sleep(2000);
	    
	    cd.findElement(By.id("Accounts_editView_fieldName_employees")).sendKeys("1000");
	    Thread.sleep(2000);
	    
	    cd.findElement(By.id("Accounts_editView_fieldName_email1")).sendKeys("shubham1@gmail.com");
	    Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_email2")).sendKeys("vivek@gmail.com");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_ownership")).sendKeys("java");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_siccode")).sendKeys("k128");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_emailoptout")).click();
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_annual_revenue")).sendKeys("12450000");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_notify_owner")).click();
		Thread.sleep(2000);
		
		cd.findElement(By.name("bill_street")).sendKeys("pusad");
		Thread.sleep(2000);
		
		cd.findElement(By.name("ship_street")).sendKeys("pune");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_bill_pobox")).sendKeys("256");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_ship_pobox")).sendKeys("144");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_bill_city")).sendKeys("pune");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_ship_city")).sendKeys("pune");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_bill_state")).sendKeys("goa");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_ship_state")).sendKeys("Oops");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_bill_code")).sendKeys("Q-spider");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_bill_code")).sendKeys("J-spider");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_bill_country")).sendKeys("ind");
		Thread.sleep(2000);
		
		cd.findElement(By.id("Accounts_editView_fieldName_ship_country")).sendKeys("ind");
		Thread.sleep(2000);
		
		cd.findElement(By.name("description")).sendKeys("do study........");
		Thread.sleep(2000);

		cd.findElement(By.xpath("//Button[text()='Save']")).click();
		Thread.sleep(2000);
		cd.findElement(By.cssSelector("span[title='Atlas Jeniffer(admin)']")).click();
		Thread.sleep(2000);
        cd.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
		
		
	cd.findElement(By.xpath("//Button[text()='Save']")).click();
		Thread.sleep(2000);
		
		cd.findElement(By.xpath("span[class='fa fa-user']")).click();
		
		
		cd.findElement(By.cssSelector("span[title='Atlas Jeniffer(admin)']")).click();
		Thread.sleep(2000);
		
		cd.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
		

	}

}
