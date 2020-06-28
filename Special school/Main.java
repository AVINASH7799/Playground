#include<iostream>
using namespace std;
int main()
{
 char s1[50] ,s2[50];
  std::cin>>s1;
  std::cin>>s2;
  int i=0,c=0,j=0;
  while(s1[i]!='\0'){
    c++;
    i++;
  } 
  
  for(i=0;i<c;i++)
  {
    if(s1[i]!=s2[c-i-1]){
       j=1;
       break;
    }
  } 
 if(j==1)
   std::cout<<"It is wrong";
  else
    std::cout<<"It is correct";
}