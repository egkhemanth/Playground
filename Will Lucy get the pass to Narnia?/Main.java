#include<iostream>
int main(){
int a,b,c;
  std::cout<<"Enter first number :"<<" Enter second number : "<<"Menu"<<"\n"<<"1.Addition"<<"\n"<<"2.Subtraction"<<"\n3.Multiplication"<<"\n"<<"4.Division"<<"\n"<<"5.Remainder";
  std::cin>>a;
  std::cin>>b;
  std::cin>>c;
  switch( c){
  case 1:
      std::cout<<"\n"<<a+b;
      break;
    case 2:
      std::cout<<"\n"<<a-b;
      break;
    case 3:
      std::cout<<"\n"<<a*b;
      break;
      case 4:
      std::cout<<"\n"<<a/b;
      break;
      case 5:
      std::cout<<"\n"<<a%b;
      break;
    default:
      std::cout<<"\n"<<"Invalid operation";
  }}
  
