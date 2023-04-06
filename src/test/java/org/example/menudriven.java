package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.Scanner;
public class menudriven {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Alert Box");
            System.out.println("2. Confirm Box");
            System.out.println("3. Prompt Box");
            System.out.println("4. Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println(driver.findElement(By.id("output")).getText());
                    Thread.sleep(2000);
                    driver.findElement(By.id("alertBox")).click();
                    Thread.sleep(2000);
                    System.out.println(driver.switchTo().alert().getText());
                    Thread.sleep(2000);
                    driver.switchTo().alert().accept();
                    Thread.sleep(2000);
                    System.out.println(driver.findElement(By.id("output")).getText());
                    break;
                case 2:
                    System.out.println(driver.findElement(By.id("output")).getText());
                    Thread.sleep(2000);
                    driver.findElement(By.id("confirmBox")).click();
                    Thread.sleep(2000);
                    System.out.println(driver.switchTo().alert().getText());
                    Thread.sleep(2000);
                    driver.switchTo().alert().accept();
                    Thread.sleep(2000);
                    System.out.println(driver.findElement(By.id("output")).getText());
                    break;
                case 3:
                    System.out.println(driver.findElement(By.id("output")).getText());
                    Thread.sleep(2000);
                    driver.findElement(By.id("promptBox")).click();
                    Thread.sleep(2000);
                    System.out.println(driver.switchTo().alert().getText());
                    Thread.sleep(2000);
                    driver.switchTo().alert().sendKeys("Sneha");
                    driver.switchTo().alert().accept();
                    Thread.sleep(2000);
                    System.out.println(driver.findElement(By.id("output")).getText());
                    break;
                case 4:
                    driver.quit();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}