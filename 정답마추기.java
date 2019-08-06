package 조건문;

import java.awt.Font;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 정답마추기 {

	
	
	static int count = 0;                   
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부품 복사
		Random r = new Random();
		// 맞추어야할 값 생성
		int num1 = r.nextInt(100);

		JFrame f = new JFrame();
		f.getContentPane();
		f.setTitle("맞추어야 하는 정답");
		f.setSize(500, 500);

		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);

		JLabel t1 = new JLabel("값 입력"); // 값 입력
		t1.setFont(new Font("굴림", Font.PLAIN, 40));
		JLabel t2 = new JLabel("결과값 나오는 위치"); // 결과값
		t2.setFont(new Font("굴림", Font.PLAIN, 46));

		JLabel t3 = new JLabel("작은값");
		JLabel t4 = new JLabel("틀린 횟수 ");
		t4.setFont(new Font("굴림", Font.PLAIN, 46));
		t3.setFont(new Font("굴림", Font.PLAIN, 44));

		f.getContentPane().add(t1);
		JTextField input = new JTextField(10);
		input.setFont(new Font("굴림", Font.PLAIN, 46));
		f.getContentPane().add(input);

		JButton answer = new JButton("나를 눌러주세요.");
		answer.setForeground(Color.RED);
		f.getContentPane().add(answer);
		f.getContentPane().add(t2);
		f.getContentPane().add(t3);
		f.getContentPane().add(t4);
		JLabel img = new JLabel(".");
		f.getContentPane().add(img);

		answer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = input.getText();
				int data2 = Integer.parseInt(data);
				count ++;
				
				if (data2 == num1) {
					t2.setText("정답입니다.");
					ImageIcon icon = new ImageIcon("success.jpg");
					img.setIcon(icon); 
					t4.setText(count + "드디어 맞추셨내요.");
					
					

				} else {
					t2.setText("정답이 아닙니다.");
					ImageIcon icon = new ImageIcon("failure.jpg");
					img.setIcon(icon);

					if (data2 > num1) {
						t3.setText("큰값입니다");
					} else {
						t3.setText("작은값입니다");
						
				

						// 정답보다 답 큰값이 입력된 경우
					}

				}

			}
		});
		answer.setFont(new Font("굴림", Font.PLAIN, 52));

		System.out.println(num1);
		f.setVisible(true);
	}

}
