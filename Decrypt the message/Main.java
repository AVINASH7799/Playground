#include<iostream>
int main()
{
  int x,y,s,sum=0,i;
   std::cin>>x;
   std::cin>>y;
   s=x+y;
  for(i=1;i<s;i++)
  {
   if(s%i==0)
     sum=sum+i;
  }
  if(sum==s)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}
  
  