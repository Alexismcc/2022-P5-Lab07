import java.applet.*;
import java.awt.*;

public class Background {
    public static void drawSky (Graphics g){
        g.setColor(new Color(50,200,255));
        g.fillRect(0,0,1000,325);
    }
    public static void drawGround (Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0,325,1000,325);
    }
    public static void drawTrees (Graphics g){

    }
}
