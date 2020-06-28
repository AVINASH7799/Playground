#include<iostream>
int main()
{
  int n,i,s=6;
  std::cin>>n;
  for(i=1;i<n+1;i++)
  {
    std::cout<<s<<" ";
    s=s+i*5;
  }
} 