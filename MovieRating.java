import java.util.Scanner;

class MovieRating {
    public static void main(String[] args) {
        
        /* Write your code here */
      
      Scanner scan = new Scanner(System.in);
      //Variables

      String name;
      int timem;
      int minutes;
      int hours;
      int web1;
      int web2;
      int web3;
      double webav;
      double focus1;
      double focus2;
      double focusav;
      double critic;
      double whw;
      double whf;
      double whc;
      double who;
      int overall;
  

      //Name
      System.out.println("Please enter the movie name");
      name = scan.nextLine();

      //Run Time
      System.out.println("Please enter the run time in minutes");
      timem = scan.nextInt();
      hours = timem /60;
      minutes = timem % 60;

      //Review on Web
      System.out.println("Please enter ratings from the movie review website");
      web1 = scan.nextInt();
      web2 = scan.nextInt();
      web3 = scan.nextInt();

      webav = ((double)web1 + (double)web2 + (double)web3)/3 ;

      //Focus room ratings
      System.out.println("Please enter ratings from the focus group");
      focus1 = scan.nextDouble();
      focus2 = scan.nextDouble();
      focusav = (focus1 + focus2) / 2;

      //Critic rating
      System.out.println("Please enter the critic rating");
      critic = scan.nextDouble();

      //Overall Rating
      who = webav*0.2;
      whf = focusav*0.3;
      whc = critic*0.5;
      overall = (int)who + (int)whf + (int)whc; 

      //Output
      System.out.println("Title: " + name);
      System.out.println("Runing Time: " + hours + "h " + minutes );
      System.out.println("Average Website Rating: " + webav);
      System.out.println("Average Focus Group Rating: " + focusav );
      System.out.println("Average Movie Critic Rating: " + critic);
      System.out.println("Overall Movie Rating: " + overall);

    }
}