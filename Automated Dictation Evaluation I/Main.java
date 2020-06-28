#include<iostream>
using namespace std;
int main()
{
  char s1[50],s2[50];
  std::cin.getline(s1,50);
  std::cin.getline(s2,50);
  int i=0,j=0;
  while(s1[i]){
    if(s1[i]!=s2[i]){
      j=1;
    break;
    }
    else 
      i++;
  }
  if(j==1)
    std::cout<<"It is wrong";
  else
    std::cout<<"It is correct";
  }