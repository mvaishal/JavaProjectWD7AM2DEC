package testPackage;

public class _02DataType {
	public static void main(String[] args) {
         int a1 = 10;
         boolean flag = false;
         char  ch = 'A';
         double d1 = 154.15455;
         short s1 = 32767;
         
         long l1 = 9879494761916l;
         float f1 = 125451.2545f;
         
     //implicit typecasting    
        byte b1 = 10;
        double d2 = b1;
        System.out.println(b1);
        System.out.println(d2);
        int i2 = 15451548;
        long l2 = i2;
        
        System.out.println(i2);
        System.out.println(l2);
      
      
        
        //explicit typecasting 
        double d3 = 458944918.56415165415;
        
        int i3 = (int)d3;
        
        long l3 = (long)d3;
        
        System.out.println(d3);
        System.out.println(i3);
        System.out.println(l3);
        
        long l4 = 154515l;
        
        int i4 = (int)l4;
        System.out.println(l4);
        System.out.println(i4);
        
	}
}
