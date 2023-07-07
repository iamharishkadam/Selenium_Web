/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Harish Kadam
 */
public class Selenium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ddd\\Desktop\\Harish\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
        driver.navigate().to("https:www.google.com");
        driver.manage().window().maximize();
        //driver.findElemet(By.name("q")).sendKeys("Software");
        //driver.findElemet(By.ClassName("gNO89b")).click();
        String t=driver.getTitle();
        System.out.print("Title is: "+t);
        //driver.navigate().back();
        //driver.navigate().refresh();
        //driver.wait(5000);
        
        driver.quit();
    }
    
}
