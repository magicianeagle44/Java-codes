import java.awt.*;    //Abstract Window ToolKit(Awt)
import java.applet.*;


//<applet code="Applet1.class"height=200 width=250></applet>  

/*JAVA doesnot understand the above html tag,so it is commented so that it is not caught by the compiler
But appletviewer understands this html tag, and the tag must include the class file */

public class Applet1 extends Applet
{
public void init()
{
setBackground(Color.gray);
setForeground(Color.red);
}

public void paint(Graphics g)
{
g.drawString("JAVA ROXX",150,100);                          
}
}

/*OUTPUT:


E:\Ass9>javac Applet1.java

E:\Ass9>appletviewer Applet1.java

*/










