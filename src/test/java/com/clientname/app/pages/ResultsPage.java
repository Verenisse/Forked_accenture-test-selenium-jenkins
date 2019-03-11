package com.clientname.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.accenture.test.ui.WebDriverSession;

public class ResultsPage extends WebDriverSession{

    public ResultsPage() {

        PageFactory.initElements(getWebDriverSession(), this);

    }
    
    @FindBy(xpath = "//div[contains(text(),'Todos')]")
    public WebElement tabTodos;
    
    @FindBy(xpath = "//a[contains(text(),'Noticias')]")
    public WebElement tabNoticias;
       
    @FindBy(xpath = "//a[contains(text(),'Videos')]")
    public WebElement tabVideos;
    
    @FindBy(xpath = "//a[contains(text(),'Libros')]")
    public WebElement tabLibros;   
    
    @FindBy(xpath = "//a[contains(text(),'Preferencias')]")
    public WebElement tabPref;
    
    @FindBy(xpath = "//a[contains(text(),'Herramientas')]")
    public WebElement tabHerramientas;

    
}
