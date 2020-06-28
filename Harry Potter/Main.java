#include<iostream>
using namespace std;
int main()
{
 int x,y,a;
  std::cin>>x;
  y=x%10;
  a=x/10;
  a=a/10;
  a=a/10;
  
  std::cout<<y+a;
  
}