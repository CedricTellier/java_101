package com.ui;

import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class HelloWorldClass extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JEditorPane editorPane1;

    public HelloWorldClass() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);


        editorPane1.setEditable(false);
        editorPane1.setContentType("");
        try {
            editorPane1.setPage("https://restapitellierc.herokuapp.com/");
        } catch (IOException e) {
            editorPane1.setContentType("text/html");
            editorPane1.setText("Page could not load");
        }

/*
        JFrame test = new JFrame("Google Maps");

        try {
            String imageUrl = "https://maps.googleapis.com/maps/api/js?key=AIzaSyAtBq-FMp_IW5pqFipL_yWTrLrSVPMZEdU&callback=initMap\"";
            String destinationFile = "image.jpg";
            String str = destinationFile;
            URL url = new URL(imageUrl);
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream(destinationFile);

            byte[] b = new byte[2048];
            int length;

            while ((length = is.read(b)) != -1) {
                os.write(b, 0, length);
            }

            is.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        test.add(new JLabel(new ImageIcon((new ImageIcon("image.jpg")).getImage().getScaledInstance(630, 600,
                java.awt.Image.SCALE_SMOOTH))));

        test.setVisible(true);
        test.pack();
*/
        // JScrollPane scrollPane = new JScrollPane(editorPane1);
        //getContentPane().add(scrollPane);

        pack();
        setVisible(true);
        setSize(1200, 1200);
        System.exit(0);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
}
