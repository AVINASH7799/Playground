#include<iostream>
using namespace std;
struct employee{
  char name[20];
  int empid;
  int age;
  char des[20];
  int salary;
}e1;
int main()
{
  std::cout<<"Enter name:\n";
  std::cin>>e1.name;
  std::cout<<"Enter ID:\n";
  std::cin>>e1.empid;
  std::cout<<"Enter age:\n";
  std::cin>>e1.age;
  std::cout<<"Enter designation:\n";
  std::cin>>e1.des;
  std::cout<<"Enter Salary:\n";
  std::cin>>e1.salary;
  std::cout<<"Employee Details\n";

std::cout<<"Name of the Employee : "<<e1.name<<"\n"; 

std::cout<<"ID of the Employee : "<<e1.empid<<"\n";

std::cout<<"Age of the Employee : "<<e1.age<<"\n";

std::cout<<"Designation of the Employee : "<<e1.des<<"\n"; 

std::cout<<"Salary of the Employee : "<<e1.salary<<"\n";
}  