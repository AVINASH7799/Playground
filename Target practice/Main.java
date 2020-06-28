#include<iostream>
using namespace std;
int main()
{
  int score,sum=0,i=0,t;
  std::cin>>score;
  do
  {
    std::cin>>t;
    sum=sum+t;
    i++;
  }while(sum<score);
  std::cout<<"The number of turns is "<<i;
     
}