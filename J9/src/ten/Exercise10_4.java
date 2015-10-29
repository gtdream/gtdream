package ten;
import java.awt.*;
import java.awt.event.*;

class Exercise10_4
{
	public static void main(String[] args) 
	{
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(true);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}
}

