package com.tutorial;

public class Main {
    public static void main(String[] args){
        // true = 1
        //false = 0

        //or (tambah) atau (||)
        boolean a,b,c;
        System.out.println("====== OR ======");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        //and (kali) atau (&&)
        boolean d,e,f;
        System.out.println("====== AND ======");
        d = false;
        e = false;
        f = (d && e);
        System.out.println(d + " && " + e + " = " + f);
        d = false;
        e = true;
        f = (d && e);
        System.out.println(d + " && " + e + " = " + f);
        d = true;
        e = false;
        f = (d && e);
        System.out.println(d + " && " + e + " = " + f);
        d = true;
        e = true;
        f = (d && e);
        System.out.println(d + " && " + e + " = " + f);

        //and (kali) atau (&&)
        boolean g,h,i;
        System.out.println("====== XOR ======");
        g = false;
        h = false;
        i = (g ^ h);
        System.out.println(g + " ^ " + h + " = " + i);
        g = false;
        h = true;
        i = (g ^ h);
        System.out.println(g + " ^ " + h + " = " + i);
        g = true;
        h = false;
        i = (g ^ h);
        System.out.println(g + " ^ " + h + " = " + i);
        g = true;
        h = true;
        i = (g ^ h);
        System.out.println(g + " ^ " + h + " = " + i);

        //NOT atau (!)
        System.out.println("====== NOT ======");
        boolean j,k,l,m;

        j = true;
        l = !j;
        System.out.println(j + " --> (!) = " + l);

        k = false;
        m = !k;
        System.out.println(k + " --> (!) = " + m);





    }
}
