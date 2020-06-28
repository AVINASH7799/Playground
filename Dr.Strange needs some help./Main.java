#include<iostream>
#include<cmath>
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  if(pow(b,a)>c)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
} 