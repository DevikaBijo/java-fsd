"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var readline = require("readline");
function add(a, b) {
    return a + b;
}
function sub(a, b) {
    return a - b;
}
function mul(a, b) {
    return a * b;
}
function divv(a, b) {
    return a / b;
}
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
rl.question("Enter first number: ", function (a) {
    rl.question("Enter second number: ", function (b) {
        rl.question("Enter operator (+, -, *, /): ", function (op) {
            var num1 = parseInt(a);
            var num2 = parseInt(b);
            var result;
            switch (op) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = sub(num1, num2);
                    break;
                case '*':
                    result = mul(num1, num2);
                    break;
                case '/':
                    result = divv(num1, num2);
                    break;
                default:
                    console.log("Invalid operator");
                    rl.close();
                    return;
            }
            console.log("Result: ".concat(result));
            rl.close();
        });
    });
});
