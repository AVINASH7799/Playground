#include<iostream>
int main()
{
  int i,n,t=0;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    if(n%i==0)
      t++;
  } 
  if(t==2)
    std::cout<<"Eligible";
  else
    std::cout<<"Not eligible";
}  