public class Main{
    public static void main(String[] args){
        // заполняем массив c элементами от 5 до 15 включительно
        long[] c = new long[11];
        for(int i=0;i<c.length;i++) {
            c[i]=15-i;
            System.out.println(c[i]);

        }
        //создаем массив x и заполняем его случайными числами от -8 до 15
        float[] x = new float[11];
        for(int i=0;i<x.length;i++){
             x[i]= (float) (Math.random()*23)-8;
        }
        //создаём двумерный массив и заполняем его согласно условиям задачи
        double[][] k=new double[11][11];
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                Long longValue = c[i];
                Integer intValue = longValue.intValue();
                switch(intValue){
                    case 14:
                        k[i][j]=Math.tan(Math.pow(Math.pow(x[j],x[j]*(x[j]-(2.0/3))),0.5/Math.tan(x[j])));
                        break;
                    case 5:
                    case 8:
                    case 10:
                    case 11:
                    case 15:
                        k[i][j]=Math.pow(Math.pow(((2-Math.cbrt(x[j]))/x[j])/2,Math.atan((x[j]+3.5)/23))*(Math.pow(Math.sin(x[j]),Math.tan(x[j]))+1),3);
                        break;
                    default:
                        k[i][j]=Math.atan(Math.pow(Math.E,Math.cbrt(-Math.pow(Math.pow(Math.E,x[j])/2,2))));
                System.out.print(String.format("%7.3f",k[i][j]));

                }


            }
            System.out.println();


        }



    }
}