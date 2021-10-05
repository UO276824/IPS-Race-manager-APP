package ipsTeamwork.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font;

public class MainWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3073912408195015551L;
	private JPanel contentPane;
	private JPanel pnInicio;
	private JButton btnAtleta;
	private JButton btnOrganiz;
	private JLabel lbImagen;
	private JPanel pnAtleta;
	private JPanel pnOrganizador;
	private JButton btnRegistro;
	private JButton btnListaCarreras;
	private JButton btnMisCarreras;
	private JPanel pn1;
	private JPanel pn14473;
	private JPanel pn1North;
	private JButton btnIngresar;
	private JButton btnRegistrarse;
	private JPanel pn1South;
	private JButton btnCancel;

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setResizable(false);
		setTitle("App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		contentPane.add(getPnInicio(), "panel_inicio");
		contentPane.add(getPnAtleta(), "panel_atleta");
		contentPane.add(getPnOrganizador(), "panel_organizador");
		contentPane.add(getPn1(), "panel_lista");
	}

	private JPanel getPnInicio() {
		if (pnInicio == null) {
			pnInicio = new JPanel();
			pnInicio.setLayout(null);
			pnInicio.add(getBtnAtleta());
			pnInicio.add(getBtnOrganiz());
			pnInicio.add(getLbImagen());
			pnInicio.add(getBtnRegistro());
		}
		return pnInicio;
	}

	private JButton getBtnAtleta() {
		if (btnAtleta == null) {
			btnAtleta = new JButton("Soy atleta");
			btnAtleta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					showCard("panel_atleta");
				}
			});
			btnAtleta.setBounds(236, 194, 111, 23);
		}
		return btnAtleta;
	}

	private JButton getBtnOrganiz() {
		if (btnOrganiz == null) {
			btnOrganiz = new JButton("Soy organizador");
			btnOrganiz.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					showCard("panel_organizador");
				}
			});
			btnOrganiz.setBounds(236, 230, 111, 23);
		}
		return btnOrganiz;
	}

	private JLabel getLbImagen() {
		if (lbImagen == null) {
			lbImagen = new JLabel("lbImagen");
			lbImagen.setIcon(new ImageIcon(MainWindow.class.getResource("/main/resources/icon/icon.png")));
			lbImagen.setBounds(111, 40, 361, 140);
		}
		return lbImagen;
	}

	private JPanel getPnAtleta() {
		if (pnAtleta == null) {
			pnAtleta = new JPanel();
			pnAtleta.setLayout(null);
			pnAtleta.add(getBtnListaCarreras());
			pnAtleta.add(getBtnMisCarreras());
		}
		return pnAtleta;
	}

	private JPanel getPnOrganizador() {
		if (pnOrganizador == null) {
			pnOrganizador = new JPanel();
		}
		return pnOrganizador;
	}

	private JButton getBtnRegistro() {
		if (btnRegistro == null) {
			btnRegistro = new JButton("Registrarme");
			btnRegistro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					showCard("panel_registro");
				}
			});
			btnRegistro.setBounds(236, 264, 111, 23);
		}
		return btnRegistro;
	}

	private JButton getBtnListaCarreras() {
		if (btnListaCarreras == null) {
			btnListaCarreras = new JButton("Lista de competiciones");
			btnListaCarreras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					showCard("panel_lista");
				}
			});
			btnListaCarreras.setBounds(222, 205, 139, 23);
		}
		return btnListaCarreras;
	}

	private JButton getBtnMisCarreras() {
		if (btnMisCarreras == null) {
			btnMisCarreras = new JButton("Mis carreras");
			btnMisCarreras.setBounds(222, 239, 139, 23);
		}
		return btnMisCarreras;
	}

	private void showCard(String name) {
		CardLayout c1 = (CardLayout) contentPane.getLayout();
		c1.show(contentPane, name);
	}
	
	private JPanel getPn1() {
		if (pn1 == null) {
			pn1 = new JPanel();
			pn1.setLayout(new BorderLayout(0, 0));
			pn1.add(getPn14473(), BorderLayout.CENTER);
			pn1.add(getPn1North(), BorderLayout.NORTH);
			pn1.add(getPn1South(), BorderLayout.SOUTH);
		}
		return pn1;
	}
	
	private JPanel getPn14473() {
		if (pn14473 == null) {
			pn14473 = new JPanel();
			pn14473.setBackground(Color.DARK_GRAY);
			pn14473.setLayout(new GridLayout(1, 0, 0, 0));
		}
		return pn14473;
	}
	private JPanel getPn1North() {
		if (pn1North == null) {
			pn1North = new JPanel();
			pn1North.setBackground(Color.LIGHT_GRAY);
			pn1North.add(getBtnIngresar());
			pn1North.add(getBtnRegistrarse());
		}
		return pn1North;
	}
	private JButton getBtnIngresar() {
		if (btnIngresar == null) {
			btnIngresar = new JButton("Ingresar");
			btnIngresar.setFont(new Font("Arial", Font.PLAIN, 14));
		}
		return btnIngresar;
	}
	private JButton getBtnRegistrarse() {
		if (btnRegistrarse == null) {
			btnRegistrarse = new JButton("Registrarse");
			btnRegistrarse.setFont(new Font("Arial", Font.PLAIN, 14));
		}
		return btnRegistrarse;
	}
	private JPanel getPn1South() {
		if (pn1South == null) {
			pn1South = new JPanel();
			pn1South.setBackground(Color.LIGHT_GRAY);
			pn1South.add(getBtnCancel());
		}
		return pn1South;
	}
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("Cancelar");
			btnCancel.setForeground(Color.RED);
			btnCancel.setFont(new Font("Arial", Font.PLAIN, 14));
		}
		return btnCancel;
	}
}
