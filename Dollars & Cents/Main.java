#include<iostream>
using namespace std;
int main()
{
  int x1,y1,x2,y2,doll,cent;
  std::cin>>x1;
  std::cin>>y1;
  std::cin>>x2;
  std::cin>>y2;
  doll=x1+x2;
  cent=y1+y2;
  if(cent>100)
  {
    doll=doll+1;
    cent=cent-100;
  }
  std::cout<<doll<<"\n";
  std::cout<<cent;
}