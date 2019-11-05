package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {


//    private HoversPage.FigureCaption caption;
    @Test
    public void testHoverUser1(){
        HoversPage hoversPage = homePage.clickHovers();
//        HoversPage.FigureCaption caption = 0"";
//        hoversPage.hoverOverFigure(1) = caption;
 
        assertTrue(hoversPage.hoverOverFigure(1).isCaptionDisplayed(),"Caption not displayed");
        assertEquals(hoversPage.hoverOverFigure(1).getTitle(),"name: user1", "Caption title incorrect");
        assertEquals(hoversPage.hoverOverFigure(1).getLinkText(), "View profile", "Caption link text incorrect");
        assertTrue(hoversPage.hoverOverFigure(1).getLink().endsWith("/users/1"), "Link incorrect");

    }
}
