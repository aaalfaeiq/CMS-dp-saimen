
import java.util.ArrayList;
import javax.swing.JApplet;
public class CLJApplet extends JApplet {

 private static ArrayList<ArrayList<Acquaintances>> a = new
ArrayList<>();
 private static ArrayList<Acquaintances> perF1 = new
ArrayList<>();
 private static ArrayList<Acquaintances> rel1 = new
ArrayList<>();
 private static ArrayList<Acquaintances> proF1 = new
ArrayList<>();
 private static ArrayList<Acquaintances> ca1 = new
ArrayList<>();

 @Override
 public void init() {
// MUI mg = new MUI(); //project 3 did not implement the singleton
  MUI mg = MUI.getMUI(); // this one edited to make use of the singleton
 a.add(perF1);
 a.add(rel1);
 a.add(proF1);
 a.add(ca1);
 this.add(mg.getContentPane());
 this.setSize(mg.getContentPane().getSize());
 this.setMinimumSize(mg.getContentPane().getSize());
 mg.setMg(mg);
 mg.setA(a);
 }
}
