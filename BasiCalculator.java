package basicalculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BasiCalculator {

    public static void main(String[] args) {
    JFrame f = new JFrame();
    JButton topla,cikar,böl,carp;
    JLabel sayi1,sayi2,sonuc;
    JTextField gir1,gir2,sonucyaz;
    
    sayi1 = new JLabel("Bir Sayı Giriniz !");
    sayi1.setBounds(30, 10, 200, 30);
    gir1 = new JTextField();
    gir1.setBounds(30, 40, 200, 30);
    
    sayi2 = new JLabel("Bir Sayı Giriniz !");
    sayi2.setBounds(30, 70, 200, 30);
    gir2 = new JTextField();
    gir2.setBounds(30, 100, 200, 30);
    
    topla = new JButton();
    topla.setText("+");
    topla.setBounds(30, 150, 50, 50);
    cikar = new JButton();
    cikar.setText("-");
    cikar.setBounds(80, 150, 50, 50);
    carp = new JButton();
    carp.setText("x");
    carp.setBounds(130, 150, 50, 50);
    böl = new JButton();
    böl.setText("%");
    böl.setBounds(180, 150, 50, 50);
    
    sonuc = new JLabel("Sonuç");
    sonuc.setBounds(30, 200, 200, 30);
    sonucyaz = new JTextField();
    sonucyaz.setBounds(30, 230, 200, 30);
    sonucyaz.setEditable(false);
    
    topla.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
        double a = Integer.parseInt(gir1.getText());
        double b = Integer.parseInt(gir2.getText());
        double c = a + b;
        String toplam = String.valueOf(c);
        sonucyaz.setText(toplam);
        }});
    cikar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
        double x = Integer.parseInt(gir1.getText());
        double y = Integer.parseInt(gir2.getText());
        double z = x - y;
        String cikar = String.valueOf(z);
        sonucyaz.setText(cikar);
        }});
    carp.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
        double h = Integer.parseInt(gir1.getText());
        double i = Integer.parseInt(gir2.getText());
        double j = h * i;
        String carp = String.valueOf(j);
        sonucyaz.setText(carp);
        }});
    böl.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
        double l = Integer.parseInt(gir1.getText());
        double m = Integer.parseInt(gir2.getText());
        double n = l / m;
        String böl = String.valueOf(n);
        sonucyaz.setText(böl);
        }});
    f.add(sayi1);
    f.add(gir1);
    f.add(sayi2);
    f.add(gir2);
    f.add(topla);
    f.add(cikar);
    f.add(carp);
    f.add(böl);
    f.add(sonuc);
    f.add(sonucyaz);
    f.setSize(300,400);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
