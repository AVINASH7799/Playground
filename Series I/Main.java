#include<iostream>
#include<iomanip>
int main()
{
  float n,f=0.5,i=0;

  std::cin>>n;
 do 
  {
    std::cout<<f<<" ";
    f=f*3.0;
    i++;
  }while(i<n);
 
}  