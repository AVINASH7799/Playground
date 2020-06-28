#include<iostream>
int main()
{
  int x,y,t,a;
  std::cout<<"Enter first number : ";
  std::cin>>x;
  std::cout<<"Enter second number : ";
  std::cin>>y;
  std::cout<<"Menu\n";
  std::cout<<"1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Remainder \n";
  std::cin>>a;
  switch(a)
  {
    case 1:
      t=x+y; 
      std::cout<<t;
      break;
    case 2:
      t=x-y; 
      std::cout<<t;
       break;
    case 3:
      t=x*y;
       std::cout<<t;
       break;
    case 4:
      t=x/y;
       std::cout<<t;
       break;
    case 5:
      t=x%y;
       std::cout<<t;
       break;
    default:
       std::cout<<"Invalid operation";
    
  }          
} 