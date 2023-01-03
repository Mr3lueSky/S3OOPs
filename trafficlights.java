import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
class Traffic extends JFrame implements ItemListener {
   JRadioButton t1,t2,t3;
   int x=0,y=0,z=0;
   Traffic() {
       t1 = new JRadioButton("Red");
       t2 = new JRadioButton("Yellow");
       t3 = new JRadioButton("Green");
       ButtonGroup bg=new ButtonGroup();
       setLayout(new FlowLayout());
       add(t1);
       add(t2);
       add(t3);

       bg.add(t1);
       bg.add(t2);
       bg.add(t3);
       t1.addItemListener(this);
       t2.addItemListener(this);
       t3.addItemListener(this);
       setSize(400,500);
       setVisible(true);
        }
   public void itemStateChanged(ItemEvent ie)
   {
       if(ie.getSource()==t1)
       {
           if(ie.getStateChange()==1) {
               repaint();
               x = 1;
           }
       }
       if(ie.getSource()==t2) {
           if (ie.getStateChange() == 1) {
               repaint();
               y = 1;
           }
       }
       if(ie.getSource()==t3) {
           if (ie.getStateChange() == 1) {
               repaint();
               z = 1;
           }
       }
   }
   public void paint(Graphics g)
   {
       g.drawRect(100,105,100,300);
       g.drawOval(120,150,60,60);
       g.drawOval(120,230,60,60);
       g.drawOval(120,300,60,60);
       if(x==1)
       {
           g.setColor(Color.RED);
           g.fillOval(120,150,60,60);
           g.setColor(Color.WHITE);
           g.fillOval(120,230,60,60);
           g.setColor(Color.WHITE);
           g.fillOval(120,300,60,60);
           x=0;
       }
       if(y==1)
       {
           g.setColor(Color.WHITE);
           g.fillOval(120,150,60,60);
           g.setColor(Color.ORANGE);
           g.fillOval(120,230,60,60);
           g.setColor(Color.WHITE);
           g.fillOval(120,300,60,60);
           y=0;
       }
if(z==1)
       {
           g.setColor(Color.WHITE);
           g.fillOval(120,150,60,60);
           g.setColor(Color.WHITE);
           g.fillOval(120,230,60,60);
           g.setColor(Color.GREEN);
           g.fillOval(120,300,60,60);
           z=0;
       }

   }
}
public class trafficlights{
   public static void main(String[] args) {

       Traffic t=new Traffic();
   }
}
