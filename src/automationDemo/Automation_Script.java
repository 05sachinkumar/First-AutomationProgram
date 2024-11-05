package automationDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testingbaba.com/old/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")).click();
		driver.findElement(By.xpath("//*[@id=\"v-pills-tab\"]/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"yes\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"impressive\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"no\"]")).click();
	}

} 
