import java.applet.Applet;
import java.awt.*;
import java.util.*;
   public class Lab07cs5 extends Applet{
      public void paint(Graphics g){

         g.drawRect(0,0,1000,650);

         Background.drawSky(g);
         Background.drawGround(g);
         Background.drawTrees(g);


         Sky.drawSun(g);
         Sky.drawClouds(g);
         Sky.drawSnowFlakes(g);


         House.drawBase(g);
         House.drawRoof(g);
         House.drawWindows(g);
         House.drawdoor(g);


         Snowmen.drawBottom(g);
         Snowmen.drawMiddle(g);
         Snowmen.drawTop(g);
         Snowmen.drawHat(g);
         Snowmen.drawSnowmanFace(g);


         Person.drawTorso(g);
         Person.drawHead(g);
         Person.drawLegs(g);
         Person.drawArms(g);
         Person.drawFace(g);
      }
   }


