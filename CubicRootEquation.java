import java.util.Scanner;
import java.text.DecimalFormat;

public class CubicRootEquation
{
   public static void main(String[] args)
   {
      
     //Variables
     int a, b, c, d;
     double e, f, g, h, i, j, k, l, m, n, p, r, s, t, u, z, root1, root2, root2a, root2b, root3, root3a, root3b;
      
     //Input
     Scanner scan = new Scanner(System.in);
     
     //Prompts
     System.out.print("Enter the coefficient of x cubed: ");
     a = scan.nextInt();
      
     System.out.print("Enter the coefficient of x squared: ");
     b = scan.nextInt();
      
     System.out.print("Enter the coefficient of x: ");
     c = scan.nextInt();
      
     System.out.print("Enter the constant: ");
     d = scan.nextInt();
     
     //Decimal Format
     DecimalFormat fmt = new DecimalFormat("0.###");

     //Calculations
     e = 1.0/3;
     z = 1.0/2;
     f = ((3*c/a) - (Math.pow(b, 2) / Math.pow(a, 2))) / 3;
     g = (((2* Math.pow(b, 3) / Math.pow(a, 3)) - (9*b*c / Math.pow(a, 2)) + (27*d / a)) / 27);
     h = ((Math.pow(g, 2) / 4) + (Math.pow(f, 3) / 27));
     
     //Conditional
     if ((h == 0) && (f == 0) && (g == 0))
     {   
         root1 = Math.cbrt((d / a)) * -1;
         
         System.out.print("\rRoot 1: " + fmt.format(root1));
         System.out.print("\rRoot 2: " + fmt.format(root1));
         System.out.print("\rRoot 3: " + fmt.format(root1));
     }
     
     if (h <= 0 && f!=0 && h!=0)
     { 
         i = (Math.pow(((Math.pow(g, 2) / 4) - h), (1.0/2)));
         j = (Math.cbrt(i));
         k = Math.acos(-1 * (g / (2*i)));
         l = ((j * -1));
         m = (Math.cos(k/3.0));
         n = ((Math.sqrt(3)) * Math.sin(k/3.0));
         p = ((b /(3.0*a)) * -1);
         
         root1 = ((2.0*j) * (Math.cos(k/3.0)) - (b/(3.0*a)));
         root2 = (l * (m + n) + p);
         root3 = (l * (m - n) + p);
         
         System.out.print("\rRoot 1: " + fmt.format(root1));
         System.out.print("\rRoot 2: " + fmt.format(root2));
         System.out.print("\rRoot 3: " + fmt.format(root3));
     }
     if (h > 0)
     {
         r = (-(g/2)) + (Math.sqrt(h));
         s = Math.cbrt(r);
         t = (-(g/2)) - (Math.sqrt(h));
         u = Math.cbrt(t);
         
         root1 = (s + u) - (b/(3.0*a));
         root2a = (-(s + u) / 2) - (b / (3.0 * a));
         root2b = ((s - u) * (Math.sqrt(3) / 2));
         root3a = (-(s + u) / 2) - (b / (3.0 * a));
         root3b = ((s - u) * (Math.sqrt(3) / 2));
         
         System.out.print("\rRoot 1: " + fmt.format(root1));
         System.out.print("\rRoot 2: " + fmt.format(root2a) + " + i*" + fmt.format(root2b));
         System.out.print("\rRoot 3: " + fmt.format(root3a) + " - i*" + fmt.format(root3b));
     }
   }
}