#include<iostream>
using namespace std;
int main()
{
  int u, c;
  std::cin>>u;
   if(u<=200)
   {
     c=u*0.5;
    std::cout<<"Rs."<<c;
   }
     else if(u<=400)
     {
       c=u*0.65+100;
          std::cout<<"Rs."<<c;
     }
       else if(u<=600)
       {
         c=u*0.80+200;
      std::cout<<"Rs."<<c;
       }
         else 
         {
           c=u*1.25+425;
          std::cout<<"Rs."<<c;
         }  

     
}