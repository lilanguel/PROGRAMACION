public class EJ3 {
    public static void main(String[] args) {
        int carta = (int)(Math.random() * 13);
        int palo= (int)(Math.random() * 4);

        switch(palo){
            case 0:{
                System.out.println("Palo - picas");
                break;
            }
            case 1:{
                System.out.println("Palo - corazones");
                break;
            }
            case 2:{
                System.out.println("Palo - diamantes");
                break;
            }
            case 3:{
                System.out.println("Palo - tréboles");
                break;
            }
        }
        switch(carta){
            case 0:{
                System.out.println("Carta - A");
                break;
            }
            case 1:{
                System.out.println("Carta - 2");
                break;
            }
            case 2:{
                System.out.println("Carta - 3");
                break;
            }
            case 3:{
                System.out.println("Carta - 4");
                break;
            }
            case 4:{
                System.out.println("Carta - 5");
                break;
            }
            case 5:{
                System.out.println("Carta - 6");
                break;
            }
            case 6:{
                System.out.println("Carta - 7");
                break;
            }
            case 7:{
                System.out.println("Carta -8");
                break;
            }
            case 8:{
                System.out.println("Carta - 9");
                break;
            }
            case 9:{
                System.out.println("Carta - 10");
                break;
            }
            case 10:{
                System.out.println("Carta - J");
                break;
            }
            case 11:{
                System.out.println("Carta - Q");
                break;
            }
            case 12:{
                System.out.println("Carta - K");
                break;
            }
        }
    }
}
