#include<iostream>
using namespace std;
int main()
{
  int r,c,a,x,y;
  std::cin>>r;
  std::cin>>c;
  std::cin>>a;
  x=(r*c)-2*c;
  y=(r*c)-c;
  if(a>r&&a<=r+c)
    std::cout<<"It is a mango tree";
  else if((a>x)&&(a<=y))
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
    
}