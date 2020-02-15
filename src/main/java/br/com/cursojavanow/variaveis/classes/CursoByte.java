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
        Byte b = new Byte​(value);
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

        Byte d = new Byte​(decimal);

        System.out.println("Decimal para Byte " + d.decode(decimal)); // 10
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

}
