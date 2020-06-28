#include<iostream>
using namespace std;
int main()
{
  char name[50];
  int i=0;
 std::cin.getline(name,50);
   while(name[i]!='\0'){
   i++;
   }
std::cout<<"The number of letters in the name is "<<i;  

}