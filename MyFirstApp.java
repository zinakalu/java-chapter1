public class MyFirstApp{
    public static void main (String[] args){
        int bootlesNum = 10;
        String bootlesPlural = "bottles";
        while (bootlesNum > 0) {
            if (bootlesNum == 1){
                bootlesPlural = "bottle";
            }
            System.out.println( bootlesNum + " green " +  bootlesPlural + " hanging on the wall ");
            System.out.println( bootlesNum + " green " + bootlesPlural + " hanging on the wall ");
            System.out.println( " And if one green bottle should accidently fall");
            bootlesNum -= 1;

            if (bootlesNum > 0){
             System.out.println(" There'll  be " + bootlesNum  + " green " + bootlesPlural + " hanging on the wall ");
        } else {
             System.out.println(" There'll  be  no " + " green " + bootlesPlural + " hanging on the wall ");
        }
        }
       }
    }