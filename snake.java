/*<applet code="snake" 
 * archive = "snake.jar" 
 * width=1920 height=1080 ></applet>*/

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;


public class snake extends Applet implements Runnable,KeyListener
{
	int x,y,r,px,py;
	char arrow;
	Thread t;
	
	public void init()
	{		
		x = getWidth()/2;
		px =x*2;
	
		y = getHeight()/2;
		py =y*2;
	
		r=30;
		t=new Thread(this);
		t.start();
		this.setBackground(Color.BLUE);
		//this.setBackground(Color.RED);
	}
	public void paint(Graphics g)
	{
			g.fillOval(x,y,r,r);
			g.setColor(Color.BLACK);
	}
	public void run()
	{
		while(true)
		{
			try
			{				
				while(y>((py*3)/7))
				{
					addKeyListener(this);
					this.setBackground(Color.ORANGE);
					y=y-2;
					repaint();
					Thread.sleep(10);
				}
				
				while(x>((px*3)/7))
				{
					addKeyListener(this);
					this.setBackground(Color.YELLOW);
					x=x-2;
					repaint();
					Thread.sleep(10);
				}
				
				while(y<((py*4)/7))
				{
					addKeyListener(this);
					this.setBackground(Color.RED);
					y=y+2;
					repaint();
					Thread.sleep(10);
				}
				
				while(x<((px*4)/7))
				{
					addKeyListener(this);
					this.setBackground(Color.GREEN);
					x=x+2;
					repaint();
					Thread.sleep(10);
				}
			}
			catch(Exception e)
			{
				System.out.println("ERROR");
			}
		}
		
	}
	
	public void keyPressed(KeyEvent ke)
	{
		
	}
	
	public void keyReleased(KeyEvent ke)
	{
		
	}
	
	public void keyTyped(KeyEvent ke)
	{
		arrow = ke.getKeyChar();
	
		System.out.println(arrow);
		System.out.println(arrow);
	
			if (arrow == '1')
			{
				System.out.print("w ");
			}
			if (arrow ==  '2')
			{
				System.out.print("a ");
			}
			if (arrow == '3')
			{
				System.out.print("s ");
			}
			if (arrow ==  '4')
			{
				System.out.print("d ");
			}

	}
	
}
