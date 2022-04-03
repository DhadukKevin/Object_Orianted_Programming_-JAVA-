import java.util.Scanner;
class Vowel{
    String a;
    int count_a=0,count_e=0,count_i=0,count_o=0,count_u=0;
    Scanner sc=new Scanner(System.in);

    void getDetails(){

        do{
        System.out.println("Enter Sentence:");
        a=sc.nextLine();

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='A' || a.charAt(i)=='a')
            {
                count_a++;
            }
            if(a.charAt(i)=='E' || a.charAt(i)=='e')
            {
                count_e++;
            }
            if(a.charAt(i)=='I' || a.charAt(i)=='i')
            {
                count_i++;
            }
            if(a.charAt(i)=='O' || a.charAt(i)=='o')
            {
                count_o++;
            }
            if(a.charAt(i)=='U' || a.charAt(i)=='u')
            {
                count_u++;
            }
            
        }
       }while(!a.equals("quit")); 

       count_i--;
       count_u--;

    }

    void displayCountVowel(){

        System.out.println("A = "+count_a);
        System.out.println("E = "+count_e);
        System.out.println("I = "+count_i);
        System.out.println("O = "+count_o);
        System.out.println("U = "+count_u);

    }
}
class VowelDemo{
	public static void main(String[] args){
		Vowel sc=new Vowel();

		sc.getDetails();
		sc.displayCountVowel();
	}
}
