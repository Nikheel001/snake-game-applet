/*<applet code="snake_2" width=1910 height=920 ></applet>*/

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;

public class snake_2 extends Applet implements Runnable,KeyListener
{
	int x,y,r,px,py;
	char pos = 'w';
	Thread t;
	
	public void init()
	{
		x = getWidth()/2;
		px =x*2;
	
		y = getHeight()/2;
		py =y*2;
	
		r=30;
		
		addKeyListener(this);
		
		t=new Thread(this);
		t.start();
		this.setBackground(Color.BLUE);

	}
	public void paint(Graphics g)
	{
			g.setColor(Color.blue);
			g.fillOval(x,y,r,r);
	}
	public void run()
	{
		while( true)
		{
			try
			{		
					
				while(pos == 'w')          // For go in upwards direction.....    y>((py*3)/7)
				{
					this.setBackground(Color.ORANGE);
					y=y-2;
					repaint();
					Thread.sleep(10);
				}
				
				while(pos == 'a')                //    To go in left direction.....    x>((px*3)/7)
				{
						this.setBackground(Color.YELLOW);
					x=x-2;
					repaint();
					Thread.sleep(10);
				}
				
				while(pos == 's')			// To go in down direction......          y<((py*4)/7)
				{
						this.setBackground(Color.RED);
					y=y+2;
					repaint();
					Thread.sleep(10);
				}
				
				while(pos == 'd') 		 	// To  go in right direction .......   			x<((px*4)/7)
				{
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
	
	public void keyPressed(KeyEvent ke) { 	}
	
	public void keyReleased(KeyEvent ke) {	}
	
	public void keyTyped(KeyEvent ke)
	{
		pos = ke.getKeyChar();
	}
}
