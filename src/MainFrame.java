import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
 
public class MainFrame extends JFrame {
  public static JTextArea outputText = new JTextArea(0, 35);
  public static JTextArea inputText = new JTextArea(5,5);
  Color outputColor = new Color(143, 188, 143);
  Color inputColor = new Color(135,206,250);
  
 
  public MainFrame() {
//    add.addActionListener(new ActionListener() {
//      public void actionPerformed(ActionEvent e) {
//      }
//    });
// 
//    clear.addActionListener(new ActionListener() {
//      public void actionPerformed(ActionEvent e) {
// outputText.setText("");
//// System.out.println("Test" + outputColor.getRed());
// inputText.setText("");
//      }
//    });
	  
	  inputText.addKeyListener(new KeyAdapter() {
		    public void keyPressed(KeyEvent evt) {
		    	int keyCode = 0;
		    	keyCode = evt.getKeyCode();
		    	System.out.println(keyCode);
//		        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
//		        	int keyCode = 0;
//		        	keyCode = evt.getKeyCode();
//		        	System.out.println(keyCode);
//		        }
		     }
		 });
	  
    setLayout(new BorderLayout());
    Container c = getContentPane();
    outputText.setBackground(outputColor);
    inputText.setBackground(inputColor);
    
    c.add(inputText, BorderLayout.AFTER_LAST_LINE);
    c.add(outputText, BorderLayout.WEST);

    
  }
 
  public static void main(String[] args) {
	  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	  int width = (int) screenSize.getWidth();
	  int height = (int) screenSize.getHeight();
	  setFrame(new MainFrame(), width, height);
	    }
 
  public static void setFrame(final JFrame frame,
		  					final int width, final int height) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
    	  frame.setTitle("balls");
    	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  frame.setSize(width, height);
    	  frame.setVisible(true);
       }
     });
   }
 
} 