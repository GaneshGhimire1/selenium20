package seleniumtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day52tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.webdriveruniversity.com/Data-Table/index.html");
		
		// Getting total number of rows 
				List<WebElement> tbl = driver.findElements(By.xpath("//*[table]"));
				//driver.findElements(By.cssSelector("table"));

				System.out.println(tbl.size());
				// Getting total number of columns 

				List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
				int totalRows = rows.size();
				System.out.println(totalRows);


				List<WebElement>  columns = driver.findElements(By.xpath("//*[@id=\"t02\"]/tbody/tr[2]/td"));
				int totalColums = columns.size();
				System.out.println(totalColums);

				////*[@id="t01"]/tbody/tr[2]/td[3]
				int sum = 0;

				for(int i = 2 ; i <= totalRows ; i++) {

					//*[@id="t01"]/tbody/tr[i]/td[3]
					System.out.println(i);
					String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[3]")).getText();
					System.out.println(text);
					sum = sum + Integer.parseInt(text);



				}
				System.out.println(sum);

				// find the person with Michael


				for(int i = 2 ; i <= totalRows ; i++) {
					String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[1]")).getText();
					System.out.println(text);
					if(text.equals("Michael")) {
						System.out.println("Test case pass ");
						break;
					}
				}

		
	}

}
