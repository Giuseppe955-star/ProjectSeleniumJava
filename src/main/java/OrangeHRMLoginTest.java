import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//test
public class OrangeHRMLoginTest {
    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            // Crea un oggetto WebDriverWait con un timeout di 10 secondi
            // Wait for 5 seconds
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Find elements and perform actions
            WebElement usernameField = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
            usernameField.sendKeys("Admin");

            WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
            passwordField.sendKeys("admin123");

            WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
            loginButton.click();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Navigate to Admin module
            WebElement adminModule = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
            adminModule.click();

            // Wait for 5 seconds
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            // Attendi fino a quando un certo elemento è visibile
            //WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("someElementId")));

            // Ora puoi interagire con l'elemento
            //System.out.println("Elemento trovato: " + element.getText());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Assicurati di chiudere il driver
            driver.quit();
        }
    }
}