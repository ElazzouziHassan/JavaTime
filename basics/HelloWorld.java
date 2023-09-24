public class HelloWorld {
  public static void main(String[] args) {
    // this is a comment in java says
    // I am printing out Hello World 
    System.out.println("Hello, World!");
    // this another comment says 
    // I am printing out a Number
    System.out.println(7);
    /* 
     * this a multiline comment
     */

  }
}

/*
 * 2 .Build & Compile :
 *  - javac HelloWorld.java -> Build
 *  - java HelloWorld -> Compile
 *  - output : Hello, World! 
 * ------------------------------------------------------------
 * 3 .Types de donneés :
 *  + boolean : Boolean, 1 octet, true(1) | false(0)
 *  + byte    : Byte, 1 octet, -128 à 127
 *  + char    : Character, 2 octets, unicode
 *  + short   : Short, 2 octets, -32768 à 32767
 *  + int     : Integer, 4 octets, -214783648 à 214783647
 *  + long    : Long, 8 octets, -2^63 à (2^63)-1
 *  + float   : Float, 4 octets, 1.4x(10^-45) à 3.4x(10^38)
 *  + double  : Double, 8 octets, 4.9x(10^-324) à 1.7x(10^308)
 * ------------------------------------------------------------
 * 4 .Bases numériques :
 * Décimale    : 10 -> 0 à 9 : normal
 * Binaire     : 2  -> 0 et 1: 0bxxxx
 * Octale      : 8  -> 0 à 7 : 07xxxx
 * Hexadécimale: 16 -> 0 è F : 0Xxxxx
 * ------------------------------------------------------------
 * 5  .Variables et Constantes :
 * Régles à respecte lors de la declaration des variables ou bien des constantes
 * +  pas des caractéres spéciaux
 * +  pas d'espaces
 * +  commence par une letter ou underscore '_'
 * -  camel case : uneVariable
 * -  pascal case: UneVariable
 * -  snake case : une_variable
 * 
 * Exemples :
 * int ageUser = 26;
 * System.out.println(ageUser); -> 26
 */
