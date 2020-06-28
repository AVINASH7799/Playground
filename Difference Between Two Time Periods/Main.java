#include<iostream>
using namespace std;
struct time{
int h,m,s;
}t1,t2;
int main()
{
    std::cin>>t1.h>>t1.m>>t1.s;
    std::cin>>t2.h>>t2.m>>t2.s;
    if(t1.s<t2.s){
      t1.s+=60;
      t1.m-=1;
    }
  if(t1.m<t2.m)
  {
    t1.m+=60;
    t1.h-=1;}
  std::cout<<t1.h-t2.h<<":"<<t1.m-t2.m<<":"<<t1.s-t2.s;

}