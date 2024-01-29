package ExceptionHandling;
import javax.swing.*;
import java.awt.*;

public class DigitalWatch extends JFrame {

    public DigitalWatch () {
        // Create a JFrame with the title "Digital Watch"
        super ("Digital Watch");
        // Set the size of the JFrame
        setSize (300, 300);
        // Set the default close operation
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        // Set the background color to black
        getContentPane ().setBackground (Color.black);
        // Set the layout to null
        setLayout (null);

        // Create a JLayeredPane to hold the components
        JLayeredPane layeredPane = new JLayeredPane ();
        // Set the size and position of the layered pane
        layeredPane.setBounds (0, 0, 300, 300);
        // Add the layered pane to the JFrame
        add (layeredPane);

        // Create a JLabel to display the battery icon
        JLabel batteryLabel = new JLabel ();
        // Set the icon of the label to a white battery image
        batteryLabel.setIcon (new ImageIcon ("battery.png"));
        // Set the size and position of the label
        batteryLabel.setBounds (140, 10, 20, 10);
        // Add the label to the layered pane
        layeredPane.add (batteryLabel, Integer.valueOf (1));

        // Create a JLabel to display the heart icon
        JLabel heartLabel = new JLabel ();
        // Set the icon of the label to a red heart image
        heartLabel.setIcon (new ImageIcon ("heart.png"));
        // Set the size and position of the label
        heartLabel.setBounds (50, 100, 20, 20);
        // Add the label to the layered pane
        layeredPane.add (heartLabel, Integer.valueOf (1));

        // Create a JLabel to display the sun icon
        JLabel sunLabel = new JLabel ();
        // Set the icon of the label to a yellow sun image
        sunLabel.setIcon (new ImageIcon ("sun.png"));
        // Set the size and position of the label
        sunLabel.setBounds (230, 100, 20, 20);
        // Add the label to the layered pane
        layeredPane.add (sunLabel, Integer.valueOf (1));

        // Create a JLabel to display the heart rate
        JLabel heartRateLabel = new JLabel ("128");
        // Set the font, foreground color, and horizontal alignment of the label
        heartRateLabel.setFont (new Font ("Arial", Font.BOLD, 20));
        heartRateLabel.setForeground (Color.white);
        heartRateLabel.setHorizontalAlignment (SwingConstants.CENTER);
        // Set the size and position of the label
        heartRateLabel.setBounds (70, 100, 50, 20);
        // Add the label to the layered pane
        layeredPane.add (heartRateLabel, Integer.valueOf (1));

        // Create a JLabel to display the temperature
        JLabel temperatureLabel = new JLabel ("32°");
        // Set the font, foreground color, and horizontal alignment of the label
        temperatureLabel.setFont (new Font ("Arial", Font.BOLD, 20));
        temperatureLabel.setForeground (Color.white);
        temperatureLabel.setHorizontalAlignment (SwingConstants.CENTER);
        // Set the size and position of the label
        temperatureLabel.setBounds (180, 100, 50, 20);
        // Add the label to the layered pane
        layeredPane.add (temperatureLabel, Integer.valueOf (1));

        // Create a JLabel to display the analog clock
        JLabel clockLabel = new JLabel ();
        // Set the icon of the label to a white analog clock image
        clockLabel.setIcon (new ImageIcon ("clock.png"));
        // Set the size and position of the label
        clockLabel.setBounds (100, 150, 100, 100);
        // Add the label to the layered pane
        layeredPane.add (clockLabel, Integer.valueOf (1));

        // Create an array of colors for the bars
        Color [] colors = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.cyan};
        // Create an array of angles for the bars
        double [] angles = {Math.PI / 6, Math.PI / 3, Math.PI / 2, 2 * Math.PI / 3, 5 * Math.PI / 6, Math.PI};
        // Create an array of JLabels for the bars
        JLabel [] barLabels = new JLabel [6];
        // Loop through the array and create each bar
        for (int i = 0; i < 6; i++) {
            // Create a new JLabel for the bar
            barLabels [i] = new JLabel ();
            // Set the background color of the label to the corresponding color
            barLabels [i].setBackground (colors [i]);
            // Set the label to be opaque
            barLabels [i].setOpaque (true);
            // Calculate the x and y coordinates of the label based on the angle
            int x = (int) (150 + 100 * Math.sin (angles [i]));
            int y = (int) (200 - 100 * Math.cos (angles [i]));
            // Set the size and position of the label
            barLabels [i].setBounds (x, y, 10, 10);
            // Add the label to the layered pane
            layeredPane.add (barLabels [i], Integer.valueOf (2));
        }

        // Make the JFrame visible
        setVisible (true);
    }

    public static void main (String [] args) {
        // Create a new instance of the DigitalWatch class
        new DigitalWatch ();
    }
}