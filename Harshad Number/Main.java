#include<iostream>
using namespace std;
int main()
{
  int i,n,temp,sum=0;
  std::cin>>n;
  temp=n;
  while(n>0){
   sum=sum+(n%10);
    n=n/10;
  }
  if(temp%sum==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
  
}