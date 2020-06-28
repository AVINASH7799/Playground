#include<iostream>
int main()
{
  int x,i,n,j;
  std::cin>>n;
  x=1;
  for(i=1;i<=n;i++)
  {
    for(j=0;j<i;j++)
    {
      std::cout<<x;
      if(j<i-1)
        std::cout<<"*";
    }
    std::cout<<"\n";
    x++;
  } 
  x--;
  for(i=n;i>0;i--)
  {
    for(j=0;j<i;j++)
    {
      std::cout<<x;
      if(j<i-1)
        std::cout<<"*";
      
    }
    std::cout<<"\n";
    x--;
  } 
}  