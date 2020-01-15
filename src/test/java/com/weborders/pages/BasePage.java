package com.weborders.pages;
// This class is abstract because we don't have a correspondent page in our application.
// And this class used as a super class for all page classes.
//It has all common locators/web elements and initializes page factory

import com.weborders.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        //to enable @FindBy annotation
        PageFactory.initElements(Driver.get(), this);
    }
}
