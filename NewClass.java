//1 GYUMOLCSITAL
//93 ITAL
//164 RENDEZHETOTEA
//232 IDOATALAKITO
//400 SZGEP
//542 PONTOZHATO
//669 LAKOHAZ
//780 REALNUMBERS
//827 HATIZSAK
//865 AUTO, RENDSZAM
//1024 SZEMELY
//1162 KARACSONYIHOZZAVALOK
//1235 ZARTHELYI
//1333 PARKOLO
//1453 VIZGYUJTOK
//1548 MOLEKULA
//1642 MOZI

/* G Y U M O L C S I T A L

public interface Alkoholos {
public double mennyiAlkoholtTartalmaz();
}
***********************
public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos{
    private double alkoholTartalom;

    public ErjedtGyumolcs(double alk, String fajta, String iz) {
        super(fajta, iz);
        this.alkoholTartalom = alkoholTartalom;
    }

    public double mennyiAlkoholtTartalmaz() {
        return alkoholTartalom;
    }

    @Override
    public String toString() {
        return "ErjedtGyumolcs{" + "alkoholTartalom=" + alkoholTartalom + '}';
    }

}
**********************
public abstract class Ital {
    private String mibolKeszult;
    private String milyenizu;
}
************************
public class Gyumolcsle extends Ital{
    public Gyumolcsle(Gyumolcs gy){
        
    }
    public String mibolFacsartak(){
        return mibolKeszult();
    }

    @Override
    public String mibolKeszult() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String milyenIzu() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "Gyumolcsle" ;
    }
*******************
public class Main {
    public static Aszu[] puttony(Bor [] bor){                
        int db=0;
        Aszu[] k=new Aszu [db];                     
        int index=0;
        
        for(int i=0;i<bor.length;i++){                
            if(bor[i] instanceof Aszu) {                      
                Aszu a = (Aszu)bor[i];                         
                if(a.getPuttonySzam()== 5) {
                    db++;                                
                }
            }
        }
        
        for(int i=0;i<bor.length;i++){
            if(bor[i] instanceof Aszu) {
                Aszu a = (Aszu)bor[i];
                if(a.getPuttonySzam()==5) {
                    k[index]=a;                        
                    index++;                                
                }
            } 
        }
        return k;
    }
    
    public static void main(String[] args) {
        
        Bor [] bor=new Bor []{
            new Bor("vörös","100","félédes",4),
            new Aszu(6,"110",5),};
    
            Aszu[] t=puttony(bor);                      
            for (Aszu a : t){
                System.out.println(a);
             } }}

*/
import java.util.ArrayList;
/* I T A L
public abstract class Ital implements Comparable<Ital> {
    protected String név;
    protected String kiszerelés;
    protected int ár; 
...
@Override
    public boolean equals(Object obj) {
        if  (obj==null || !(obj instanceof Ital))
            return false;
        Ital I = (Ital)obj;
        return this.név.equals(I.getNév()) && this.kiszerelés.equals(I.getKiszerelés());
    }
    
    @Override
    public int compareTo(Ital o) {
        return Integer.compare(this.getÁr(), o.getÁr()); 
    }
    
}
**************************************
public class Dolgozat extends SzeszesItal{

    public Dolgozat(String név, String kiszerelés, int ár, int alkoholtartalom) {
        super(név, kiszerelés, ár, alkoholtartalom);
    }
    
    public static SzeszesItal[] metódus(Ital [] t){
        
        SzeszesItal[] tomb=new SzeszesItal[3]; //3 legmagasabb alc ital
        int szamol=0;

        
        for(int i=0;i<t.length;i++) {
            if(t[i] instanceof SzeszesItal) {
                SzeszesItal szi=(SzeszesItal) t[i];
                  szamol++;
            }
        }
        
        SzeszesItal [] atmeneti=new SzeszesItal [szamol];
        int index=0;
        
        for(int i=0;i<t.length;i++) {
            if(t[i] instanceof SzeszesItal) {
                SzeszesItal szi=(SzeszesItal) t[i];
                  atmeneti[index]=szi;
                  index++;
            }
        }
        for(int i=0;i<atmeneti.length-1;i++) {
            for(int j=i+1;j<atmeneti.length;j++) {
               if(atmeneti[i].getAlkoholTartalom()<atmeneti[j].getAlkoholTartalom()) {
                    SzeszesItal tmp=atmeneti[i];
                    atmeneti[i]=atmeneti[j];
                    atmeneti[j]=tmp;
               }
            }
        }   
        if(szamol<3) {
            return null;
        }
        else{
        tomb[0]=atmeneti[0];
        tomb[1]=atmeneti[1];
        tomb[2]=atmeneti[2];
       
        return tomb;
        } }}
*/
import java.util.ArrayList;
/* R E N D E Z H E T O T E A
public class Tea implements Rendezheto<Tea> {   
    public String név;   
    public int ár;   
    
    
    public Tea(String s,int j) {    
        név=s;    
        ár=j;    
    } 

    @Override
    public boolean egyenlo(Tea o) {
        if(this.ár==o.ár) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean nagyobbMint(Tea o) {
        if(this.ár>o.ár) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean kisebbMint(Tea o) {
        if(this.ár<o.ár) {
            return true;
        }
        else {
            return false;
        }} } 
***************************
public interface Rendezheto<Rendezheto> {
    
    public boolean egyenlo(Rendezheto o);   
    public boolean nagyobbMint(Rendezheto o);   
    public boolean kisebbMint(Rendezheto o); 
    
}
*************************
public class Main {
    
    public static void main(String[] args) {
        
        Tea k=new Tea("Milford",560);
        Tea l=new Tea("Saga", 255);
        
        if(k.egyenlo(l)) {
            System.out.println("egyenlő");
        }
        if(k.kisebbMint(l)){
            System.out.println("kisebb");
        }
        if(k.nagyobbMint(l)) {
            System.out.println("nagyobb");
        }      
    } 
}
*/
import java.util.ArrayList;
/* I D O A T A L A K I T O
public class IdoAtalakito extends JFrame implements ActionListener {
    
    private JButton bt;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JTextField tf5;
    private JTextField tf6;
    private JTextField tf7;
    private JTextField tf8;
    private JTextField tf9;
    private JTextField tf10;
    private JTextField tf11;
    private JTextField tf12;

    private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;
    private JLabel lb4;
    private JLabel lb5;
    private JLabel lb6;
    private JLabel lb7;
    private JLabel lb8;
    private JLabel lb9;
    private JLabel lb10;
    private JLabel lb11;
    private JLabel lb12;
    
    private JPanel aperc;
    private JPanel bperc;
    private JPanel cperc;
    private JPanel p4;
    private JPanel pe;


    public IdoAtalakito() throws HeadlessException {
        super("IdoAtalakito");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tf1 = new JTextField(6);
        tf2 = new JTextField(6);
        tf3 = new JTextField(6);
        tf4 = new JTextField(6);
        tf5 = new JTextField(6);
        tf6 = new JTextField(6);
        tf7 = new JTextField(6);
        tf8 = new JTextField(6);
        tf9 = new JTextField(6);
        tf10 = new JTextField(6);
        tf11 = new JTextField(6);
        tf12 = new JTextField(6);
        bt = new JButton("Számol");
        lb1 = new JLabel("nap");
        lb2 = new JLabel("óra");
        lb3 = new JLabel("perc");
        lb4 = new JLabel("másodperc");
        lb5 = new JLabel("nap");
        lb6 = new JLabel("óra");
        lb7 = new JLabel("perc");
        lb8 = new JLabel("másodperc");
        lb9 = new JLabel("nap");
        lb10 = new JLabel("óra");
        lb11 = new JLabel("perc");
        lb12 = new JLabel("másodperc");

        aperc = new JPanel();
        bperc = new JPanel();
        cperc = new JPanel();
        p4 = new JPanel();
        pe = new JPanel();

        GridLayout gr = new GridLayout(4, 1);
        pe.setLayout(gr);
        GridLayout gr2 = new GridLayout(1, 1);
        cperc.setLayout(gr2);

        aperc.add(tf1);
        aperc.add(lb1);
        aperc.add(tf2);
        aperc.add(lb2);
        aperc.add(tf3);
        aperc.add(lb3);
        aperc.add(tf4);
        aperc.add(lb4);
        bperc.add(tf5);
        bperc.add(lb5);
        bperc.add(tf6);
        bperc.add(lb6);
        bperc.add(tf7);
        bperc.add(lb7);
        bperc.add(tf8);
        bperc.add(lb8);
        cperc.add(bt);
        p4.add(tf9);
        p4.add(lb9);
        p4.add(tf10);
        p4.add(lb10);
        p4.add(tf11);
        p4.add(lb11);
        p4.add(tf12);
        p4.add(lb12);
        pe.add(aperc);
        pe.add(bperc);
        pe.add(cperc);
        pe.add(p4);

        this.add(pe);

        bt.addActionListener(this);
        pack();
    }

    public static void main(String[] args) {
        IdoAtalakito i = new IdoAtalakito();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt) {
            int anap = Integer.parseInt(tf1.getText());
            int aora = Integer.parseInt(tf2.getText());
            int aperc = Integer.parseInt(tf3.getText());
            int amasodperc = Integer.parseInt(tf4.getText());

            int bnap = Integer.parseInt(tf5.getText());
            int bora = Integer.parseInt(tf6.getText());
            int bperc = Integer.parseInt(tf7.getText());
            int bmasodperc = Integer.parseInt(tf8.getText());

            int cnap = 0;
            int cora = 0;
            int cperc = 0;
            int cmasodperc = 0;

            if (amasodperc + bmasodperc >= 60) {
                cmasodperc = (amasodperc + bmasodperc) %60;
                cperc = cperc + (amasodperc + bmasodperc) /60;
            } else {
                cmasodperc = amasodperc + bmasodperc;
            }
            if ((aperc + bperc + cperc) >= 60) {
                cora = cora + (aperc + bperc + cperc) /60;
                cperc = (aperc + bperc + cperc) %60;
            } else {
                cperc = aperc + bperc + cperc;
            }
            if ((aora + bora + cora) >=24) {
                cnap = cnap + (aora + bora + cora) /24;
                cora = (aora + bora + cora) %24;
                
            } else {
                cora = aora + bora + cora;
            }
            cnap = anap + bnap + cnap;

            tf12.setText("" + cmasodperc);
            tf11.setText("" + cperc);
            tf10.setText("" + cora);
            tf9.setText("" + cnap);
        }
    }

}
*/
import java.util.ArrayList;
 /* S Z G E P
public class Szgep extends JFrame implements ActionListener{
    
    private JTextField tf1;
    private JButton ures, Backspace, Ce, C;
    private JButton MC, n7, n8, n9, oszt, sqrt;
    private JButton MR, n4, n5, n6, szor, szazalek;
    private JButton MS, n1, n2, n3, kul, tort;
    private JButton Mplus, n0, plusminus, tizedes, sum, egyenlo;
    
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;
    private JPanel pe; //nagy panel
    
    public static int a;
    
    public Szgep() throws HeadlessException {
        super("szamologep");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.tf1= new JTextField(30);
        
        this.ures = new JButton("");
        this.Backspace = new JButton("Backspace");
        this.Ce = new JButton("CE");
        this.C = new JButton("C");
        this.MC = new JButton("MC");
        this.n7 = new JButton("7");
        this.n8 = new JButton("8");
        this.n9 = new JButton("9");
        this.oszt = new JButton("/");
        this.sqrt = new JButton("sqrt");
        this.MR = new JButton("MR");
        this.n4 = new JButton("4");
        this.n5 = new JButton("5");
        this.n6 = new JButton("6");
        this.szor = new JButton("*");
        this.szazalek = new JButton("%");
        this.MS = new JButton("MS");
        this.n1 = new JButton("1");
        this.n2 = new JButton("2");
        this.n3 = new JButton("3");
        this.kul = new JButton("-");
        this.tort = new JButton("1/x");
        this.Mplus = new JButton("M+");
        this.n0 = new JButton("0");
        this.plusminus = new JButton("+/-");
        this.tizedes = new JButton(".");
        this.sum = new JButton("+");
        this.egyenlo = new JButton("=");
        
        this.p1=new JPanel();
        this.p2=new JPanel();
        this.p3=new JPanel();
        this.p4=new JPanel();
        this.p5=new JPanel();
        this.p6=new JPanel();
        this.pe=new JPanel();
        
         GridLayout gr=new GridLayout(1,1);
        setLayout(gr);
        GridLayout gr1=new GridLayout(1,1);
        p1.setLayout(gr1);
        GridLayout gr2=new GridLayout(1,4);
        p2.setLayout(gr2);
        GridLayout gr3=new GridLayout(1,6);
        p3.setLayout(gr3);
        GridLayout gr4=new GridLayout(1,6);
        p4.setLayout(gr4);
        GridLayout gr5=new GridLayout(1,6);
        p5.setLayout(gr5);
        GridLayout gr6=new GridLayout(1,6);
        p6.setLayout(gr6);
        GridLayout gr7=new GridLayout(6,1);
        pe.setLayout(gr7);
        
        p1.add(tf1);
        p2.add(ures);
        p2.add(Backspace);
        p2.add(Ce);
        p2.add(C);
        p3.add(MC);
        p3.add(n7);
        p3.add(n8);
        p3.add(n9);
        p3.add(oszt);
        p3.add(sqrt);
        p4.add(MR);
        p4.add(n4);
        p4.add(n5);
        p4.add(n6);
        p4.add(szor);
        p4.add(szazalek);
        p5.add(MS);
        p5.add(n1);
        p5.add(n2);
        p5.add(n3);
        p5.add(kul);
        p5.add(tort);
        p6.add(Mplus);
        p6.add(n0);
        p6.add(plusminus);
        p6.add(tizedes);
        p6.add(sum);
        p6.add(egyenlo);
        
        pe.add(p1);
        pe.add(p2);
        pe.add(p3);
        pe.add(p4);
        pe.add(p5);
        pe.add(p6);
        
        this.add(pe);
        sum.addActionListener(this);
        egyenlo.addActionListener(this);
        super.pack();
        
        
    }
    public static void main(String[] args){
        Szgep sz=new Szgep();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    if(e.getSource() == sum) {
            a+=Integer.parseInt(tf1.getText());
        }
        if(e.getSource() == egyenlo) {
            a+=Integer.parseInt(tf1.getText());
            tf1.setText(Integer.toString(a));
        }
    }
}
*/       
import java.util.ArrayList;
/* P O N T O Z H A T Ó
public class Dolgozat implements egyetem.Pontozható<Dolgozat> {
    public int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        return "Dolgozat{" + "pontszam=" + pontszam + '}';
    }

    @Override
    public boolean megfelelt() {
        if(this.pontszam>35) {
            return true;
        }
        if(this.pontszam==-1) {
            System.out.println("Nem írt");
            return false;
            
        }
        return false;
    }
    
    
}
**********************************
import java.util.Random;
public class Hallgato {
    
 public int mennyitKészült;
   public boolean sokatTanul;

    public Hallgato(int mennyitKészült, boolean sokatTanul) {
        this.mennyitKészült = mennyitKészült;
        this.sokatTanul = sokatTanul;
    }

    public int getMennyitKészült() {
        return mennyitKészült;
    }

    public void setMennyitKészült(int mennyitKészült) {
        this.mennyitKészült = mennyitKészült;
    }

    public boolean isSokatTanul() {
        return sokatTanul;
    }

    public void setSokatTanul(boolean sokatTanul) {
        this.sokatTanul = sokatTanul;
    }
    
    
   
   public Dolgozat dolgozatotIr(){
       Random r=new Random();
       int szam;
       
       if(sokatTanul==true) {
           szam=(r.nextInt()%((7-4)+1)+4)*mennyitKészült;
           
       }
       else {
           szam=(r.nextInt()%((5-0)+1)+0)*mennyitKészült;
           
            }
       
       Dolgozat vissza=new Dolgozat(szam);
       
       if(vissza.pontszam==-1) {
           System.out.println("Nem írt");
       }
       System.out.println(szam);
       return vissza; 
   }  
}
*****************
public class Main {
    
     public static Hallgato[] h;
    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=Integer.parseInt(sc.nextLine());
        
        h=new Hallgato[n];
        
        for(int i=0;i<n;i++) {
            String sor=sc.nextLine();
            String st[]=sor.split(",");

            h[i]=new Hallgato(Integer.parseInt(st[0]),true);
            
            if(st[1].equals("igaz")) {
                h[i].sokatTanul=true;
            }
            else {
                h[i].sokatTanul=false;
            }
         }
        
        for(int i=0;i<n;i++) {
            if(h[i].dolgozatotIr().megfelelt() &&  h[i].dolgozatotIr().megfelelt()){
                System.out.println("megfelelt");
            }
            else {
                System.out.println("nem felelt meg");
            }
        }  
    }
}

*/
import java.util.ArrayList;
/* L A K O H A Z
public class Lakóház implements Comparable<Lakóház> {
    public static final double emeletMagasság= 3.2;
    private String cím;
    private int emeletSzáma;
    private double alapterület;

    public Lakóház(String cím, int emeletSzáma, double alapterület) {
        this.cím = cím;
        this.emeletSzáma = emeletSzáma;
        this.alapterület = alapterület;
    }


    public String getCím() {
        return cím;
    }

    public int getEmeletSzáma() {
        return emeletSzáma;
    }

    public double getAlapterület() {
        return alapterület;
    }
    
    
    public double légköbméter(){
        
       return this.alapterület*this.emeletSzáma*emeletMagasság; 
           
    }

    public void setAlapterület(double alapterület) {
        this.alapterület = alapterület;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.cím).append(":\n");
        sb.append(this.légköbméter());
        
        return sb.toString();
    }

    @Override
    public int compareTo(Lakóház o) {
        return Double.compare(this.légköbméter(), o.légköbméter());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.cím);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Lakóház))
            return false;
        
            Lakóház l = (Lakóház) obj;
            
            return this.cím.equals(l.getCím());
        
    }
 
}
***************************************************
public class Main {
    
    public static List<Lakóház> tágas(List<Lakóház> lh, double térfogat) {
        
        List<Lakóház> l2 = new ArrayList<>();
        for(Lakóház i:lh) 
            if(i.légköbméter()> térfogat)
                l2.add(i);
             
            return l2;   
    }
    public static void main(String[] args) {
        List<Lakóház> lh= new ArrayList(); //az arraylist osztály konstruktora hívódik meg 
        lh.add(new Lakóház("Egy 1", 12, 5.6));
        lh.add(new Lakóház("Egy 2", 15, 4.6));
        lh.add(new Lakóház("Egy 3", 3, 7.6));
        lh.add(new Lakóház("Egy 4", 2, 17.6));
       
        System.out.println(lh.get(0));
        lh.add(3,new Lakóház("Egy 11", 22, 1.6));
        
        //for (Lakóház i:lh)
            //System.out.println(i);
            
        for(int i=0; i<lh.size(); i++){
            System.out.println(lh.get(i));
        }
    lh.set(0, new Lakóház("Egy 222", 2, 4)); //alapterülethez hozzá kell adni egy settert!!!!!!! (hogy ez működjön)
    
        System.out.println(lh.get(0));
        System.out.println(lh.contains(new Lakóház("Egy 222", 2, 4)));
        System.out.println(lh.lastIndexOf(new Lakóház("Egy 222", 2, 4)));
        List<Lakóház> l3 = tágas(lh, 55);
        Collections.sort(l3);
        for(Lakóház i:l3)
            System.out.println(i);
    }
   }
*/
import java.util.ArrayList;
/* R E A L N U M B E R S
public class Test {
	public static void main(String[] args) {
		
		Sample s1 = new Sample();
		
		s1.add(1.0);
		s1.add(2.0);
	}
}

class Sample implements RealNumbers{

	private ArrayList<Double> li;
	
	@Override
	public void add(double num) {
		li.add(num);
	}

	@Override
	public double get(int idx) {
		return li.get(idx);
	}

	@Override
	public void delete(int idx) {
		li.remove(idx);
	}

	@Override
	public boolean contains(double num) {
		return li.contains(num);
	}

	@Override
	public int getFirstOccurrence(double num) {
		return li.indexOf(num);
	}

	public Sample() {
		super();
	}
	
}
*/
import java.util.ArrayList;
/* H A T I Z S A K
@Override
   public int compareTo(Hátizsák h) {
     if(this.márka.equals(h.getMárka())){
         return -1*Integer.compare(this.zsebekSzáma, h.zsebekSzáma);
         
     }
         return this.márka.compareTo(h.getMárka());
     
    }
        
}
********************
public class Test {
    public static List<Hátizsák> kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(List<Hátizsák> l) {

        Collections.sort(l);
        
        return l;
    }
    
        public static void main(String[] args) {
        
        List<Hátizsák> h=new ArrayList();
        h.add(new Hátizsák("Solognac",45,3,true) {});
        h.add(new Hátizsák("Kalenji",30,2,false) {});
        h.add(new Hátizsák("Simond",40,1,true) {});

       
        List<Hátizsák> k=kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(h);
        
        for (Hátizsák k1 : k) {
            System.out.println(k1);
        }
    }  
}
*/
import java.util.ArrayList;
/* A U T O, R E N D S Z A M

public class Autó implements Comparable<Autó>{
    
    private String rendszám;
    private int teljesítmény;
    private boolean automata;
    public static int db=0;

    public Autó(String rendszám, int teljesítmény, boolean automata) {
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
        db++;
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getTeljesítmény() {
        return teljesítmény;
    }

    public boolean isAutomata() {
        return automata;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    public void setTeljesítmény(int teljesítmény) {
        this.teljesítmény = teljesítmény;
    }

    public void setAutomata(boolean automata) {
        this.automata = automata;
    }
 
    @Override
    public String toString() {
        return "rendszám: " + rendszám + ", teljesítmény: " + teljesítmény + ", automata: " + automata;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null|| !(obj instanceof Autó)) {
            return false;
        }
        Autó a=(Autó) obj;
        return this.rendszám.equals(a.getRendszám());
        
    }

    @Override
    public int compareTo(Autó a) {
        return (-1)*Integer.compare(this.teljesítmény, a.teljesítmény);
    }
    
    public boolean szabályos() {
       if(rendszám.length()!=6) {
           return false;
       }
       else{
        for(int i=0;i<3;i++) {
                if(!Character.isAlphabetic(rendszám.charAt(i))) {
                    return false;
                }
        }
        for(int i=3;i<6;i++) {
                if(!Character.isDigit(rendszám.charAt(i))) {
                    return false;
                }
         }

     }
       return true;
    }
}
****************************************************
public class Teherautó extends Autó{
    private int teherbírás;
    public Teherautó(String rendszám, int teljesítmény, boolean automata,int teherbírás) {
        super(rendszám, teljesítmény, automata);
        this.teherbírás=teherbírás;
    }

    public int getTeherbírás() {
        return teherbírás;
    }

    public void setTeherbírás(int teherbírás) {
        this.teherbírás = teherbírás;
    }
    
    @Override
    public String toString() {
        return  "Rendszám: "+ super.getRendszám()+", Teljesítmény: "+super.getTeljesítmény()+", Autómata: "+super.isAutomata()+", Teherbírás: "+ teherbírás;
    }}
***************************************************
public class Main {
    
    public static Autó[] a;
    
    public static List<Autó> MaxTelj(List<Autó> a){
        Collections.sort(a);
        if(a.size()<3) {
            return a;
        }
        List<Autó> lista=new ArrayList<Autó>();
        if(a.size()>=3) {
          for(int i=0;i<3;i++){
            lista.add(a.get(i));
           }
          return lista;
        }
        return null;
    }
    
    public static List<Teherautó> Teherbírás(Autó [] a) {
        List<Teherautó> t=new ArrayList<>();
        for(int i=0;i<a.length;i++) {
            if(a[i] instanceof Teherautó) {
                Teherautó tt=(Teherautó) a[i];
                    if(tt.getTeherbírás()>2000){
                        t.add(tt);
                    }
            } 
        }
         return t;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        a=new Autó[4];
        for(int i=0;i<4;i++) {
            String sor=sc.nextLine();
            String st[]=sor.split(" ");
               if(i<2){
                    a[i]=new Autó(st[0],Integer.parseInt(st[1]),Boolean.parseBoolean(st[2]));
               }
                else {
                   a[i]=new Teherautó(st[0],Integer.parseInt(st[1]),Boolean.parseBoolean(st[2]),Integer.parseInt(st[3]));
               }
        }

        for (Autó n : a) {
            System.out.println(n);
        }
        List<Teherautó> out=Teherbírás(a);
        for (Teherautó b : out) {
            System.out.println(b);
        }
            System.out.println(Autó.db);
        }
    }
*/
import java.util.ArrayList;
/* S Z E M E L Y
public class Egyetem {
    public List<Hallgató>diák;
    public List<Oktató>tanár;
    public Egyetem(List<Hallgató> diák, List<Oktató> tanár) {
        this.diák = diák;
        this.tanár = tanár;
    }
    public List<Hallgató> getDiák() {
        return diák;
    }
    public void setDiák(List<Hallgató> diák) {
        this.diák = diák;
    }
    public List<Oktató> getTanár() {
        return tanár;
    }
    public void setTanár(List<Oktató> tanár) {
        this.tanár = tanár;
    }
    public void legfiatalabb(List<Hallgató> h)
    {Hallgató tmp;
        if(h.size()>3)
        {
            for(int i=0;i<h.size();++i)
            {
                for(int j=0;j<h.size();++j)
                    if(h.get(i).életkor>h.get(j).életkor)
                    {
                        tmp=h.get(i);
                        h.set(i, h.get(j));
                        h.set(j, tmp);
                    }
            }
            for(int i=0;i<3;++i)
                System.out.println(h.toString());
        }
        else System.out.println(h.toString());
    }
    public void IT(List<Oktató>okt)
    {
        for(int i=0;i<okt.size();++i)
        {
            if(okt.get(i).Tanszék.equals("IT"))
                okt.get(i).Tanszék.concat("!");
        }
    }
}
**************************************************
public class Hallgató extends Személy{
    public double atlagtulajdonsag;

    public Hallgató(double atlagtulajdonsag, String nev, int eletkor, boolean ferfi) {
        super(nev, eletkor, ferfi);
        this.atlagtulajdonsag = atlagtulajdonsag;
    }
    
    public boolean okosvagynem(Hallgató o)
    {
        if(o.atlagtulajdonsag>=4)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return "Hallgato:" +sb.append(név+""+super.toString()) ;
    }
}
*************************************************
public class Oktató extends Személy{
    public String Tanszék;

    public Oktató(String Tanszék, String nev, int eletkor, boolean ferfi) {
        super(nev, eletkor, ferfi);
        this.Tanszék = Tanszék;
    }  
}
*******************************************
public class Személy {
     protected String név; 
     protected int életkor; 
     private boolean férfi; 

    public Személy(String név, int életkor, boolean férfi) {
        this.név = név;
        this.életkor = életkor;
        this.férfi = férfi;
    }

    public String getnév() {
        return név;
    }

    public void setnév(String név) {
        this.név = név;
    }

    public int getéletkor() {
        return életkor;
    }

    public void setéletkor(int életkor) {
        this.életkor = életkor;
    }

    public boolean isférfi() {
        return férfi;
    }

    public void setférfi(boolean férfi) {
        this.férfi = férfi;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return   "Szemely:"+sb.append(név + " " + életkor + " " + férfi);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null||(obj instanceof Személy))
            return false;
        Személy sz=(Személy)obj;
        return this.életkor == sz.életkor;
    }
}
*/
import java.util.ArrayList;
/* K A R A C S O N Y I H O Z Z A V A L O K
public class Hozzavalo implements Comparable<Hozzavalo>{
    
    public String hozzavalok;
    public int darabszam;

    public Hozzavalo(String hozzavalok, int darabszam) {
        this.hozzavalok = hozzavalok;
        this.darabszam = darabszam;
    }

    public String getHozzavalok() {
        return hozzavalok;
    }

    public void setHozzavalok(String hozzavalok) {
        this.hozzavalok = hozzavalok;
    }

    public int getDarabszam() {
        return darabszam;
    }

    public void setDarabszam(int darabszam) {
        this.darabszam = darabszam;
    }
    
    @Override
    public String toString() {
        return hozzavalok + ";" + darabszam;
    }

    @Override
    public int compareTo(Hozzavalo h) {
        int kulonbseg = h.darabszam - this.darabszam;
        if(kulonbseg != 0)
            return kulonbseg;
        return this.hozzavalok.compareTo(h.hozzavalok);
    }
}
************************************
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Hozzavalo> hozzavalo = new ArrayList<>();
        while(sc.hasNextLine()){
            String[] sor = sc.nextLine().split(";");
            if(sor[0].equals("0"))
                break;
            int darab = Integer.parseInt(sor[1]);
            Hozzavalo tmp = null;
            for (Hozzavalo h : hozzavalo) {
                if(h.hozzavalok.equals(sor[0])){
                    tmp = h;
                    break;
                }
            }
            if(tmp != null){
                tmp.darabszam += darab;
            } else {
                hozzavalo.add(new Hozzavalo(sor[0], darab));
            }
        }
        Collections.sort(hozzavalo);
        for (Hozzavalo h : hozzavalo) {
            System.out.println(h);
        }
    }
}
*/
import java.util.ArrayList;
/* Z A R T H E L Y I
public class Zh implements Comparable<Zh>{
       private String nev;
    private int pont;

    public Zh(String nev, int pont) {
        this.nev = nev;
        this.pont = pont;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    @Override
    public String toString() {
        return nev + ": " + pont+ " pont" ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Zh)) {
            return false;
        }
        else{
            Zh e=(Zh)obj;
            return this.nev.equals(e.getNev());
        }
        
    } 

    @Override
    public int compareTo(Zh o) {
        if(this.pont==o.getPont()){
            return this.nev.compareTo(o.getNev());
        }
        else{
            return Integer.compare(o.getPont(), this.pont);
        }
    }
}
********************************
public class ZhTest {

    public static void main(String[] args) {

        List<Zh> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();

        while (sor.length() > 0) {
            String[] st=sor.split(";");
            String nev=st[0];
            int pont=Integer.parseInt(st[1]);
            boolean isIn=false;
            
            if(li.size()==0){
                li.add(new Zh(nev, pont));
                isIn=true;
            }
            else{
                for(int i=0;i<li.size();i++){
                    if(li.get(i).getNev().equals(nev)){
                        li.get(i).setPont(li.get(i).getPont()+pont);
                        isIn=true;
                    }
                }
            }
            if(!isIn){
                li.add(new Zh(nev, pont));
            }
            sor=sc.nextLine();
        }
        Collections.sort(li);
        for(Zh i: li){
            System.out.println(i);
        }
    }
}
*/
import java.util.ArrayList;
/* P A R K O L O
public class Parkolo implements Comparable<Parkolo>{

    private String cim;
    private double terulet;
    private int kapacitas;
    private List<String> rendszam;

    public Parkolo(String cim, double terulet, int kapacitas) {
        this.cim = cim;
        this.terulet = terulet;
        this.kapacitas = kapacitas;
        this.rendszam = new ArrayList<>();
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public double getTerulet() {
        return terulet;
    }

    public void setTerulet(double terulet) {
        this.terulet = terulet;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public void setKapacitas(int kapacitas) {
        this.kapacitas = kapacitas;
    }

    public List<String> getRendszam() {
        return rendszam;
    }

    public void setRendszam(List<String> rendszam) {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return cim + ": " + kapacitas + " szabad hely";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Parkolo)) {
            return false;
        } else {
            Parkolo p = (Parkolo) obj;
            return this.cim.equals(p.getCim());
        }

    }

    @Override
    public int compareTo(Parkolo o) {
        if(this.kapacitas==o.getKapacitas()){
            return this.cim.compareTo(o.getCim());
        }
        else{
            return Integer.compare(o.getKapacitas(), this.kapacitas);
        }
    }
}
*******************
public class ParkoloTest {

    public static void main(String[] args) {

        List<Parkolo> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        int e = 0;
        while (sor.length() > 0) {

            String st[] = sor.split(";");
            String nev = st[0];
            double terulet = Double.parseDouble(st[1]);
            int kapacitas = Integer.parseInt(st[2]);
            List<String> rendszam = new ArrayList<>();

            for (int i = 3; i < st.length; i++) {
                rendszam.add(st[i]);
            }
            li.add(new Parkolo(nev, terulet, kapacitas));
            li.get(e).setKapacitas(li.get(e).getKapacitas() - rendszam.size());
            e++;
            sor = sc.nextLine();
        }
        Collections.sort(li);
        for (Parkolo i : li) {
            if (i.getKapacitas() > 2) {
                System.out.println(i);
            }
        }
//            for(int c=0;c<li.size();c++){
//                if(li.get(c).getKapacitas()>2){
//                    System.out.println(li.get(c));
//                }
//            }
    }
}
*/
import java.util.ArrayList;
/* V I Z G Y U J T O K
public class Vízgyüjtő {
    private String név;
    private List<String> beleFolynak; // Azok a vizgyűjtők, amelyek ebbe a vízgyűjtőbe közvetlenül belefolynak

    public Vízgyüjtő(String név) {
        this.név = név;
        this.beleFolynak= new ArrayList<>();
    }

    public String getNév() {
        return név;
    }

    public List<String> getBeleFolynak() {
        return beleFolynak;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    
    // Szükség van rá a lista contains, indexOf metódusa miatt
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Vízgyüjtő)) 
            return false;
        
        Vízgyüjtő vz= (Vízgyüjtő)obj;
        return this.név.equals(vz.getNév());   
    }
    @Override
    public String toString() {
        return "V\u00edzgy\u00fcjt\u0151{" + "n\u00e9v=" + név + ", v=" +  this.beleFolynak.toString() + '}';
    }
    
}
*******************************************
public class Main {

    private static List<Vízgyüjtő> vz = new ArrayList(); //Ebbe  listába tároljuk a standrad inputról érkező vízgyűjtőket(az összeset)

    //Ez a metódus meghatározza, hogy egy paraméterként adott vízgyűjtőbe hány vízsgyűjtű folyik be közvetlenül és közvetetten
    // A közvetetten belefolyó vízgyűjtőket rekurzív módon(lásd prog1+adszerk) határozzuk meg
    public static int db_vizgy(Vízgyüjtő v) {
        int sum = v.getBeleFolynak().size(); // hányan folynak bele közvetlenül, ezt a saját listájában tárolja
        for (String o : v.getBeleFolynak()) { // most egyenként megnézzük azokat a folyókat, akik közvetlenül belefolynak, hogy 
                                               //beléjük hány folyó folyik be közvetlenül: ehhez kell a rekurzió
            Vízgyüjtő tmp = new Vízgyüjtő(o); //a folyó névvel létre hozok egy folyó objektumot(ennek üresek a belefolyik listája),
                                              //ez csak segéd változó, hogy kivegyem a listából az ilyen nevű folyót, mivel az indexOf csak a névlalapján veszi az egyezőséget, és keresi az elemet
            sum += db_vizgy(vz.get(vz.indexOf(tmp))); // miután kinyerem a tényleges folyót a listából, meghívom rá rekurzían ezt a függvényt
        }

        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        while (sor.length() > 0) {

            String[] d = sor.split(";");
            if (d.length == 2) { // ha két elemű az input sor: azaz adott a vígyűjtőbe közvetlenül is belefolyó 
                Vízgyüjtő tmp = new Vízgyüjtő(d[1]);
                Vízgyüjtő tmp2 = new Vízgyüjtő(d[0]);
                if (vz.contains(tmp)) { //ha már mebbe van, akkor csak megkeresem és hozzá adom a listájához a beléje folyó vízgyűjtpt
                    vz.get(vz.indexOf(tmp)).getBeleFolynak().add(d[0]);

                } else  {// ha nincs benne, akkor, először hozzá adom a listájához a vízgyűjtőt(mint Stringet), majd elhelyezem a listába
                    tmp.getBeleFolynak().add(d[0]);
                    vz.add(tmp);

                }
                  // ha két vézgyűjtós az input, akkor a "belefolyó" vízgyűjtőt is adjuk a listánkhoz, ha az még nincs benne
                if (!vz.contains(tmp2)) {
                    vz.add(tmp2);
                }
            } else {// ha egy elems az input
                Vízgyüjtő tmp = new Vízgyüjtő(d[0]);
                if (!vz.contains(tmp)) {
                    vz.add(tmp);
                }

            }
            sor = sc.nextLine();
        }

        for (Vízgyüjtő i : vz) {
            System.out.println(i);
        }
*/
import java.util.ArrayList;
/* M O L E K U L A
public class Molekula {

    private String vegyjel;
    private String elemnev;
    private String molekula;
    private List<String> vegyjel2 = new ArrayList();

    public Molekula(String vegyjel, String elemnev) {
        this.vegyjel = vegyjel;
        this.elemnev = elemnev;

    }

    public Molekula(String molekula, List<String> vegyjel2) {
        this.molekula = molekula;
        this.vegyjel2 = vegyjel2;
    }

    public String getVegyjel() {
        return vegyjel;
    }

    public void setVegyjel(String vegyjel) {
        this.vegyjel = vegyjel;
    }

    public String getElemnev() {
        return elemnev;
    }

    public void setElemnev(String elemnev) {
        this.elemnev = elemnev;
    }

    public String getMolekula() {
        return molekula;
    }

    public void setMolekula(String molekula) {
        this.molekula = molekula;
    }

    public List<String> getVegyjel2() {
        return vegyjel2;
    }

    public void setVegyjel2(List<String> vegyjel2) {
        this.vegyjel2 = vegyjel2;
    }

    @Override
    public String toString() {
        return "vegyjel=" + vegyjel + ", elemnev=" + elemnev + ", molekula=" + molekula + ", vegyjel2=" + vegyjel2;
    }

}
*****************************
public class MolekulaTest {

   public static void main(String[] args) {
        List<Molekula> li = new ArrayList();
        List<Molekula> li2 = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        while (sor.length() > 0) {
            if (sor.equals("-")) {
                sor=sc.nextLine();
                List<String> sl = new ArrayList();
                String[] st = sor.split("[:,]");
                for (int i = 1; i < st.length; i++) {
                    sl.add(st[i]);
                }
                li2.add(new Molekula(st[0], sl));

            } else {
                String[] st = sor.split(":");
                li.add(new Molekula(st[0], st[1]));
                sor=sc.nextLine();
            }
        }
        System.out.println("lista1");
        for(Molekula i:li){
            System.out.println(i.toString());
        }
        System.out.println("\n");
        System.out.println("lista2");
        for(Molekula p:li2){
            System.out.println(p.toString());
        }
        }
}
*/
import java.util.ArrayList;
/* M O Z I
public class Film implements Comparable<Film> {
    
    private String cím;
    private int gyÉv;

    public Film(String cím, int gyÉv) {
        this.cím = cím;
        this.gyÉv = gyÉv;
    }

    public String getCím() {
        return cím;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }

    public int getGyÉv() {
        return gyÉv;
    }

    public void setGyÉv(int gyÉv) {
        this.gyÉv = gyÉv;
    }

    @Override
    public String toString() {
        return this.gyÉv+": "+this.cím;
    }

    @Override
    public int compareTo(Film o) {
        if(this.gyÉv==o.getGyÉv()){
            return this.cím.compareTo(o.getCím());
        }
        else{
            return Integer.compare(this.getGyÉv(), o.getGyÉv());
        }
    }
    
}
********************************
public class Színész implements Comparable<Színész> {
    private String név;
    private List<Film> film;

    public Színész(String név) {
        this.név = név;
        this.film = new ArrayList<>();
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public List<Film> getFilm() {
        return film;
    }

    public void setFilm(List<Film> film) {
        this.film = film;
    }

    @Override
    public int compareTo(Színész o) {
        return (-1)*Integer.compare(this.film.size(), o.getFilm().size()); //(-1)* a sorrendet megfordítjuk
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.név).append(":\n"); //sortot akkor használhatjuk ha van compareto-ja
        Collections.sort(film); 
        for(int i=0;i<film.size();i++)
            if(i<film.size()-1)
            sb.append(film.get(i)).append('\n');
            else
                sb.append(film.get(i));
        return sb.toString();
        
    }     
}
************************************
public class Test {
    public static void main(String[] args) {
        List<Színész> sz = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        String sor = sc.nextLine();
        
        while(sor.length()>0){
            String [] d=sor.split("[:(),]");
            
            for(int i=3;i<d.length;i++){
                Színész szn = new Színész(d[i]);
                if(sz.contains(szn)){
                    sz.get(sz.indexOf(szn)).getFilm().add(new Film(d[0],Integer.parseInt(d[1])));
                }
            }
        }
    }
}
*/