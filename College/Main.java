#include<iostream>
using namespace std;
struct College { 
  char name[100]; 
  char city[100];
  int establishmentYear; 
  float passPercentage; 
};
int main()
{
 int n,i;
  
  std::cout<<"Enter the number of colleges\n";
  std::cin>>n;
  College c[n];
  for(i=0;i<n;i++)
  {
    std::cout<<"Enter the details of college "<<i+1<<"\n";
    std::cout<<"Enter name\n";
    std::cin>>c[i].name;
    std::cout<<"Enter city\n";
    std::cin>>c[i].city;
    std::cout<<"Enter year of establishment\n";
    std::cin>>c[i].establishmentYear;
    std::cout<<"Enter pass percentage\n";
    std::cin>>c[i].passPercentage;
    
  }
  std::cout<<"Details of colleges\n";
   for(i=0;i<n;i++){
     std::cout<<"College:"<<i+1<<"\n";
     std::cout<<"Name:"<<c[i].name<<"\n";
     std::cout<<"City:"<<c[i].city<<"\n";
     std::cout<<"Year of establishment:"<<c[i].establishmentYear<<"\n";
    
     std::cout<<"Pass percentage:"<<c[i].passPercentage<<"\n";
   }
}