#include<iostream>
using namespace std;
int main()
{
  int o=0,e=0,n,rem=0;
  std::cin>>n;
  do{
     rem=n%10;
    if(rem%2==0)
      e=e+rem;
    else
      o=o+rem;
    n=n/10;
  }while(n>0);
  if(o==e)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}