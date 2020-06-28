#include<iostream>
#include<cmath>
using namespace std;
int main()
{
 
  int x1,x,y1,t;
  float y;
  std::cin>>x1;
  std::cin>>y1;
  t=(x1-3)*(x1-3)+(y1-4)*(y1-4);
  y=sqrt(t);
  x=int(y);
  std::cout<<x;



}