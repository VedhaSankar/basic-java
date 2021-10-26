import java.applet.Applet;
import java.awt.Graphics;

//No need to extend JApplet, since we don't add any components;
//we just paint.
/*
<applet code = "applet_sample.class" width = "200" height = "300">
</applet>
*/


public class applet_sample extends Applet
{
    @Override
    public void paint(Graphics g)
    {
        g.drawString("Hello world", 20, 20);
    }
}