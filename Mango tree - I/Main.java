#include<iostream>
using namespace std;
int main()
{
  int r,c,a;
  std::cin>>r;
  std::cin>>c;
  std::cin>>a;
  
  
  if(a<=c)
    std::cout<<"Yes";
  else if(c%a==0)
    std::cout<<"Yes";
  else if(((2*c)+1)%a==0)
    std::cout<<"Yes";
  else
    std::cout<<"No";
    
}