package myproject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class splash
{
public static void main(String s[ ])
{
sframe f1 = new sframe("   Banking System   Free Licence Version 2.0");
f1.setVisible(true);
int i;
int x=1;
for(i=2;i<=300;i+=4,x+=6)
{
f1.setLocation((600-((i+x)/2) ),300-(i/2));
  f1.setSize(i+x,i);
  try
{
Thread.sleep(10);

}catch(Exception e) { }

}
}
}
class sframe extends JFrame implements Runnable
{
Thread t1;
sframe(String s)
{
super(s);
setLayout(new FlowLayout());
  ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icon/banner.jpg"));
  JLabel m1 = new JLabel(c1);
add(m1);
add(new JLabel("This is Free Licence "));
add(new JLabel("Support Security "));
t1= new Thread(this);
t1.start();
}
public void run()
{
try
{
Thread.sleep(7000);
this.setVisible(false);
login f1 = new login("   USER AUTHENTICATION");

  
f1.setSize(550,200);
f1.setLocation(300,300);	
 
f1.setVisible(true);
}catch(Exception e) { e.printStackTrace(); }
}
}