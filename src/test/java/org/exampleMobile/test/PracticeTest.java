package org.exampleMobile.test;

import org.exampleMobile.screens.HomeScreen;
import org.exampleMobile.utils.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeTest extends BaseTest {
    @Test
    public void tryNavigation(){
        HomeScreen homeScreen = returnHomeScreen();
        //homeScreen.verifyNavigation();
    }
}
