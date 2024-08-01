import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 420;//width in pixels
        int boardHeight = 640;//height in pixels

        JFrame frame = new JFrame("Flappy Bird");
        //frame.setVisible(true);//visiblity
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);//place the window at the center of the screen
        frame.setResizable(false);//cannot resize the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close on clicking x

        Flappybird flappybird = new Flappybird();
        frame.add(flappybird);
        frame.pack();//used to exclude the title bar from measurement
        flappybird.requestFocus();
        frame.setVisible(true);//visiblity

    }
}
