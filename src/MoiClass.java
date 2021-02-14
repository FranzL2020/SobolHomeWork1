public class MoiClass {
    //1
    public static void main(String[] args) {

        //2
        byte b = 3;
        short sh = 3434;
        int i = 87979;
        long l = 788769696;
        float f = 11.90f;
        double d = -124.987;
        char ch = '\u0042';
        boolean IsMy = false;
        System.out.println(b);
        System.out.println(sh);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(IsMy);
    }
     //3
    public static float calc(float a, float b, float c, float d){
        return a * (b + (c / d));
     }
//4
     public static boolean t10und20(int x, int y){
         int summa = x + y;
        if (summa > 10 && summa < 20 ) {
            return true;
        } else {
            return false;
        }
     }

     //5

    public boolean doChislo(int x){
        if(x < 0){
            return true;
        } else return false;
    }
       //6
        public static void isPundN (int x){
        if (x >= 0){
            System.out.println("Число" + x + "положительное");
        } else {
            System.out.println("Число" + x + "отрицательное");
        }


     }
//7
       public void doName (String name){
           System.out.println("Привет," + name + "!");
       }

       //8
       public void doYear (int year){
            year = (int) 227;
           if(!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))){
               System.out.println(year + "Невысокосный год");
           } else System.out.println(year + "Высокосный год");
       }

     }


