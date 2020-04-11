/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cursojavanow.variaveis.classes;

/**
 *
 * @author zigui
 */
public class CursoByte {

    public static void quantosBytesUtilizaOByte() {
        System.out.println(Byte.BYTES);//1
    }

    public static void valorMaximoDeUmByte() {
        System.out.println(Byte.MAX_VALUE);//127
    }

    public static void valorMinimoDeUmByte() {
        System.out.println(Byte.MIN_VALUE);//-128
    }

    public static void numeroDeBitsParaRepresentarOByte() {
        System.out.println(Byte.SIZE);//8 
        //desde 1.5
    }

    public static void qualOTipoPrimitivoDeByte() {
        System.out.println(Byte.TYPE);//byte
        //desde 1.8
    }

    public static void construtorByteParametroByte() {
        byte value = 2;
        Byte b = value;
        System.out.println(b); //descontinuado desde o 9
    }

    public static void transformaStringEmByte() {
        String value = "3";
        Byte b = new Byte​(value);
        System.out.println(b); //descontinuado desde o 9
    }

    public static void recebeByteERetornaBytePrimitivo() {
        String value = "3";
        Byte b = new Byte​(value);
        System.out.println(b.byteValue());
        //retorna byte
    }

    public static void recebeDoisBytePrimitivosECompara() {
        byte b1 = 5;
        byte b2 = 8;
        System.out.println(Byte.compare(b1, b2)); //-3
        System.out.println(Byte.compare(b2, b1)); //3
        /*
        Regra
        p é igual a parâmetro compare(p1,p2)
        
        Se p1 == p2 vai retornar 0
        Se p1 < p2 vai retornar um valor menor que zero
        Se p1 > p2 vai retornar um valor maior que zero
         */
        //the value 0 if x == y; a value less than 0 if x < y; and a value greater than 0 if x > y
        //desde 1.7

        //retorna static int
    }

    public static void recebeByteEComparaComOutroByte() {
        String value1 = "5";
        Byte b1 = new Byte​(value1);
        String value2 = "8";
        Byte b2 = new Byte​(value2);
        System.out.println(b1.compareTo(b2)); //-3   
        System.out.println(b2.compareTo(b1)); //3 

        /*
        Regra
        p é igual a parâmetro compareTo(Byte p1)
        Você já deve ter um Byte para chamar o método compareTo
        
        Se p1 == p2 vai retornar 0
        Se p1 < p2 vai retornar um valor menor que zero
        Se p1 > p2 vai retornar um valor maior que zero
         */
        //the value 0 if x == y; a value less than 0 if x < y; and a value greater than 0 if x > y
        //desde 1.2
        //retorna int
    }

    public static void recebeDoisBytePrimitivosQueTrataComoNãoAssinadoECompara() {
        byte b1 = 5;
        byte b2 = 8;
        System.out.println(Byte.compareUnsigned(b1, b2)); //-3
        System.out.println(Byte.compareUnsigned(b2, b1)); //3
        /*
        Só compara corretamente com números positivos
        
        Os tipos byte, short, int, long, float e double são signed, ou seja, 
        possuem um intervalo de valores que vai de um número negativo até um 
        número positivo. O tipo char é o único tipo unsigned do Java, tendo 
        16 bits, e um intervalo de valores entre 0 e 65535.

        P.S.: O tipo boolean é dependente da implementação específica da JVM.
         */

 /*
        Regra
        p é igual a parâmetro compare(p1,p2)
        
        Se p1 == p2 vai retornar 0
        Se p1 < p2 vai retornar um valor menor que zero
        Se p1 > p2 vai retornar um valor maior que zero
         */
        //the value 0 if x == y; a value less than 0 if x < y; and a value greater than 0 if x > y
        //desde 9
        //retorna static int
    }

    public static void decodeStringToByte() {
        //http://www.calculadoraonline.com.br/conversao-bases
        String decimal = "10";
        String hexadecimal = "0x29"; //para representar hexadecimal no java tem que colocar o 0x (zero e x)
        String octal = "051";//para representar octal no java tem que colocar o 0 (zero)

        System.out.println("Decimal para Byte " + Byte.decode(decimal)); // 10
        System.out.println("Hexadecimal para Byte " + Byte.decode(hexadecimal)); //41
        System.out.println("Octal para Byte " + Byte.decode(octal)); //41
        //retorna static Byte
    }

    public static void transformaByteToDoublePrimitivo() {
        String decimal = "10";
        Byte d = new Byte​(decimal);
        System.out.println(d.doubleValue());
        //retorna double
    }

