import java.awt.*;    //Abstract Window ToolKit(Awt)
import java.applet.*;


//<applet code="MyApplet.class"height=500 width=500></applet>

public class MyApplet extends Applet
{

TextField t1,t2;
TextArea ta;
Label l1,l2;
Button b1;

public void init()
{
t1=new TextField("    ");
t2=new TextField("",25); //blank and accepts atmost 25 characters

ta=new TextArea("",10,40);

l1=new Label("Enter your name:");
l2=new Label("Enter your Roll:");

b1=new Button("Click Me");
l1.setBackground(new Color(111,220,111));

this.add(l1);
this.add(t1);
this.add(l2);
this.add(t2);
this.add(b1);
this.add(ta);

this.setBackground(new Color(111,220,111));

}
}










