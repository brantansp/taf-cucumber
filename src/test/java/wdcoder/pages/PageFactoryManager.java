package wdcoder.pages;

import com.epam.healenium.SelfHealingDriver;

public class PageFactoryManager {
    private static AdminPage adminPage;
    DocumentationPage documentationPage;
    HomePage homePage;

    public static AdminPage getAdminPage(SelfHealingDriver driver){
        return adminPage == null? new AdminPage(driver) : adminPage;
    }

}
