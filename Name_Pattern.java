import java.io.*;
class Name_Pattern
{
    static String pattern[][]=new String[7][500];
    static String word="";
    static int column=0;
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
                Name_Pattern.a();
            }

            if(ch=='B'||ch=='b')
            {
                Name_Pattern.b();
            }

            if(ch=='C'||ch=='c')
            {
                Name_Pattern.c();
            }

            if(ch=='D'||ch=='d')
            {
                Name_Pattern.d();
            }

            if(ch=='E'||ch=='e')
            {
                Name_Pattern.e();
            }

            if(ch=='F'||ch=='f')
            {
                Name_Pattern.f();
            }

            if(ch=='G'||ch=='g')
            {
                Name_Pattern.g();
            }

            if(ch=='H'||ch=='h')
            {
                Name_Pattern.h();
            }

            if(ch=='I'||ch=='i')
            {
                Name_Pattern.i();
            }

            if(ch=='J'||ch=='j')
            {
                Name_Pattern.j();
            }

            if(ch=='K'||ch=='k')
            {
                Name_Pattern.k();
            }

            if(ch=='L'||ch=='l')
            {
                Name_Pattern.l();
            }

            if(ch=='M'||ch=='m')
            {
                Name_Pattern.m();
            }

            if(ch=='N'||ch=='n')
            {
                Name_Pattern.n();
            }

            if(ch=='O'||ch=='o')
            {
                Name_Pattern.o();
            }

            if(ch=='P'||ch=='p')
            {
                Name_Pattern.p();
            }

            if(ch=='Q'||ch=='q')
            {
                Name_Pattern.q();
            }

            if(ch=='R'||ch=='r')
            {
                Name_Pattern.r();
            }

            if(ch=='S'||ch=='s')
            {
                Name_Pattern.s();
            }

            if(ch=='T'||ch=='t')
            {
                Name_Pattern.t();
            }

            if(ch=='U'||ch=='u')
            {
                Name_Pattern.u();
            }

            if(ch=='V'||ch=='v')
            {
                Name_Pattern.v();
            }

            if(ch=='W'||ch=='w')
            {
                Name_Pattern.w();
            }

            if(ch=='X'||ch=='x')
            {
                Name_Pattern.x();
            }

            if(ch=='Y'||ch=='y')
            {
                Name_Pattern.y();
            }

            if(ch=='Z'||ch=='z')
            {
                Name_Pattern.z();
            }
            column++;
            for(int y=0;y<7;y++)
            {
                pattern[y][column]=" ";
            }
            column++;
        }
        for(int x=0;x<7;x++)
        {
            for(int y=0;y<500;y++)
            {
                if(pattern[x][y]!=null)
                {
                    System.out.print(pattern[x][y]);
                }
            }
            System.out.println();
        }
    }

    public static void a()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(x==1&&y>=2&&y<=4||(y==1||y==5)&&!(x==1)||x==3)
                {
                    word=word+"A ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;
            word="";
        }
    }

    public static void b()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(y==1||(x==1||x==3||x==5)&&y<=4||y==5&&!(x==1||x==3||x==5))
                {
                    word=word+"B ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;
            word="";
        }
    }

    public static void c()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if((x==1||x==5)&&!(y==1)||y==1&&!(x==1||x==5))
                {
                    word=word+"C ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;
            word="";
        }
    }

    public static void d()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(y==2||(x==1||x==5)&&!(y==5)||y==5&&!(x==1||x==5))
                {
                    word=word+"D ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;
            word="";
        }
    }

    public static void e()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(x==1||x==5||y==1||x==3&&y<=3)
                {
                    word=word+"E ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;
            word="";
        }
    }

    public static void f()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(y==1||x==1||x==3&&y<=3)
                {
                    word=word+"F ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;
            word="";
        }
    }

    public static void g()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if((x==1||x==5)&&y!=1||x==3&&y>=4||y==5&&x!=2||y==1&&!(x==1||x==5))
                {
                    word=word+"G ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;
            word="";
        }
    }

    public static void h()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(x==3||y==1||y==5)
                {
                    word=word+"H ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;
            word="";
        }
    }

    public static void i()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if((x==1||x==5)&&!(y==1||y==5)||y==3)
                {
                    word=word+"I ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }

    public static void j()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(y==4||x==5&&!(y==1||y==5)||y==2&&x>=4)
                {
                    word=word+"J ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }

    public static void k()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(y==1||y==2&&x==3||y==3&&(x==2||x==4)||y==4&&(x==1||x==5))
                {
                    word=word+"K ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }

    public static void l()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(y==1||x==5&&y<=4)
                {
                    word=word+"L ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }

    public static void m()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(y==1||y==5||x==y&&x<=3||x+y==6&&x<=3)
                {
                    word=word+"M ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }

    public static void n()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(y==1||y==5||x==y)
                {
                    word=word+"N ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }

    public static void o()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if((x==1||x==5)&&!(y==1||y==5)||(y==1||y==5)&&!(x==1||x==5))
                {
                    word=word+"O ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }

    public static void p()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(y==1||(x==1||x==3)&&y<=4||x==2&&y==5)
                {
                    word=word+"P ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }

    public static void q()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if((x==1||x==4)&&!(y==1||y==5)||(y==1||y==5)&&!(x==1||x==4||x==5)||x==3&&y==3||x==5&&y==5)
                {
                    word=word+"Q ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }

    public static void r()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(y==1||(x==1||x==3)&&y!=5||x==y&&x>=4||x==2&&y==5)
                {
                    word=word+"R ";
                }
                else
                {
                    System.out.print("  ");
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }

    public static void s()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(x==1&&y!=1||x==5&&y!=5||x==3&&!(y==1||y==5)||x==2&&y==1||y==5&&x==4)
                {
                    word=word+"S ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }

    public static void t()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(x==1||y==3)
                {
                    word=word+"T ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }

    public static void u()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if((y==1||y==5)&&!(x==5)||x==5&&!(y==1||y==5))
                {
                    word=word+"U ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }

    public static void v()
    {
        for(int x=1;x<=4;x++)
        {
            for(int y=1;y<=7;y++)
            {
                if(x==y||x+y==8)
                {
                    word=word+"V ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }

    public static void w()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(y==1||y==5||(x==y||x+y==6)&&x>=3)
                {
                    word=word+"W ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }

    public static void x()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(x==y||x+y==6)
                {
                    word=word+"X ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }

    public static void y()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if((x==y||x+y==6)&&x<=3||y==3&&x>=3)
                {
                    word=word+"Y ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }

    public static void z()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(x==1||x==5||x+y==6)
                {
                    word=word+"Z ";
                }
                else
                {
                    word=word+"  ";
                }
            }
            pattern[x][column]=word;            
            word="";
        }
    }
}