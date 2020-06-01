/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import static javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Ahmed
 */
public class NewClass extends JFrame implements ActionListener{
     JLabel Demand, Frequency,ten,average,expected,txt_day;
    JTextField Demand1,Demand2,Demand3,Demand4,Demand5,Demand6,txt_day1,
               Frequency1,Frequency2,Frequency3,Frequency4,Frequency5,Frequency6
               ,averagenum,expecteddaily;
           
    JButton ok;
    JTable table,table2;
    JTable table1;
    JScrollPane jsp1,jsp2;
    String header[] = {"Daily Demand","Frequency ","PROBABILTY", "CUMULATIVE PROBABILTY", "INTERVAL OF RANDOM NUMBERS"};
    String[][] arr=new String[100][5];
    
    String header1[] = {"Day", "RANDOM NUMBER", "SIMULATED DAILY DEMAND"};
    String[][] arr1=new String[100][3];
    int num_od_days;
      JOptionPane jop;
    private Component frame;
        

     public void show_first_screen() {
              
        Demand = new JLabel("Demand");
        Demand.setBackground(Color.yellow);
        Frequency = new JLabel("Frequency (Days)");
        txt_day = new JLabel("Num of Days");

        ok=new JButton("OK");
        Demand.setBounds(90, 20, 100, 40);
        Frequency.setBounds(220, 20, 100, 40);
        txt_day.setBounds(380, 20, 100, 40);

        ten=new JLabel("num-day Simulation of Demand for Radial Tires");
        average=new JLabel("average daily demand for tires = ");
        expected=new JLabel("Expected daily demand = ");
        Demand1 = new JTextField();
        Demand2 = new JTextField();
        Demand3 = new JTextField();
        Demand4 = new JTextField();
        Demand5 = new JTextField();
        Demand6 = new JTextField();
        txt_day1=new JTextField();
       
        Frequency1 = new JTextField();
        Frequency2 = new JTextField();
        Frequency3 = new JTextField();
        Frequency4 = new JTextField();
        Frequency5 = new JTextField();
        Frequency6 = new JTextField();
        averagenum = new JTextField();
        expecteddaily = new JTextField();
       
        Demand1.setBounds(60, 80, 100, 25);
        txt_day1.setBounds(365, 78, 100, 25);
        Demand2.setBounds(60, 120, 100, 25);
        Demand3.setBounds(60, 160, 100, 25);
        Demand4.setBounds(60, 200, 100, 25);
        Demand5.setBounds(60, 240, 100, 25);
        Demand6.setBounds(60, 280, 100, 25);

        Frequency1.setBounds(220, 80, 100, 25);
        Frequency2.setBounds(220, 120, 100, 25);
        Frequency3.setBounds(220, 160, 100, 25);
        Frequency4.setBounds(220, 200, 100, 25);
        Frequency5.setBounds(220, 240, 100, 25);
        Frequency6.setBounds(220, 280, 100, 25);
        
        
        ok.setBounds(130, 340, 100, 25);
        ok.addActionListener(this);
        
        ten.setBounds(50, 400,350, 25);
        ten.setFont(new Font(TOOL_TIP_TEXT_KEY, Font.BOLD, 15));
        average.setBounds(450, 450,350, 25);
        average.setFont(new Font(TOOL_TIP_TEXT_KEY, Font.BOLD, 13));
        averagenum.setBounds(660, 450,100, 25);
        
         expected.setBounds(450, 500,350, 25);
        expected.setFont(new Font(TOOL_TIP_TEXT_KEY, Font.BOLD, 13));
        expecteddaily.setBounds(660, 500,100, 25);
      
        setTitle("Monte Carlo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
         setBackground(Color.RED);
                setSize(1200, 1000);
        setLayout(null);
         add(Demand);
         add(Frequency);
         add(txt_day);
         add(Demand1);
         add(Demand2);
         add(Demand3);
         add(Demand4);
         add(Demand5);
         add(Demand6);
         add(txt_day1);
         
         add(Frequency1);
         add(Frequency2);
         add(Frequency3);
         add(Frequency4);
         add(Frequency5);
         add(Frequency6);
        
         add(ok);
         add(ten);
         add(average);
         add(averagenum);
         add(expected);
         add(expecteddaily);
        table1 = new JTable(arr, header);
        jsp1 = new JScrollPane(table1);
        jsp1.setBounds(510, 20, 650, 330);
        add(jsp1);
        
        table2 = new JTable(arr1, header1);
        jsp2 = new JScrollPane(table2);
        jsp2.setBounds(20, 450, 400, 450);
        add(jsp2);
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ok){
            if (Demand1.getText().isEmpty()&&Demand2.getText().isEmpty()&&Demand3.getText().isEmpty()
                    &&Demand4.getText().isEmpty()&&Demand5.getText().isEmpty()
                    &&Demand6.getText().isEmpty()&&Frequency1.getText().isEmpty()
                    &&Frequency2.getText().isEmpty()&&Frequency3.getText().isEmpty()
                    &&Frequency4.getText().isEmpty()&&Frequency5.getText().isEmpty()
                    &&Frequency6.getText().isEmpty()
                    ) {
                      jop.showMessageDialog(frame, "Enter items !!");
                  }
            else if (txt_day1.getText().isEmpty()) {
                   jop.showMessageDialog(frame, "Enter items !!");
            }
            
            else{
            arr[0][0] = (Demand1.getText());
            arr[1][0] = (Demand2.getText());
            arr[2][0] =(Demand3.getText());
            arr[3][0] = (Demand4.getText());
            arr[4][0] = (Demand5.getText());
            arr[5][0] = (Demand6.getText());
            
            arr[0][1] = (Frequency1.getText());
            arr[1][1] = (Frequency2.getText());
            arr[2][1] =(Frequency3.getText());
            arr[3][1] = (Frequency4.getText());
            arr[4][1] = (Frequency5.getText());
            arr[5][1] = (Frequency6.getText());
            num_od_days=Integer.parseInt(txt_day1.getText()+"");
            ten.setText(num_od_days+"-day Simulation of Demand for Radial Tires");

            float sum=(float) 0;
            for(int i=0;i<=5;i++){
                 sum += Float.parseFloat(arr[i][1]);
            }
            //pro
            for (int i = 0; i <= 5; i++) {
             arr[i][2] = ((Float.parseFloat(arr[i][1]))/sum)+"";
            }
            // cumulative pro
            arr[0][3] = Float.parseFloat(arr[0][2])+"";
            for(int i=0;i<=4;i++){
              float num = (Float.parseFloat(arr[i][3]+""))+
                          (Float.parseFloat(arr[i+1][2]+""));
              arr[i+1][3]=num+"";
            }
            // interval
            arr[0][4] = 1 +" to "+(Float.parseFloat(arr[0][2])*100)+"";
            for (int i = 0; i <=4; i++) {
             arr[i+1][4] =(Float.parseFloat(arr[i][3])*100+1) +" to "+
                           (Float.parseFloat(arr[i+1][3])*100);
   
            }
        table1 = new JTable(arr, header);
        jsp1 = new JScrollPane(table1);
        jsp1.setBounds(510, 20, 650, 330);
        add(jsp1);
        
        // Random number
        
        Random r=new Random();
        int sum_ave=0;
               // Random number in table 2
            for (int i = 0; i < num_od_days; i++) {
                arr1[i][0]=(i+1)+"";
                arr1[i][1]=r.nextInt(100)+"";
                sum_ave++;
            } 
         table2 = new JTable(arr1, header1);
        jsp2 = new JScrollPane(table2);
        jsp2.setBounds(20, 450, 400, 450);
        add(jsp2);
            for (int i = 0; i < num_od_days; i++) {
                for (int j = 1; j <= 5; j++) {
                    if (Float.parseFloat(arr1[i][1]+"") < (Float.parseFloat(arr[j][3]+"")*100)) {
                        if (Float.parseFloat(arr1[i][1]+"") >(Float.parseFloat(arr[j-1][3]+"")*100)) {
                            //Simulated daily demand in table 2
                           arr1[i][2]=arr[j][0];
                        }
                    }
                }
            }
            //average random number
            float ave = 0;
            for (int i = 0; i < num_od_days; i++) {
                ave+=Float.parseFloat(arr1[i][2]+"");
            } 
            averagenum.setText((ave/sum_ave)+"");
                float expexteddailydemaand = 0;
             //expexteddailydemaand
              for (int i = 0; i < 6; i++) {
                expexteddailydemaand+=(Float.parseFloat(arr[i][0]+"")*Float.parseFloat(arr[i][2]+""));
            } 
              expecteddaily.setText(expexteddailydemaand+"");
        table2 = new JTable(arr1, header1);
        jsp2 = new JScrollPane(table2);
        jsp2.setBounds(20, 450, 400, 450);
        add(jsp2);
    }
    }
       
            
    }
    
    }

   

