class Animal {
    name: string;
    age: number;
    sound: string;
  
    constructor(name: string, age: number, sound: string) {
      this.name = name;
      this.age = age;
      this.sound = sound;
    }
  
    makeSound(): void {
      console.log(this.sound);
    }
  }
  
  class Mammal extends Animal {
    furColor: string;
  
    constructor(name: string, age: number, sound: string, furColor: string) {
      super(name, age, sound);
      this.furColor = furColor;
    }
  
    giveBirth(): void {
      console.log(`${this.name} is giving birth!`);
    }
  }
  
  class Bird extends Animal {
    wingSpan: number;
  
    constructor(name: string, age: number, sound: string, wingSpan: number) {
      super(name, age, sound);
      this.wingSpan = wingSpan;
    }
  
    fly(): void {
      console.log(`${this.name} is flying!`);
    }
  }
  
  class Fish extends Animal {
    waterType: string;
  
    constructor(name: string, age: number, sound: string, waterType: string) {
      super(name, age, sound);
      this.waterType = waterType;
    }
  
    swim(): void {
      console.log(`${this.name} is swimming!`);
    }
}
  const dog = new Mammal("Fido", 3, "Woof", "Brown");
  const parrot = new Bird("Polly", 2, "Squawk", 10);
  const salmon = new Fish("Sam", 1, "Blub", "Freshwater");
  
  dog.makeSound(); // Woof
  dog.giveBirth(); // Fido is giving birth!
  
  parrot.makeSound(); // Squawk
  parrot.fly(); // Polly is flying!
  
  salmon.makeSound(); // Blub
  salmon.swim(); // Sam is swimming!
  
