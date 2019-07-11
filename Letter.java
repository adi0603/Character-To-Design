class Letter
{
    public static void a()
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=5;y++)
            {
                if(x==1&&y>=2&&y<=4||(y==1||y==5)&&!(x==1)||x==3)
                {
                    System.out.print("A ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("B ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("C ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("D ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("E ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("F ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("G ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("H ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("I ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("J ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("K ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("L ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("M ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("N ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("O ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("P ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("Q ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("R ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("S ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("T ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("U ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("V ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("W ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("X ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("Y ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
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
                    System.out.print("Z ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
