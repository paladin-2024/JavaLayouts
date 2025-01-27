import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LayoutApplication {//creating a class
    JFrame BorderFrame;//setting an instance variable
    JButton  Button1,Button2;
    public LayoutApplication() {// creating a constructor
        this.prepareBorderFrame();//Calling the method in the constructor
    }

    public JFrame prepareBorderFrame(){//the method that helps to deal with all logic that is connected in creating the frame
        JFrame.setDefaultLookAndFeelDecorated(true);//change the appearance of the frame to make it a little bit groovy
        BorderFrame=new JFrame("Border Layout");//creating a frame
        //BorderFrame.setSize(500,250);//setting the size of the frame (width, height)
        BorderFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);//maximizing he window according to the size of the computer
        BorderFrame.setLayout(new GridLayout(1,2));
        //GridLayout GL= new GridLayout(1,2);//creating the grid layout of one row and two columns
        //BorderFrame.setLayout(GL);//setting the layout to the frame

        BorderFrame.add(this.prepareButtonOne());
        BorderFrame.add(this.prepareButtonTwo());

        BorderFrame.setVisible(true);//setting the visibility for displaying the frame when running it.
        return BorderFrame;

    }

    public JButton prepareButtonOne(){//Button one method
        Button1 = new JButton("ButtonOne");
        return Button1;
    }

    public JButton prepareButtonTwo(){//Button two method
        Button2 = new JButton("ButtonTwo");
        return Button2;
    }
}
