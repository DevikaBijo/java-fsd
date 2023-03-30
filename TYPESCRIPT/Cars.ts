import * as readline from 'readline';

class Car {
  make: string;
  model: string;
  year: number;
  speed: number;

  constructor(make: string, model: string, year: number, speed: number) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.speed = speed;
  }

  accelerate() {
    this.speed += 10;
    console.log(`The ${this.year} ${this.make} ${this.model} is now going ${this.speed} mph.`);
  }

  decelerate() {
    if (this.speed >= 10) {
      this.speed -= 10;
      console.log(`The ${this.year} ${this.make} ${this.model} is now going ${this.speed} mph.`);
    } else {
      console.log(`The ${this.year} ${this.make} ${this.model} is already stopped.`);
    }
  }

  stop() {
    this.speed = 0;
    console.log(`The ${this.year} ${this.make} ${this.model} has stopped.`);
  }
}

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const car = new Car('Honda', 'Civic', 2022, 0);

rl.question('Enter a command (accelerate, decelerate, stop): ', (command: string) => {
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
