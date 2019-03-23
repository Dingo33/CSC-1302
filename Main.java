import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Card> deck = new ArrayList<>();
        Card card1 = new Card("What is the capital of GA", "Atlanta");
        Card card2 = new Card("card2", "card2");
        Card card3 = new Card("card3", "card3");


        deck.add(card1);
        deck.add(card2);
        deck.add(card3);

        System.out.println("ENTER \"ADD\" TO ADD CARDS TO DECK \n\n ENTER \"USE\" TO USE DECK");
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();

      if(input.toUpperCase().equals("USE")){
          Card c = new Card();
          System.out.println(deck.size());
          for(int i = 0; i < deck.size(); i++) {
              if(deck.size() < 1){
                  System.out.println("No cards in deck");
              }
              c = deck.get(i);
              c.showFront();
              String answer = sc.nextLine();
              System.out.println("\nEnter the answer");

              if(answer.toUpperCase().equals(c.getBack().toUpperCase())){
                  System.out.println("Correct!");
              }
              else{
                  System.out.println("Wrong!");
              }
          }
          sc.close();
      }

      if(input.toUpperCase().equals("ADD")){
          addCard(deck);
      }
    }
        //deck.add(card1);
        //deck.add(card2);
        //deck.add(card3);
        //deck = addCard(deck);
        //System.out.println(deck);

        //Why does scanner break it???

        /*System.out.println(c.getFront());
        System.out.println(c.getBack());
        c.reverse();
        System.out.println(c.getFront());
        System.out.println(c.getBack());

        System.out.println(deck);
        */


    public static ArrayList<Card> addCard(ArrayList<Card> a){

        boolean userDone = false;
        Scanner sc = new Scanner(System.in);

        while(!userDone){
            System.out.println("Please enter front of card");
            String f = sc.nextLine();
            System.out.println("Please enter back of card");
            String b = sc.nextLine();
            Card card = new Card(f,b);
            a.add(card);
            System.out.println("Enter DONE if you are done adding");
            System.out.println("To add more press enter");
            String stop = sc.nextLine();
            if(stop.toUpperCase().equals("DONE")){
                break;
            }
        }
        sc.close();
        return a;
    }

}
