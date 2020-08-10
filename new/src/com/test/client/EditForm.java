package com.test.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JYearChooser;

import com.toedter.calendar.JMonthChooser;
import com.test.db.DB;
import com.test.model.Employee;
import com.test.service.EmployeeService;
import com.test.service.EmployeeServiceImp;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EditForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JTextField fNameTxt;
	private JTextField lNameTxt;
	private JRadioButton mRbtn;
	private JRadioButton fmRbtn;
	private JTextField cName;
	private JTextField poName;
	private JTextField phoName;
	private JTextField emName;
	private JTextField Slry;
	private JTextField counName;
	private JTextField ctName;
	private JComboBox stCombo;
	private JDateChooser dateDOB;
	private JDateChooser dateJoin;
	private JButton addbtn;
	private int eid = 0;

	 

	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditForm frame = new EditForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EditForm() {
		setTitle("Employee Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getLblNewLabel_8());
		contentPane.add(getLblNewLabel_9());
		contentPane.add(getLblNewLabel_10());
		contentPane.add(getLblNewLabel_11());
		contentPane.add(getLblNewLabel_12());
		contentPane.add(getFNameTxt());
		contentPane.add(getLNameTxt());
		contentPane.add(getMRbtn());
		contentPane.add(getFmRbtn());
		contentPane.add(getCName());
		contentPane.add(getPoName());
		contentPane.add(getPhoName());
		contentPane.add(getEmName());
		contentPane.add(getSlry());
		contentPane.add(getCounName());
		contentPane.add(getCtName());
		contentPane.add(getStCombo());
		contentPane.add(getDateDOB());
		contentPane.add(getDateJoin());
		contentPane.add(getAddbtn());

	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("First Name");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel.setBounds(29, 22, 83, 35);
		}
		return lblNewLabel;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Last Name");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_1.setBounds(29, 68, 83, 26);
		}
		return lblNewLabel_1;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Date of Birth");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_2.setBounds(29, 115, 95, 35);
		}
		return lblNewLabel_2;
	}

	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Joining Date");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_3.setBounds(29, 156, 83, 35);
		}
		return lblNewLabel_3;
	}

	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Gender");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_4.setBounds(29, 190, 69, 26);
		}
		return lblNewLabel_4;
	}

	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Company");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_5.setBounds(29, 226, 69, 26);
		}
		return lblNewLabel_5;
	}

	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Post");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_6.setBounds(29, 262, 45, 28);
		}
		return lblNewLabel_6;
	}

	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("Phone");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_7.setBounds(29, 300, 69, 36);
		}
		return lblNewLabel_7;
	}

	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("Email");
			lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_8.setBounds(29, 342, 55, 26);
		}
		return lblNewLabel_8;
	}

	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("Salary");
			lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_9.setBounds(29, 377, 55, 26);
		}
		return lblNewLabel_9;
	}

	private JLabel getLblNewLabel_10() {
		if (lblNewLabel_10 == null) {
			lblNewLabel_10 = new JLabel("Country");
			lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_10.setBounds(29, 413, 69, 26);
		}
		return lblNewLabel_10;
	}

	private JLabel getLblNewLabel_11() {
		if (lblNewLabel_11 == null) {
			lblNewLabel_11 = new JLabel("City");
			lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_11.setBounds(29, 449, 45, 35);
		}
		return lblNewLabel_11;
	}

	private JLabel getLblNewLabel_12() {
		if (lblNewLabel_12 == null) {
			lblNewLabel_12 = new JLabel("State");
			lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_12.setBounds(29, 494, 55, 26);
		}
		return lblNewLabel_12;
	}

	private JTextField getFNameTxt() {
		if (fNameTxt == null) {
			fNameTxt = new JTextField();
			fNameTxt.setBounds(122, 22, 181, 29);
			fNameTxt.setColumns(10);
		}
		return fNameTxt;
	}

	private JTextField getLNameTxt() {
		if (lNameTxt == null) {
			lNameTxt = new JTextField();
			lNameTxt.setBounds(122, 68, 181, 25);
			lNameTxt.setColumns(10);
		}
		return lNameTxt;
	}

	private JRadioButton getMRbtn() {
		if (mRbtn == null) {
			mRbtn = new JRadioButton("Male");
			buttonGroup.add(mRbtn);
			mRbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
			mRbtn.setBounds(130, 195, 75, 21);
		}
		return mRbtn;
	}

	private JRadioButton getFmRbtn() {
		if (fmRbtn == null) {
			fmRbtn = new JRadioButton("Female");
			buttonGroup.add(fmRbtn);
			fmRbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
			fmRbtn.setBounds(215, 195, 103, 21);
		}
		return fmRbtn;
	}

	private JTextField getCName() {
		if (cName == null) {
			cName = new JTextField();
			cName.setBounds(122, 226, 181, 25);
			cName.setColumns(10);
		}
		return cName;
	}

	private JTextField getPoName() {
		if (poName == null) {
			poName = new JTextField();
			poName.setBounds(122, 262, 181, 26);
			poName.setColumns(10);
		}
		return poName;
	}

	private JTextField getPhoName() {
		if (phoName == null) {
			phoName = new JTextField();
			phoName.setBounds(122, 300, 181, 30);
			phoName.setColumns(10);
		}
		return phoName;
	}

	private JTextField getEmName() {
		if (emName == null) {
			emName = new JTextField();
			emName.setFont(new Font("Tahoma", Font.PLAIN, 10));
			emName.setBounds(122, 342, 181, 25);
			emName.setColumns(10);
		}
		return emName;
	}

	private JTextField getSlry() {
		if (Slry == null) {
			Slry = new JTextField();
			Slry.setBounds(122, 377, 181, 25);
			Slry.setColumns(10);
		}
		return Slry;
	}

	private JTextField getCounName() {
		if (counName == null) {
			counName = new JTextField();
			counName.setBounds(122, 413, 181, 25);
			counName.setColumns(10);
		}
		return counName;
	}

	private JTextField getCtName() {
		if (ctName == null) {
			ctName = new JTextField();
			ctName.setBounds(122, 449, 181, 29);
			ctName.setColumns(10);
		}
		return ctName;
	}

	private JComboBox getStCombo() {
		if (stCombo == null) {
			stCombo = new JComboBox();
			stCombo.setFont(new Font("Tahoma", Font.PLAIN, 15));
			stCombo.setModel(new DefaultComboBoxModel(new String[] { "=====select=====", "State-1", "State-2",
					"State-3", "State-4", "State-5", "State-6", "State-7" }));
			stCombo.setBounds(122, 499, 181, 21);
		}
		return stCombo;
	}

	private JDateChooser getDateDOB() {
		if (dateDOB == null) {
			dateDOB = new JDateChooser();
			dateDOB.setBounds(122, 115, 181, 26);
		}
		return dateDOB;
	}

	private JDateChooser getDateJoin() {
		if (dateJoin == null) {
			dateJoin = new JDateChooser();
			dateJoin.setBounds(122, 165, 181, 26);
		}
		return dateJoin;
	}

	private JButton getAddbtn() {
		if (addbtn == null) {
			addbtn = new JButton("Update");
			addbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Employee emp = new Employee();
					emp.setID(eid);
					emp.setFname(fNameTxt.getText());
					emp.setLname(lNameTxt.getText());
					emp.setCity(ctName.getText());
					emp.setCompany(cName.getText());
					emp.setCountry(counName.getText());
					emp.setDob(new Date(dateDOB.getDate().getTime()));
					emp.setJoiningDate(new Date(dateJoin.getDate().getTime()));
					emp.setEmail(emName.getText());
					emp.setPhone(phoName.getText());
					if (mRbtn.isSelected()) {
						emp.setGender("Male");
					} else {
						emp.setGender("Female");
					}
					emp.setState(stCombo.getSelectedItem().toString());
					emp.setSalary(Integer.parseInt(Slry.getText()));
					emp.setPost(poName.getText());
					EmployeeService es = new EmployeeServiceImp();
					if (es.updateEmp(emp)) {
						JOptionPane.showMessageDialog(null, "update Succsess");
						new EmployeeForm().setVisible(true);
						dispose();

					}
				}
			});
			addbtn.setBounds(355, 465, 103, 26);
		}
		return addbtn;
	}

	public void setdata(int id) {
		
		eid = id;
		EmployeeService emp = new EmployeeServiceImp();
		Employee e = emp.getById(id);

		fNameTxt.setText(e.getFname());
		lNameTxt.setText(e.getLname());

		dateDOB.setDate(e.getDob());
		dateJoin.setDate(e.getJoiningDate());
		counName.setText(e.getCountry());
		cName.setText(e.getCompany());
		ctName.setText(e.getCity());
		phoName.setText(e.getPhone());
		poName.setText(e.getPost());
		Slry.setText(String.valueOf(e.getSalary()));
		stCombo.setSelectedItem(e.getState());

		if (e.getGender().equalsIgnoreCase("male")) {
			mRbtn.setSelected(true);
		} else {
			fmRbtn.setSelected(true);
		}

		

		if (emp.updateEmp(e)){
			JOptionPane.showMessageDialog(null, "update success");
			new EmployeeForm().setVisible(true);

		}
	}
}