import java.io.*;
class Letter
{

    public static void main(String args[])throws IOException
    {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("ENTER YOUR NAME");
        
        String n=br.readLine();
        
        int l=n.length();
        
        for(int x=0;x<l;x++)
        {
            
            char ch=n.charAt(x);
            
            if(ch=='A'||ch=='a')
            {
                
                Letter.a();
                System.out.println();
                
            }
            
            if(ch=='B'||ch=='b')
            {
                
                Letter.b();
                System.out.println();
                
            }
            
            if(ch=='C'||ch=='c')
            {
                
                Letter.c();
                System.out.println();
            
            }
            
            if(ch=='D'||ch=='d')
            {
                Letter.d();
                System.out.println();
            }
            
            if(ch=='E'||ch=='e')
            {
                
                Letter.e();
                System.out.println();
                
            }
            
            if(ch=='F'||ch=='f')
            {
                
                Letter.f();
                System.out.println();
                
            }
            
            if(ch=='G'||ch=='g')
            {
                
                Letter.g();
                System.out.println();
                
            }
            
            if(ch=='H'||ch=='h')
            {
                
                Letter.h();
                System.out.println();
                
            }
            
            if(ch=='I'||ch=='i')
            {
                
                Letter.i();
                System.out.println();
                
            }
            
            if(ch=='J'||ch=='j')
            {
                
                Letter.j();
                System.out.println();
                
            }
            
            if(ch=='K'||ch=='k')
            {
                
                Letter.k();
                System.out.println();
                
            }
            
            if(ch=='L'||ch=='l')
            {
                
                Letter.l();
                System.out.println();
                
            }
            
            if(ch=='M'||ch=='m')
            {
                
                Letter.m();
                System.out.println();
                
            }
            
            if(ch=='N'||ch=='n')
            {
                
                Letter.n();
                System.out.println();
                
            }
            
            if(ch=='O'||ch=='o')
            {

                Letter.o();
                System.out.println();
                
            }
            
            if(ch=='P'||ch=='p')
            {
                
                Letter.p();
                System.out.println();
                
            }
            
            if(ch=='Q'||ch=='q')
            {
                
                Letter.q();
                System.out.println();
                
            }
            
            if(ch=='R'||ch=='r')
            {
                
                Letter.r();
                System.out.println();
                
            }
            
            if(ch=='S'||ch=='s')
            {
                
                Letter.s();
                System.out.println();
                
            }
            
            if(ch=='T'||ch=='t')
            {
                
                Letter.t();
                System.out.println();
                
            }
            
            if(ch=='U'||ch=='u')
            {
                
                Letter.u();
                System.out.println();
                
            }
            
            if(ch=='V'||ch=='v')
            {
                
                Letter.v();
                System.out.println();
                
            }
            
            if(ch=='W'||ch=='w')
            {
                
                Letter.w();
                System.out.println();
                
            }
            
            if(ch=='X'||ch=='x')
            {
                
                Letter.x();
                System.out.println();
                
            }
            
            if(ch=='Y'||ch=='y')
            {
                
                Letter.y();
                System.out.println();
                
            }
            
            if(ch=='Z'||ch=='z')
            {
                
                Letter.z();
                System.out.println();
                
            }
            
        }
        
    }
}
