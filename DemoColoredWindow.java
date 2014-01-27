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
import java.awt.Color;

public class DemoColoredWindow
{
    public static void main(String[] args) 
    {
        ColoredWindow w1 = new ColoredWindow( );
        w1.setVisible(true);

        ColoredWindow w2 = new ColoredWindow(Color.YELLOW);
        w2.setVisible(true);
    }
}
