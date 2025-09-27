package Tests;

import org.testng.annotations.Test;

public class MosTest extends Base{

    @Test
    public void verifyHomePageIsDisplayedTests(){

        homePage.verifyHomePageIsDisplayed();

    }
    @Test (priority = 1)
    public void clickLearningMaterialTest(){

        homePage.clickLearningMaterial();

    }


   @Test (priority = 2)
    public void clickLoginTest(){

        login.clickLogin();

  }

}
