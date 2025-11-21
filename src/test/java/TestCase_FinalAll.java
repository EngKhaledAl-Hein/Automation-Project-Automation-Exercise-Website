import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase_FinalAll {
    WebDriver driver;
    @BeforeTest



        //WebDriverWait driverWait ;
//    @Test
//    public void case1_test() {
//        System.out.println("Running Test Case 1");
//    }
        public void setUp() {
            driver = new ChromeDriver();
            //driverWait=new WebDriverWait();

            driver.navigate().to("https://www.automationexercise.com");
        }
        @Test(description = "Verify that home page is visible successfully",priority = 0)
        public void homepage(){
            String title=driver.getTitle();
            Assert.assertEquals(title,"Automation Exercise");
        }
        @Test(description = "Verify 'New User Signup!' is visible" , priority = 1)
        public void textVisiable(){
            driver.findElement(By.partialLinkText("Login")).click();
            //String signupText= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2")).getText();
            //Assert.assertEquals(signupText,"New User Signup!");

            String signupText= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2")).getText();
            Assert.assertEquals(signupText,"New User Signup!");

        }
        @Test(description = "Verify that 'ENTER ACCOUNT INFORMATION' is visible" , priority = 2)
        public void Fill_Account_Info(){
            driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Khaled");
            driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("khaledmohamedalhain@gmail.com");
            driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
            WebElement info=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b"));
            Assert.assertTrue(info.isDisplayed());
            //driver.findElement(By.id("id_gender1")).click();//pass to click box male
            driver.findElement(By.id("uniform-id_gender1")).click();//pass to click box male
            //driver.findElement(By.className("radio-inline")).click();//pass to click box Male
            // driver.findElement(By.name("Mr.")).click();//fail to click on male
            // driver.findElement(By.tagName("radio-inline")).click();//fail to click on male
            //driver.findElement(By.tagName("Title")).click();//fail to click on male
            //driver.findElement(By.id("name")).sendKeys("Khaled Mohamed");//passed put it increase a khaled Mohamed + first name of signUP/Login page
            driver.findElement(By.id("name")).clear();// this and the line after that is to enter a new name in create account
            driver.findElement(By.id("name")).sendKeys("Khaled Al-Hein ");
            // driver.findElement(By.id("email")).clear();
            // driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
            // driver.findElement(By.name("email_address")).sendKeys("elhyienkhaled@gmail.com");//fail because it is a hidden field
            // driver.findElement(By.name("email")).sendKeys("elhyienkhaled@gmial.com");// fail
            // driver.findElement(By.id("email")).sendKeys("elhyienkhaled@gmail.com");//fail
            //  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("elhyienkhaled@gmail.com");//fail
            driver.findElement(By.id("password")).sendKeys("123456Khaled");//pass to find field password by id
            // driver.findElement(By.name("password")).sendKeys("123456Khaled");//pass  by name
            driver.findElement(By.id("days")).sendKeys("24");//pass by id
            //driver.findElement(By.id("uniform-days")).sendKeys("24");//fail
            driver.findElement(By.id("months")).sendKeys("December");//pass by id select month
            //driver.findElement(By.name("months")).sendKeys("December");//Pass by name month
            driver.findElement(By.id("years")).sendKeys("2003"); // pass by id
            //driver.findElement(By.name("years")).sendKeys("2003");//pass by name year
            //driver.findElement(By.id("uniform-newsletter")).click();//fail
            driver.findElement(By.className("checkbox")).click();//pass for first check box
            //driver.findElement(By.className("checkbox")).click();//click out of the first checkbox
            driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[7]")).click();
//    WebElement Addr_Info= driver.findElement(By.name("Address Information"));
//     Assert.assertEquals(Addr_Info,"Address Information");
            // /////
            //Script for First name field
            //driver.findElement(By.id("first_name")).sendKeys("Khaled");//pass fo first name field by id
            //driver.findElement(By.name("first_name")).sendKeys("Khaled");//pass fo first name field by name
            driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Khaled");//pass fo first name field by xpath
            // //////
            // Script fo Last name field
            //driver.findElement(By.id("last_name")).sendKeys("Al-Hein");//pass fo last name field by id
            //driver.findElement(By.name("last_name")).sendKeys("Al-Hein");//pass fo last name field by name
            driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Al-Hein");//pass last name field by xpath
            // driver.findElement(By.className("required form-group")).sendKeys("Al-Hein");//fail to run the last name by class
            // /////
            // script for company field
            //driver.findElement(By.id("company")).sendKeys("Google");
            //driver.findElement(By.name("company")).sendKeys("Google");
            driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("Google");
            // ////
            // ///script for address field
            //driver.findElement(By.id("address1")).sendKeys("Calafournia ");
            //driver.findElement(By.name("address1")).sendKeys("Calafournia ");
            driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Calafournia ");
            //
            // /// script for next field that Address2
            //driver.findElement(By.id("address2")).sendKeys("New Jerecy");
            //driver.findElement(By.name("address2")).sendKeys("New Jerecy ");
            driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("New Jercy ");
            //   ///
            // Script for country field
            //driver.findElement(By.id("country")).sendKeys("United States");
            //driver.findElement(By.name("country")).sendKeys("United States ");
            driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("United States ");
            //   ///
            // Script for field state
            driver.findElement(By.id("state")).sendKeys("New York");
//    driver.findElement(By.name("state")).sendKeys("New York");
//    driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("New York");
            //   ///
            // Script for field city
            driver.findElement(By.id("city")).sendKeys("florida");
            //driver.findElement(By.name("city")).sendKeys("florida");
            //driver.findElement(By.xpath("//*[@id="city"]")).sendKeys("florida");
            //   ///
            // Script for field zipcode
            driver.findElement(By.id("zipcode")).sendKeys("12345");
            //driver.findElement(By.name("zipcode")).sendKeys("12345");
            //driver.findElement(By.xpath("//*[@id="zipcode"]")).sendKeys("12345");
            //   ///
            // Script for field mobile_number
            driver.findElement(By.id("mobile_number")).sendKeys("01234567890");
            //driver.findElement(By.name("mobile_number")).sendKeys("01234567890");
            //driver.findElement(By.xpath("//*[@id="mobile_number"]")).sendKeys("01234567890");
            //  /// script for field create account
            //driver.findElement(By.className("btn btn-default")).click();//fail
            //driver.findElement(By.tagName("Create Account")).click();//fail
            //driver.findElement(By.tagName("Create Account")).submit();//fail
            //driver.findElement(By.name("submit")).submit();//fail
            driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).submit();
            //driver.findElement(By.id("uniform-optin")).submit();
        }
        @Test(description = "Verify that 'ACCOUNT CREATED!' is visible", priority = 3)
        public void Account_Created(){
            WebElement Created_Page=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2"));
            Assert.assertTrue(Created_Page.isDisplayed());
            driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
        }
        //    @Test(description = "Verify that 'Logged in as username' is visible" , priority = 4)
