package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class BrowseAndDropFilesPage3 extends Utility {

    private static final Logger log = LogManager.getLogger(BrowseAndDropFilesPage3.class.getName());

    public BrowseAndDropFilesPage3() {
        PageFactory.initElements(driver, this);
    }
    public void setClipBoard(String file){
        StringSelection obj = new StringSelection(file);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
    }

    public void uploadFile(String filePath) throws AWTException {
        setClipBoard(filePath);
        Robot rb = new Robot();
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_V);
    }


}
