package systemperformance;

import java.io.IOException;

public class Main {
	
	private static FileRW file= new FileRW();
	private static SentenceIdentification SI = new SentenceIdentification();
	private static Main main = new Main();
	
	private String userFile;
	private String[][] userStr;
	
	private String systemFile;
	private String[][] systemStr;
	
	private float counter,userCounter;
	private float ortalama;
	
	public String[][] userSummar(String filePath) {
		
		try {
			
			
			userFile=file.FileRead(filePath);// FileRead fonksiyonu ile dosyayı okuyup 
			userStr=SI.Cumle(userFile);              //Cumlelerine ayırdım ve bu değişkeni döndürdüm
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		for(int i=0;i<100;i++) {
//		System.out.println(userStr[i][0] );
//	}
	
		return userStr;
		
	}
	
	//Özetleme fonksiyonumuzu dosyadan okuduğumuz metne uygulama
	public String[][] systemSummar(String txt) {
		try {
			
			systemFile = file.FileRead(txt);					  //dosyayi okuyoruz
			systemStr=SI.Cumle(systemFile);  //okunan dosyayi kendi özetleme fonksiyonumuza göre özetliyoruz
			
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
//		for(int i=0;i<100;i++) {
//			System.out.println(systemStr[i][0] );
//		}
		return systemStr;
	}
	
	//Hesaplama fonksiyonumuzu yazıyoruz 
	public float calculatorSystem(String systemfilePath, String userfilePath, int d ) {
		
		
		String[][] sistemozeti = main.systemSummar(systemfilePath); //sistemin yaptigi özetleme fonksiyonunun sonucunu diziye atiyoruz	
		String[][] kullaniciozeti = main.userSummar(userfilePath);	// kullanicinin yaptigi özeti diziye atiyoruz
		
		for(int i=1;i<kullaniciozeti.length;i++) {  // burada sistem özeti ile kullanıcı özeti karşılaştırılıp
			for(int j=1;j<sistemozeti.length;j++) { // her ikisinde de ortak bulunan cumle sayisi hesaplaniyor
				if(kullaniciozeti[i][0].equals(sistemozeti[j][0]) && !kullaniciozeti[i][0].equals(null) && !sistemozeti[j][0].equals(null)) {
					counter++;
				}
			}
		}
		
		for(int k=0;k<kullaniciozeti.length;k++) { // kullanıcının yaptığı özette ki cümle sayısı hesaplanıyor
					
			userCounter++;
			
		}
		
		return ortalama = counter/userCounter;
		
		
	}
	
	public static void main(String[] args) throws IOException{
		
		
	
		String userSummarPath=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/1koz.txt");
		String SystemSummarPath=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/1o.txt");
		
		String userSummarPath2=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/2koz.txt");
		String SystemSummarPath2=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/2o.txt");
		
		
		String userSummarPath3=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/3koz.txt");
		String SystemSummarPath3=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/3o.txt");
		
		String userSummarPath4=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/4koz.txt");
		String SystemSummarPath4=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/4o.txt");
		
		String userSummarPath5=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/5koz.txt");
		String SystemSummarPath5=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/5o.txt");
		
		String userSummarPath7=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/7koz.txt");
		String SystemSummarPath7=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/7o.txt");
		
		String userSummarPath8=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/8koz.txt");
		String SystemSummarPath8=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/8o.txt");
		
		String userSummarPath9=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/9koz.txt");
		String SystemSummarPath9=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/9o.txt");
		
		String userSummarPath10=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/10koz.txt");
		String SystemSummarPath10=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/10o.txt");
		
		String userSummarPath11=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/11koz.txt");
		String SystemSummarPath11=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/11o.txt");
		
		String userSummarPath12=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/12koz.txt");
		String SystemSummarPath12=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/12o.txt");
		
		String userSummarPath13=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/13koz.txt");
		String SystemSummarPath13=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/13o.txt");
		
		String userSummarPath14=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/14koz.txt");
		String SystemSummarPath14=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/14o.txt");
		
		String userSummarPath15=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/15koz.txt");
		String SystemSummarPath15=("C:/Users/Kubra/Desktop/turkce-metin-ozetleme-master/Metinler/15o.txt");
		
		
		float ilk = (main.calculatorSystem(SystemSummarPath, userSummarPath, 0));
		//float ikinci = main.calculatorSystem(SystemSummarPath2, userSummarPath2, 1);
		//float ücüncü = main.calculatorSystem(SystemSummarPath3, userSummarPath3, 2);
		float dördüncü =( main.calculatorSystem(SystemSummarPath4, userSummarPath4, 3));
		float besinci =( main.calculatorSystem(SystemSummarPath5, userSummarPath5, 4));
		float yedinci =( main.calculatorSystem(SystemSummarPath7, userSummarPath7, 5));
		float sekizinci =( main.calculatorSystem(SystemSummarPath8, userSummarPath8, 7));
		//float dokuzuncu =( main.calculatorSystem(SystemSummarPath9, userSummarPath9, 8));
		//*sıfır buldu float onuncu =( main.calculatorSystem(SystemSummarPath10, userSummarPath10, 9));
		float onbirinci =( main.calculatorSystem(SystemSummarPath11, userSummarPath11, 10));
		float onikinci =( main.calculatorSystem(SystemSummarPath12, userSummarPath12, 11));
		
		float onücüncü =( main.calculatorSystem(SystemSummarPath13, userSummarPath13, 12));
		float ondördüncü =( main.calculatorSystem(SystemSummarPath14, userSummarPath14, 13));
		//float onbesinci =( main.calculatorSystem(SystemSummarPath15, userSummarPath15, 14));
		
		float toplam = (ilk+dördüncü+besinci+yedinci+sekizinci+onbirinci+onikinci+onücüncü+ondördüncü);
		float ortalama=(toplam)/9;
		
		System.out.println("Sistem başarısı : %" + 100*ortalama);
	}
}
