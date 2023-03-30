"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var readline = require("readline");
var Car = /** @class */ (function () {
    function Car(make, model, year, speed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }
    Car.prototype.accelerate = function () {
        this.speed += 10;
        console.log("The ".concat(this.year, " ").concat(this.make, " ").concat(this.model, " is now going ").concat(this.speed, " mph."));
    };
    Car.prototype.decelerate = function () {
        if (this.speed >= 10) {
            this.speed -= 10;
            console.log("The ".concat(this.year, " ").concat(this.make, " ").concat(this.model, " is now going ").concat(this.speed, " mph."));
        }
        else {
            console.log("The ".concat(this.year, " ").concat(this.make, " ").concat(this.model, " is already stopped."));
        }
    };
    Car.prototype.stop = function () {
        this.speed = 0;
        console.log("The ".concat(this.year, " ").concat(this.make, " ").concat(this.model, " has stopped."));
    };
    return Car;
}());
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
var car = new Car('Honda', 'Civic', 2022, 0);
rl.question('Enter a command (accelerate, decelerate, stop): ', function (command) {
    switch (command) {
        case 'accelerate':
            car.accelerate();
            rl.close();
            break;
        case 'decelerate':
            car.decelerate();
            rl.close();
            break;
        case 'stop':
            car.stop();
            rl.close();
            break;
        default:
            console.log('Invalid command.');
            rl.close();
            break;
    }
});
