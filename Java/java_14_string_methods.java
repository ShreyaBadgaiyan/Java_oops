
public class java_14_string_methods {
    public static void main(String[] args) {
        //Methods in String

        String a="Harry";
        String b=new String("Harryaa");
        String c="   gullu   ";

        //String methods do not modify the string, they form the new string and assign it to variable
        //String is immutable and original string does not change.
        //Some of the commonly used string methods are follows:
        //1.length of string
        System.out.println(a.length());

        //2.lowercase
        System.out.println(a.toLowerCase());

        //3.uppercase
        System.out.println(a.toUpperCase());

        //4.trim spaces
        System.out.println(c.trim());

        //5.Substring(start)
        System.out.println(a.substring(2));
        System.out.println(a.substring(0 ,3));

        //6.Substring(start,end)
        System.out.println(a.substring(2,4));

        //7.Replacing characters
        System.out.println(a.replace('r','p'));
        System.out.println(a.replace("Ha","Na"));

        //8.Starts with
        System.out.println(a.startsWith("H"));
        System.out.println(a.startsWith("j"));

        //9.Ends with
        System.out.println(a.endsWith("ry"));
        System.out.println(a.endsWith("i"));

        //10.character at index number
        System.out.println(a.charAt(3));

        //11.INDEX OF(returns first occurrence)
        System.out.println(a.indexOf('r'));

        //12.index of by specifying start character
        System.out.println(a.indexOf('s',3));
        //returns -1 when string not present

        //13.lastIndexof
        System.out.println(a.lastIndexOf('r'));

       //14.lastIndex of before some index
        System.out.println(a.lastIndexOf('r',3));

        //15.equals
        System.out.println(a.equals("arry"));

        //16.equalsIgnoreCase
        System.out.println(a.equalsIgnoreCase("harry"));

        //Escape sequence characters:
        //for adding double qoute
        //used with backslash
        //refer oracle documentations are for java
        System.out.println("I am \"shreya\"");
        System.out.println("I am \n Shreya");
        System.out.println("shreya\tbadgaiyan");
        System.out.println("shreya\\");
    }
}

