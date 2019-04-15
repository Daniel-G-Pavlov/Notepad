package NotepadProjec;

import javax.swing.*;
import java.awt.*;

public interface FontVariable  {

    public String fontName = null;
    public int fontSize = 12;
    public Font font = new Font(fontName, java.awt.Font.BOLD,fontSize);
    public String fileName = "Untitled";
    public JTextArea textArea = new JTextArea();
    public JScrollPane scrollPane = new JScrollPane(textArea);
    public boolean dontSaveCommand = true;

    public static void FontVariable(){




    }

}
