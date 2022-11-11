package Server;

import java.awt.*;
import java.awt.image.BufferedImage;

public class takepic {
    public takepic(){
        try {
            Thread.sleep(120);
            Robot r = new Robot();

            Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage Image = r.createScreenCapture(capture);
            System.out.println(Image);
            System.out.println("Screenshot saved");
        }
        catch (AWTException | InterruptedException ex) {
            System.out.println(ex);
        }
    }
}
