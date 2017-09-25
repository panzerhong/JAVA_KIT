package ObjectINjava;

public class AboutObject {
	
	int num=1000;
	
	public static void main(String[] args) {
	/*
	 * ទយើងអាចកំណ្ត់តនមលរបស់អញ្ញាតមួយដដលទទួលលកខណ្ៈ object 
	 * ទៅឲ្យអញ្ញាតមួយទផសងទទៀតលកខណ្ៈដបបទនេះមានន័យថាអញ្ញាតដដលទទួល object
	 *  ទ េះមានលកខណ្ៈជាអញ្ញាត Reference ។ ឧទហរណ្៍៖ Vehicle car1=new Vehicle();
	 *   Vehicle car2=car1; ទបើត្តមទយើងទមើលទៅវាហាក់ដូចជា car1 និង car2 វាបញ្ញាក់ឲ្យ object 
	 *   ពីរទផសងគ្នន។ ដតត្តមពិតវាបញ្ញាក់ឲ្យ object ដតមួយ។ ដូទចនេះការកំណ្ត់តនមលទៅឲ្យ car1 ឬ car2
	 *   គឺដូចគ្នន។
	 * */
		
		AboutObject a;
		a = new AboutObject();
		AboutObject b = a; // variable reference which received the 
		// value of other object
		
		System.out.println(a.num);
		System.out.println(b.num);
		
	}
}
