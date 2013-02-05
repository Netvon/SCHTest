package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class WoordenFrame extends javax.swing.JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel pnInput;
	private JPanel pnOutput;
	private JButton btConcordantie;
	private JButton btFrequentie;
	private JButton btSorteer;
	private JButton btAantal;
	private JScrollPane spInput;
	private JTextArea taOutput;
	private JTextArea taInput;
	private JScrollPane spOutput;
	
	

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				WoordenFrame inst = new WoordenFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public WoordenFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Woorden");
			getContentPane().setLayout(null);
			{
				pnInput = new JPanel();
				getContentPane().add(pnInput);
				pnInput.setLayout(null);
				pnInput.setBounds(12, 12, 368, 124);
				pnInput.setBorder(BorderFactory.createTitledBorder("Input"));
				pnInput.setLayout(null);
				{
					btAantal = new JButton();
					pnInput.add(btAantal);
					btAantal.setText("Aantal");
					btAantal.setBounds(243, 20, 114, 21);
					btAantal.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btAantalActionPerformed(evt);
						}
					});
				}
				{
					btSorteer = new JButton();
					pnInput.add(btSorteer);
					btSorteer.setText("Sorteer");
					btSorteer.setBounds(243, 44, 114, 21);
					btSorteer.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btSorteerActionPerformed(evt);
						}
					});
				}
				{
					btFrequentie = new JButton();
					pnInput.add(btFrequentie);
					btFrequentie.setText("Frequentie");
					btFrequentie.setBounds(243, 68, 114, 21);
					btFrequentie.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btFrequentieActionPerformed(evt);
						}
					});
				}
				{
					btConcordantie = new JButton();
					pnInput.add(btConcordantie);
					btConcordantie.setText("Concordantie");
					btConcordantie.setBounds(243, 93, 114, 21);
					btConcordantie.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							btConcordantieActionPerformed(evt);
						}
					});
				}
				{
					spInput = new JScrollPane();
					pnInput.add(spInput);
					spInput.setBounds(12, 19, 219, 95);
					{
						taInput = new JTextArea();
						spInput.setViewportView(taInput);
					}
				}
			}
			{
				pnOutput = new JPanel();
				getContentPane().add(pnOutput);
				pnOutput.setBorder(BorderFactory.createTitledBorder("Output"));
				pnOutput.setBounds(11, 142, 367, 121);
				pnOutput.setLayout(null);
				{
					spOutput = new JScrollPane();
					pnOutput.add(spOutput);
					spOutput.setBounds(12, 19, 344, 89);
					{
						taOutput = new JTextArea();
						spOutput.setViewportView(taOutput);
					}
				}
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void btAantalActionPerformed(ActionEvent evt) {
		// to do
	}
	
	private void btSorteerActionPerformed(ActionEvent evt) {
		// to do
	}
	
	private void btFrequentieActionPerformed(ActionEvent evt) {
		// to do
	}
	
	private void btConcordantieActionPerformed(ActionEvent evt) {
		// to do
	}

}
