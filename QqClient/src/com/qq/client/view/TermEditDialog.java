package com.qq.client.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TermEditDialog extends  JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private JTextArea jTextArea;
    private JScrollPane jScrollPane;
    private JButton okButton;
    private JButton cancelButton;
    private JPanel jPanel;
    public String getTextContent()
    {
    	return jTextArea.getText();
    }
    public TermEditDialog()
    {
    	jTextArea=new JTextArea();
    	jScrollPane=new JScrollPane(jTextArea);
    	jPanel=new JPanel();
    	okButton=new JButton("确定");
    	cancelButton=new JButton("取消");
    	okButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		      QqChat.jtf.setText(jTextArea.getText());
		           
		         
			}
		});
    	cancelButton.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();		
			}
		});
    	setLayout(new BorderLayout());
    	jPanel.add(okButton);
    	jPanel.add(cancelButton);
    	add(jScrollPane,BorderLayout.CENTER);
    	add(jPanel,BorderLayout.SOUTH);
    	setTitle("公式编辑");
    	setSize(300, 400);
    	setLocationRelativeTo(null);
    	setVisible(true);
    }
}
