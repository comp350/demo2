/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package democoloredwindow;

/**
 *
 * @author 
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class ColoredWindow extends JFrame
{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    public ColoredWindow(Color theColor)
    {
        super("No Charge for Color" );
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane( ).setBackground(theColor);

        JLabel aLabel = new JLabel("Close-window button works.");
        add(aLabel);
    }

    public ColoredWindow( )
    {
        this(Color.PINK);
    }
}
