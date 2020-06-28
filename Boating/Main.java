#include<iostream>
using namespace std;
int main()
{
  int w,x,y,t;
  std::cin>>w;
  std::cin>>x;
  std::cin>>y;
  x=75*x;
  y=30*y;
  t=w-(x+y);
  if (t>0)
        std::cout<<"Boat is stable";
  else if (t==0)
    std::cout<<"Boat will drow";
  else 
    std::cout<<"Boat will drow";
  
}