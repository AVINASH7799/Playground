#include<iostream>
struct val{
int i,j;
}v1,v2;
int main()
{
  int n;
  std::cin>>n;
  std::cin>>v1.i;
  std::cin>>v1.j;
  std::cin>>v2.i;
  std::cin>>v2.j;
  switch(n){
    case 1:
        std::cout<<v1.i+v2.i<<v1.j+v2.j<<"i";
        break;
    case 2:
        std::cout<<v1.i-v2.i<<"+"<<v1.j-v2.j<<"i";
        break;
    case 3:
        std::cout<<(v1.i)*(v2.i)-(v1.j)*(v2.j)<<(v1.j)*(v2.i)+(v2.j)*(v1.i)<<"i";
         break;
    default:
      std::cout<<"Invalid choice";
  }
  
}
