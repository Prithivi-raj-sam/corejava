package com.chainsys.introduction;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      byte b1=127;
      System.out.println("b1:" + b1);
      short s1=1000;
      System.out.println("s1:"+s1);
      short s2=-32768;
      System.out.println("s2:"+s2);
      int intmax=2147483647;
      System.out.println("maxvalue:"+intmax);
      int intmin=-2147483648;
      System.out.println("minvlaue:"+intmin);
      long longmax=9223372036054775807L;
      System.out.println("LonMaxValue:"+longmax);
      long longmin=-9223372036854775008L;
      System.out.println("LongminValue:"+longmin);
      float floatmax= 2147483648.5432F;
      System.out.println("floatmaxvalue:"+floatmax);
      float floatmin=-2147483659.11111F;
      System.out.println("floatminvalue:"+floatmin);
      double doublemax=-21474836423.5432d;
      System.out.println("doublemaxvalue:"+doublemax);
      double doublemin=-2147483648.11111d;
      System.out.println("doubleminvalue:"+doublemin);
      char c1='A';
      System.out.println("c1=:"+c1);
      char c2='Z';
      System.out.println("c2=:"+c2);
      int asciival=(int) c1;
      System.out.println("ascii of c1=:"+asciival);
	}

}
