/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mynewhome;
import java.awt.BorderLayout;
import javax.swing.*;    
import java.awt.event.*; 
public class MyNewHome extends JFrame {
private JPanel housePanel;
private JPanel bedroomPanel;
private JPanel garagePanel;
private JPanel pricePanel;
private JLabel messageLabel;
private JRadioButton aspen;
private JRadioButton brittany;
private JRadioButton colonial;
private JRadioButton dartmoor;
private JRadioButton twoBedrooms;
private JRadioButton threeBedrooms;
private JRadioButton fourBedrooms;
private JRadioButton noGarage;
private JRadioButton oneGarage;
private JRadioButton twoGarage;
private JRadioButton threeGarage;
int housePrice=0;
int garagePrice =0;
int bedroomPrice=0;
int totalPrice=0;
private JTextField price;



public MyNewHome(){
    setTitle("New Home Calculator");
    setSize(800, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    buildHousePanel();
    add(housePanel, BorderLayout.NORTH);
    setVisible(true);
    buildBedroomPanel();
    add(bedroomPanel, BorderLayout.EAST);
    setVisible(true);
    buildGaragePanel();
    add(garagePanel, BorderLayout.WEST);
    setVisible(true);
    buildPricePanel();
    add(pricePanel, BorderLayout.SOUTH);
    setVisible(true);
}
private void buildHousePanel(){
housePanel = new JPanel();
aspen = new JRadioButton("Aspen");
brittany = new JRadioButton("Brittany");
colonial = new JRadioButton("Colonial");
dartmoor = new JRadioButton("Dartmoor");
ButtonGroup house = new ButtonGroup();
house.add(aspen);
house.add(brittany);
house.add(colonial);
house.add(dartmoor);
housePanel.add(aspen);
housePanel.add(brittany);
housePanel.add(colonial);
housePanel.add(dartmoor);
aspen.addActionListener(new ButtonListener());
brittany.addActionListener(new ButtonListener());
colonial.addActionListener(new ButtonListener());
dartmoor.addActionListener(new ButtonListener());
if (aspen.isSelected()){
    int housePrice = 100000;
    price.setText("$"+totalPriceCalc(housePrice, garagePrice, bedroomPrice));
    
}
}
private void buildBedroomPanel(){
bedroomPanel = new JPanel();
twoBedrooms = new JRadioButton("Two Bedrooms");
threeBedrooms = new JRadioButton("Three Bedrooms");
fourBedrooms = new JRadioButton("Four Bedrooms");
ButtonGroup bedrooms = new ButtonGroup();
bedrooms.add(twoBedrooms);
bedrooms.add(threeBedrooms);
bedrooms.add(fourBedrooms);
bedroomPanel.add(twoBedrooms);
bedroomPanel.add(threeBedrooms);
bedroomPanel.add(fourBedrooms);
twoBedrooms.addActionListener(new ButtonListener());
threeBedrooms.addActionListener(new ButtonListener());
fourBedrooms.addActionListener(new ButtonListener());

}
private void buildGaragePanel(){
garagePanel = new JPanel();
noGarage = new JRadioButton("No Garage");
oneGarage = new JRadioButton("1 Car");
twoGarage = new JRadioButton("2 Car");
threeGarage = new JRadioButton("3 Car");
ButtonGroup garage = new ButtonGroup();
garage.add(noGarage);
garage.add(oneGarage);
garage.add(twoGarage);
garage.add(threeGarage);
garagePanel.add(noGarage);
garagePanel.add(oneGarage);
garagePanel.add(twoGarage);
garagePanel.add(threeGarage);
noGarage.addActionListener(new ButtonListener());
oneGarage.addActionListener(new ButtonListener());
twoGarage.addActionListener(new ButtonListener());
threeGarage.addActionListener(new ButtonListener());
}
private void buildPricePanel(){
pricePanel = new JPanel();
price = new JTextField(25);
price.setEditable(false);
pricePanel.add(price);
}
    

    public static void main(String[] args) {

new MyNewHome();

    }
   
   public int totalPriceCalc(int housePrice, int garagePrice, int bedroomPrice){
       totalPrice = housePrice+garagePrice+bedroomPrice;
       return totalPrice;
   }
   private class ButtonListener implements ActionListener{
       @Override
       public void actionPerformed(ActionEvent e){
           if(e.getSource()== aspen){
             housePrice = 100000;
             price.setText("$"+totalPriceCalc(housePrice, garagePrice, bedroomPrice));
            
           }
           if(e.getSource()== brittany){
           housePrice = 120000;
             price.setText("$"+totalPriceCalc(housePrice, garagePrice, bedroomPrice));
       }
           if(e.getSource()== colonial){
       housePrice = 180000;
             price.setText("$"+totalPriceCalc(housePrice, garagePrice, bedroomPrice));
   }
           if(e.getSource()==dartmoor){
           housePrice = 250000;
             price.setText("$"+totalPriceCalc(housePrice, garagePrice, bedroomPrice));    
           }
           if(e.getSource()==twoBedrooms){
           bedroomPrice = 21000;
             price.setText("$"+totalPriceCalc(housePrice, garagePrice, bedroomPrice));    
           }
           if(e.getSource()==threeBedrooms){
           bedroomPrice = 31500;
             price.setText("$"+totalPriceCalc(housePrice, garagePrice, bedroomPrice));    
           }
           if(e.getSource()==fourBedrooms){
bedroomPrice = 42000;}
             price.setText("$"+totalPriceCalc(housePrice, garagePrice, bedroomPrice));
           if(e.getSource()==noGarage){
          garagePrice = 0;
             price.setText("$"+totalPriceCalc(housePrice, garagePrice, bedroomPrice));     
           }
           if(e.getSource()==oneGarage){
           garagePrice = 7775;
             price.setText("$"+totalPriceCalc(housePrice, garagePrice, bedroomPrice));    
           }
           if(e.getSource()==twoGarage){
           garagePrice = 15550;
             price.setText("$"+totalPriceCalc(housePrice, garagePrice, bedroomPrice));
           }
           if(e.getSource()==threeGarage){
           garagePrice = 23325;
             price.setText("$"+totalPriceCalc(housePrice, garagePrice, bedroomPrice));    
           }
       }
   }
}
