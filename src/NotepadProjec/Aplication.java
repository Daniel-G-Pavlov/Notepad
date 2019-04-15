package NotepadProjec;

import javax.swing.*;
import java.awt.*;

public class Aplication extends JFrame implements FontVariable{

    public JFrame frame = new JFrame();
    public JPanel panel = new JPanel();

    public Font getFont() {
        return font;
    }
    public String getFileName() {
        return fileName;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame( JFrame frame ) {
        this.frame = frame;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel( JPanel panel ) {
        this.panel = panel;
    }

    public Aplication( JFrame frame, JPanel panel ) {
        this.frame = frame;
        this.panel = panel;
    }

    public boolean isDontSaveCommand() {
        return dontSaveCommand;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }


    public Aplication(){

        MainFrame mainFrame = new MainFrame();

    }
}
