import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Calculator extends JFrame implements ActionListener
{
int i,r,n1,n2;
char op;
JButton b[]=new JButton[17];
JTextField res;
JPanel p;
Calculator()
{
p=new JPanel(new GridLayout(5,4));
for(int i=0;i<=9;i++)
{
b[i]=new JButton(""+i);
p.add(b[i]);
b[i].addActionListener(this);
}
b[10]=new JButton("+");
p.add(b[10]);
b[10].addActionListener(this);
b[11]=new JButton("-");
p.add(b[11]);
b[11].addActionListener(this);
b[12]=new JButton("*");
p.add(b[12]);
b[12].addActionListener(this);
b[13]=new JButton("/");
p.add(b[13]);
b[13].addActionListener(this);
b[14]=new JButton("%");
p.add(b[14]);
b[14].addActionListener(this);
b[15]=new JButton("=");
p.add(b[15]);
b[15].addActionListener(this);
b[16]=new JButton("Clear");
p.add(b[16]);
b[16].addActionListener(this);
res=new JTextField("");
add(p);
add(res, BorderLayout.NORTH);
setVisible(true);
setSize(200,200);
}
int eval()
{
switch(op)
{
case '+': r=n1+n2;
break;
case '-': r=n1-n2;
break;
case '*': r=n1*n2;
break;
case '/': r=n1/n2;
break;
case '%': r=n1%n2;
break;
}
return 0;
}
public void actionPerformed(ActionEvent ae)
{
JButton pb=(JButton)ae.getSource();
if(pb==b[16])
{
r=n1=n2=0;
res.setText("");
}
else if(pb==b[15])
{
n2=Integer.parseInt(res.getText());
eval();
res.setText(""+r);
}
else
{
boolean opf=false;

if(pb==b[10])
{
op='+';
opf=true;
}
if(pb==b[11])
{
op='-';
opf=true;
}
if(pb==b[12])
{
op='*';
opf=true;
}
if(pb==b[13])
{
op='/';
opf=true;
}
if(pb==b[14])
{
op='%';
opf=true;
}
if(opf==false)
{
for(i=0;i<10;i++)
{
if(pb==b[i])
{
String t=res.getText();
t=t+i;
res.setText(t);
}}}
else
{
n1=Integer.parseInt(res.getText());
res.setText("");
}
}
}
}
public class calculator{
public static void main(String args[])
{
Calculator c=new Calculator();
}}


