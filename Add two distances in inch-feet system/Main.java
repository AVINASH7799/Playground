#include<iostream>
using namespace std;
struct feet{ int i1;
            float f1;
           }t1,t2;
int main()
{
  int x1;
  float y1;
  std::cin>>t1.i1;
  std::cin>>t1.f1;
  std::cin>>t2.i1;
  std::cin>>t2.f1;
  x1=t1.i1+t2.i1;;
  y1=t1.f1+t2.f1;
  if(y1>12.0){
    y1-=12.0;
    x1+=1;}
  std::cout<<x1<<"\'-"<<y1<<"\"";
}