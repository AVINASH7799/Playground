#include<iostream>
using namespace std;
int main()
{
 int x,y;
  std::cin>>x;
  std::cin>>y;
  if(x>y/2)
    std::cout<<"circle cannot be inside a square";
  else
    std::cout<<"circle can be inside a square";;
}