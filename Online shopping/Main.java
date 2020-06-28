#include<iostream>
using namespace std;
int main()
{
 int p1,p2,p3,d1,d2,d3,s1,s2,s3,t1,t2,t3;
  std::cin>>p1;
  std::cin>>d1;
  std::cin>>s1;
  std::cin>>p2;
  std::cin>>d2;
  std::cin>>s2;
  std::cin>>p3;
  std::cin>>d3;
  std::cin>>s3;
  t1=(p1-p1*d1/100)+s1;
  t2=(p2-p2*d2/100)+s2;
  t3=(p3-p3*d3/100)+s3;
  std::cout<<"In Flipkart Rs."<<t1<<"\n";
  std::cout<<"In Snapdeal Rs."<<t2<<"\n";
  std::cout<<"In Amazon Rs."<<t3<<"\n";
  if(t1<=t2)
  {
     if(t1<t3)
         std::cout<<"He will prefer Flipkart";
     else
         std::cout<<"He will prefer Amazon";
  }
  else 
  {
    if(t2<t3)
    std::cout<<"He will prefer Snapdeal";
    else 
    std::cout<<"He will prefer Amazon";
  }
  
  
  
}