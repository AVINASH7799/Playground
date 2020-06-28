#include <iostream>
#include <string>
using namespace std;
int main()
{
char str[100], rev[100];     
int count , end, i;    
  std::cin.getline(str,100);
  while (str[count]) 
        count++; 
  for(i=count-1;i>=0;i--)
    std::cout<<str[i];
}