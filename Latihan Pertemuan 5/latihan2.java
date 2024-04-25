/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarku;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Tyas
 */
public class latihan2 extends JFrame implements ActionListener {
    
    private static final int FRAME_WIDTH=300;
    private static final int FRAME_HEIGHT=250;
    private static final int FRAME_X_ORIGIN=150;
    private static final int FRAME_Y_ORIGIN=250;
    private static final String EMPTY_STRING="";
    private static final String NEWLINE= System.getProperty("line.separator");
    private JButton clearbutton;
    private JButton addbutton;
    private JTextField inputline;
    private JTextArea textArea;
    
    public static void main(String[]args){
        latihan2 frame = new latihan2();
        frame.setVisible(true);
    }
     public latihan2(){
     setSize(FRAME_WIDTH,FRAME_HEIGHT);
     setResizable(false);
     setTitle("Program Latihan2");
     setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
     setDefaultCloseOperation(EXIT_ON_CLOSE);

     Container contentPane=getContentPane();
     contentPane.setLayout(new FlowLayout());

     textArea=new JTextArea();
     textArea.setColumns(22);
     textArea.setRows(8);
     textArea.setBorder(BorderFactory.createLineBorder(Color.RED));
     textArea.setEditable(false);
     contentPane.add(textArea);

      inputline = new JTextField();
      inputline.setColumns(22);
      contentPane.add(inputline);
      inputline.addActionListener(this);

      addbutton = new JButton("ADD");
      contentPane.add(addbutton);
      addbutton.addActionListener(this);

      clearbutton = new JButton("CLEAR");
      contentPane.add(clearbutton);
//membuat action litener untuk kedua button
     clearbutton.addActionListener(this);
     addbutton.addActionListener(this);
//tutup form saat [x] diklik
     setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent event) {
        if (event.getSource() instanceof JButton) {
            JButton clickedButton = (JButton) event.getSource();
            if (clickedButton == addbutton) {
                addText(inputline.getText());
        } else {
            clearText();
            }
        } else {
            addText(inputline.getText());
        }
    }
    
     private void addText(String newline) {
        textArea.append(newline + NEWLINE);
        inputline.setText("");
    }

    private void clearText() {
        textArea.setText(EMPTY_STRING);
        inputline.setText(EMPTY_STRING);
    }
}

