public class Switchcase {
 public static void main(String[] args) {
    int day = 4;
    String dayname;
     switch (day)
     {
        case 1:
        dayname="monday";
        break;
        case 2:
        dayname="wednesday";
        break;
        case 3:
        dayname="thursday";
        break;
        case 4:
        dayname="friday";
        break;
        case 5:
        dayname="saturday";
        break;
        default:
        dayname="invalid";
        break;
       }
       System.out.println("enter day name \n"+dayname);

     
 }
    
}
