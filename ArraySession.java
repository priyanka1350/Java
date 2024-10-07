public class ArraySession {
    public static void main(String[] args){
        //integer Array//
        int[] intArray= {7,6,9,4,0,2,1,6,8,5,10,12,35,87};
        System.out.println(intArray[5]);
        
        //Char Array//
        char[] charArray={'P','R','I','Y','A','M','A','H','E','S','H'};
        for(int i=0; i <= 10 ; i++)
        {
            System.out.println(charArray[i]);  
        }
        //float Array//
        float[] floatArray={11.1f,12.2f,13.3f,14.4f,15.5f,16.6f,17.7f,18.8f,19.9f,20.0f};
        for(int i=0; i<floatArray.length ;i=i+2)
        {
            System.out.println(floatArray[i]);
        }
       
        //byte Array//
        //right to left//
        byte[] byteArray={1,2,3,4,5,6,7,8,9,0,-1,-2,-3,-4,-5};
        for(int i= byteArray.length-1 ; i >= 0; i--)
        {
            System.out.println(byteArray[i]);
        }
        //long array from middle to right//
        long[] longArray={10000l,12000l,13000l,14000l,15000l,16000l,17000l,18000l,19000l,20000l};
        for(int i=4; i<longArray.length;i++)
        {
            System.out.println(longArray[i]);
        }

        //Short from middle to left//
        short[] shortArray={10,20,30,40,50,60,70,80,90,100,101,102,103,104,105};
        for( int i=6; i>=0;i--){
            System.out.println(shortArray[i]);
        }
        //Boolean Array//
        boolean[] booleanArray={true,false,true,false,false,true};
        for(int i=0;i<booleanArray.length;i++){
            System.out.println(booleanArray[i]);
        }
        //Double Array Skipping 1 index//
        double[] doubleArray={1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.0};
        for(int i=0; i<longArray.length;i=i+2){
            System.out.println(doubleArray[i]);
        }


         
    } 
    
}


