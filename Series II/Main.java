#include<iostream>
int main()
{
 int n,i=0,s=11;
  std::cin>>n;
  do
  {
    std::cout<<s*s<<" ";
    s=s+4;
    i++;
  }while(i<n);
} 