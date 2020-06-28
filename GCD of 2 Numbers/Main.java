#include<iostream>
int GCD(int a,int b)
{
if (b != 0)
       return GCD(b, a % b);
    else 
       return a;
}
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<GCD(a,b);
  
}