//    public void Logged_In(){
//
//
//        WebElement Logged = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));
//        Assert.assertTrue(Logged.isDisplayed());
//        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
//
//    }
//    @Test(description = "Verify that 'ACCOUNT DELETED!' is visible",priority = 5)
//    public void Account_Deleted (){
//        WebElement delete=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2"));
//        Assert.assertTrue(delete.isDisplayed());
//        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
//
//    }
        //  for make seen of first browser looks good making a function to do the logout
        @Test(description = "Verify Logout after Creating New account " , priority = 4)
        public void Logout(){
            WebElement Logout_Button= driver.findElement(By.partialLinkText("Logout"));
            Assert.assertTrue(Logout_Button.isDisplayed());
            driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
            driver.findElement(By.partialLinkText("Signup")).click();// pass to Login Signup/Login

        }



        //  // to make al  test cases run in the same browser we make the coming steps

        // Test_Case2  ___ copy
/*
   @Test(description = "Verify that home page is visible successfully", priority = 5)
   public void Home_Visibility(){
      String title= driver.getTitle();
      Assert.assertEquals(title,"Automation Exercise");
       //  WebElement Appered=my_Driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img"));//pass to navigate Home page
       // Assert.assertTrue(Appered.isDisplayed());
        //my_Driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();//pass to click Signup/Login
       //my_Driver.findElement(By.partialLinkText("Login")).click();//pass to click Signup/Login
        driver.findElement(By.partialLinkText("Signup")).click();// pass to Login Signup/Login
   }
   */
        @Test(description = "Verify 'Login to your account' is visible",priority = 6)
        public void Login_Visible(){
//        String tap_title=my_Driver.getTitle();
//        Assert.assertEquals(tap_title,"Automation Exercise - Signup / Login");//pass to move new tap with the main tap title
            // String variable= my_Driver.getCurrentUrl();//pass without doing am assertation for element such as web Element title
            //System.out.println("variable link  is " + variable);//
            //
            //WebElement getText=my_Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2"));
            //Assert.assertTrue(getText.isDisplayed());// this tool only boolean condition using WebElement
            String text=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2")).getText();
            Assert.assertEquals(text,"Login to your account");//pass for confirm new page is opened

            driver.findElement(By.name("email")).sendKeys("khaledmohamedalhain@gmail.com");//pass for name locator
            // my_Driver.findElement(By.tagName("Email Address")).sendKeys("khaledmohamedalhain@gmail.com");//fail to find email field in login
            //my_Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("khaledmohamedalhain@gmail.com");//pass to find email field
            driver.findElement(By.name("password")).sendKeys("123456Khaled");//pass for find pass field
            // my_Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("123456Khaled");
            //my_Driver.findElement(By.name("Login")).click();//fail for click by name
            driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).submit();
        }
        @Test(description = "Verify that 'Logged in as username' is visible" , priority = 7)
        public void Logged_In(){


            WebElement Logged = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a"));
            Assert.assertTrue(Logged.isDisplayed());
            driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();

        }
        @Test(description = "Verify that 'ACCOUNT DELETED!' is visible",priority =8)
        public void Account_Deleted (){
            WebElement delete=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2"));
            Assert.assertTrue(delete.isDisplayed());
            driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();

        }

        //  Test_Case3
        //  Verify No log in if email or password invalid

        @Test (description = "Verify that home page is visible successfully", priority = 9)
        public void HomeVisibility(){
            String title= driver.getTitle();
            Assert.assertEquals(title,"Automation Exercise");
            //  WebElement Appered=my_Driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img"));//pass to navigate Home page
            // Assert.assertTrue(Appered.isDisplayed());
            //my_Driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();//pass to click Signup/Login
            //my_Driver.findElement(By.partialLinkText("Login")).click();//pass to click Signup/Login
            driver.findElement(By.partialLinkText("Signup")).click();// pass to Login Signup/Login
        }
        @Test(description = "Verify 'Login to your account' is visible",priority = 10)
        public void LoginVisible(){
//        String tap_title=my_Driver.getTitle();
//        Assert.assertEquals(tap_title,"Automation Exercise - Signup / Login");//pass to move new tap with the main tap title
            // String variable= my_Driver.getCurrentUrl();//pass without doing am assertation for element such as web Element title
            //System.out.println("variable link  is " + variable);//
            //
//        WebElement getText=my_Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2"));
//        Assert.assertTrue(getText.isDisplayed());// this tool only boolean condition using WebElement
            String text=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2")).getText();
            Assert.assertEquals(text,"Login to your account");//pass for confirm new page is opened

            driver.findElement(By.name("email")).sendKeys("khaled@gmail.com");//pass for name locator
            // my_Driver.findElement(By.tagName("Email Address")).sendKeys("khaledmohamedalhain@gmail.com");//fail to find email field in login
            //my_Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("khaledmohamedalhain@gmail.com");//pass to find email field
            driver.findElement(By.name("password")).sendKeys("Khaled");//pass for find pass field
            // my_Driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("123456Khaled");
            //my_Driver.findElement(By.name("Login")).click();//fail for click by name
            driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).submit();
        }

        @Test(description = "Verify error 'Your email or password is incorrect!' is visible" , priority = 12)
        public  void Error(){
            WebElement error_message=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p"));
            Assert.assertTrue(error_message.isDisplayed());
        }
    }