    public static void compararObjetos() {
        String n1 = "10";
        String n2 = "10";
        String n3 = "1";
        System.out.println("Comparar 1 " + n1.equals(n2));
        System.out.println("Comparar 2 " + n1.equals(n3));
        String s1 = new String();
        String s2 = new String();
        Object o = new Object();
        System.out.println("Comparar 3 " + s1.equals(s2));
        System.out.println("Comparar 4 " + s1.equals(o));
    }

    public static void byteToFloatValue() {
        String decimal = "10"; // com números flutuantes gera exceção
        Byte d = new Byte​(decimal);
        System.out.println(d.floatValue());
    }

    public static void byteToInt() {
        String decimal = "10"; // com números flutuantes gera exceção
        Byte d = new Byte​(decimal);
        System.out.println(d.hashCode());
    }

    public static void byteToStaticInt() {
        byte value = 2;
        System.out.println(Byte.hashCode(value));
    }

    public static void byteToIntValue() {
        String decimal = "10"; // com números flutuantes gera exceção
        Byte d = new Byte​(decimal);
        System.out.println(d.intValue());
    }

    public static void byteToLongValue() {
        String decimal = "10"; // com números flutuantes gera exceção
        Byte d = new Byte​(decimal);
        System.out.println(d.longValue());
    }

    public static void byteToParseByte() {
        String decimal = "10";
        System.out.println(Byte.parseByte(decimal));
    }

    public static void byteToParseByteRadix() {
        String decimal = "11";
        System.out.println(Character.MAX_RADIX);
        System.out.println(Byte.parseByte(decimal, 36));
        /*
        RADIX é base do cálculo
        https://www.knowledgewalls.com/johnpeter/books/one-day-one-thing-to-know/how-to-use-integerparseintstringradix-in-java
        
        Value range of radix is 2 to 36. Get radix range from Character.MIN_RADIX and Character.MAX_RADIX.
        
   2 - base-2 numbers (Binary). 2 means input value only contains 0-1. Otherwise will through NumberFormatException
   8 - base-8 numbers (Octal). 8 means input string contains only 0-7. Otherwise will through NumberFormatException
 10 - base-10 numbers (Decimal). It may contains 0-9 characters.
 16 - base-16 numbers (Hexa decimal). It may contains 0-9 and A,B,C,D,E,F characters.
 36 - base-36 numbers (Numbers and Letters). It may contains 0-9 (10) numbers and A to Z (26) letters.

 13 - It means string can contains 0-9 (10) and A,B and C.
   Integer.parseInt("0293BC",13) - No errors. Return parsed integer value.
  Integer.parseInt("0293DC",13) - through NumberFormatException because it contains D. but range 13 only support 0-9 and A, B and C characters.
         */
    }

    public static void byteShortValue() {
        String decimal = "10"; // com números flutuantes gera exceção
        Byte d = new Byte​(decimal);
        System.out.println(d.shortValue());
    }

    public static void byteToString() {
        String decimal = "10"; // com números flutuantes gera exceção
        Byte d = new Byte​(decimal);
        System.out.println(d.toString());
    }

    public static void byteToStringWithParameter() {
        byte b = 10;
        System.out.println(Byte.toString(b));
    }

    public static void byteToUnsignedInt​() {
        byte b = 10;
        System.out.println(Byte.toUnsignedInt​(b));
        /*
        https://www.therevisionist.org/software-engineering/java/terms/signed-vs-unsigned/
        
        Signed variables, such as signed integers will allow you to represent numbers both in the positive and negative ranges.

Unsigned variables, such as unsigned integers, will only allow you to represent numbers in the positive.
        
        For example, an unsigned byte can represent values from 0 to 255, while signed byte can represent -128 to 127. (Adding 128 + 127 = 255)[1]
         */
    }

    public static void byteToUnsignedLong​() {
        byte b = 10; //número negativos dá um loop (reinicia) nos números positivos.
        System.out.println(Byte.toUnsignedLong(b));
    }

    public static void byteToValueOfParameterByte​() {
        byte b = 10;
        System.out.println(Byte.valueOf(b));
    }

    public static void byteToValueOfParameterString​() {
        String decimal = "10";
        System.out.println(Byte.valueOf(decimal));
    }

    public static void byteToValueOfParameterStringERadix​() {
        String decimal = "10";
        System.out.println(Byte.valueOf(decimal, 2));
    }

}
