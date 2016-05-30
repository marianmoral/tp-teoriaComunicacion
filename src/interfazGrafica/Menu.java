package interfazGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JFrame{
	 public Menu() {

	        initUI();
	    }

	    private void initUI() {
	        
	        createMenuBar();

	        setTitle("Teoria de Comunicaciones");
	        setSize(300, 200);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	    }

	    private void createMenuBar() {

	        JMenuBar menubar = new JMenuBar();
	        ImageIcon icon = new ImageIcon("descarga.png");

	        JMenu file = new JMenu("Archivo");
	        file.setMnemonic(KeyEvent.VK_F);

	        JMenuItem eMenuItem = new JMenuItem("Salir", icon);
	        JMenuItem eMenuItem2 = new JMenuItem("Nuevo", icon);
	        
	        eMenuItem.setMnemonic(KeyEvent.VK_E);
	        eMenuItem.setToolTipText("Salir de la aplicacion");
	        eMenuItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent event) {
	                System.exit(0);
	            }
	        });
	        
	        eMenuItem2.setMnemonic(KeyEvent.VK_E);
	        eMenuItem2.setToolTipText("Nuevo");


	        file.add(eMenuItem2);
	        file.add(eMenuItem);
	        menubar.add(file);

	        setJMenuBar(menubar);
	    }
}
