import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Screen_shot {
    public static final long serialVersionUID=1L;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Thread.sleep(2000);
            Robot robot=new Robot();
            
            //path specifies the directory in which the screenshot will be saved.
            String path="C:\\Users\\Admin\\Pictures\\Screenshots\\Screenshot.jpg";
            
            Rectangle capture=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage img=robot.createScreenCapture(capture);
            ImageIO.write(img,"jpg", new File(path));
            final JDialog dialog = new JDialog();
            dialog.setAlwaysOnTop(true);    
            JOptionPane.showMessageDialog(dialog, "Screenshot Saved!");
            System.exit(0);
        }
        catch(Exception e){
            System.out.println(e);
        }
        // TODO code application logic here
    }
    
}
