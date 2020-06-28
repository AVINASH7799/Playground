#include<iostream>
using namespace std;
int main()
{
 int x,y;
  std::cin>>x;
  std::cin>>y;
  if (x>y)
  {
    y=y+100;
    std::cout<<y-x;
  }
  else
    std::cout<<y-x;
}