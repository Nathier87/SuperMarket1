package SuperMarket;

import java.util.*;


public class SuperMarket {
    static Scanner Reader=new Scanner(System.in);
    private static Cash cash=new Cash();

    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("\n Soep, 3 euro");
        list.add("\n Cereals, 2 euro");
        list.add("\n Chinese vegetables, 5 euro");
        list.add("\n Yoghourt, 2euro");
        list.add("\n Diapers, 10 euro");
        for(Object element: list){
            System.out.println(list);
        }
    }

    private  static  void showMainMenu(Cash){
        System.out.println("Choose your option number and press enter");
        int mainOption = cash.nextInt();
        switch (mainOption){
            case 1:
                Cash();
                System.out.println("press `m` to go to main menu or `enter` to leave the program");
                if(cash.nextLine().equals("m"))
                    showMainMenu(cash);
                break;
            case 2:
                System.out.println("press `m` to go to main menu or `enter` to leave the program");
                if(cash.nextLine().equals("m"))
                    showMainMenu(cash);






        }




    }


}