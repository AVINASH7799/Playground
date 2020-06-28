#include <cstring>
#include <iostream>
int main()
{
   char str[100];
  int i=0,c=0;
  std::cin.getline(str,100);
  while(str[i])
  {
     if(str[i]==' ')
       c++;
    i++;
  }
  if(c>9)
    std::cout<<"Caption not eligible for the contest";
  else
    std::cout<<"Caption eligible for the contest";
} 