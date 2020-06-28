#include<iostream>
using namespace std;
int main()
{
  int x,a;
  std::cin>>x;
  a=x%4;
  switch(a)
  {
    case 0:
       std::cout<<x<<" is a leap year";
    break;
    default:
       std::cout<<x<<" is not a leap year";
  } 
}