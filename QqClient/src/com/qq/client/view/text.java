/**
 * �ı���༭
 * �޸��ˣ�tkx
 * ��һ���޸�ʱ�䣺3-17
 */

package com.qq.client.view;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.JFrame;

public class text extends JFrame{
	private static final long serialVersionUID = 1L;
	TextField tf;
	TextArea ta;
	public void init()
	{
		tf = new TextField(50);
		ta = new TextArea(5,50);
		add(tf);
		add(ta);
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
	

	
}
