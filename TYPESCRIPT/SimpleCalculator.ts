
    
  import * as readline from "readline";



  function add(a: number, b: number): number{
  
   return a+b;
  }
  function sub(a: number, b: number): number{
  
   return a-b;
  
  }
  function mul(a: number, b: number): number{
  
   return a*b;
  
  }
  function divv(a: number, b: number): number{
  
   return a/b;
  
  }
   const rl = readline.createInterface({
  
   input: process.stdin,
  
   output: process.stdout
  
  });
  rl.question("Enter first number: ", (a: string) => {
  
  rl.question("Enter second number: ", (b: string) => {
  
  rl.question("Enter operator (+, -, *, /): ", (op: string) => {
  
 const num1 = parseInt(a);
  
 const num2 = parseInt(b);
  
  let result: number;
  
  switch(op){
  
    case '+' : result = add(num1, num2);
                break;
    
    case '-' : result = sub(num1, num2);
                break;
    
    case '*' : result = mul(num1, num2);
                break;
    
    case '/' : result = divv(num1, num2);
                break;
    
    default : console.log("Invalid operator");
  
   rl.close();
  
 return;
  
 }
  console.log(`Result: ${result}`);
  
   rl.close();
  
  });
  
   });
  
  });