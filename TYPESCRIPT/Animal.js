var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Animal = /** @class */ (function () {
    function Animal(name, age, sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }
    Animal.prototype.makeSound = function () {
        console.log(this.sound);
    };
    return Animal;
}());
var Mammal = /** @class */ (function (_super) {
    __extends(Mammal, _super);
    function Mammal(name, age, sound, furColor) {
        var _this = _super.call(this, name, age, sound) || this;
        _this.furColor = furColor;
        return _this;
    }
    Mammal.prototype.giveBirth = function () {
        console.log("".concat(this.name, " is giving birth!"));
    };
    return Mammal;
}(Animal));
var Bird = /** @class */ (function (_super) {
    __extends(Bird, _super);
    function Bird(name, age, sound, wingSpan) {
        var _this = _super.call(this, name, age, sound) || this;
        _this.wingSpan = wingSpan;
        return _this;
    }
    Bird.prototype.fly = function () {
        console.log("".concat(this.name, " is flying!"));
    };
    return Bird;
}(Animal));
var Fish = /** @class */ (function (_super) {
    __extends(Fish, _super);
    function Fish(name, age, sound, waterType) {
        var _this = _super.call(this, name, age, sound) || this;
        _this.waterType = waterType;
        return _this;
    }
    Fish.prototype.swim = function () {
        console.log("".concat(this.name, " is swimming!"));
    };
    return Fish;
}(Animal));
var dog = new Mammal("Fido", 3, "Woof", "Brown");
var parrot = new Bird("Polly", 2, "Squawk", 10);
var salmon = new Fish("Sam", 1, "Blub", "Freshwater");
dog.makeSound(); // Woof
dog.giveBirth(); // Fido is giving birth!
parrot.makeSound(); // Squawk
parrot.fly(); // Polly is flying!
salmon.makeSound(); // Blub
salmon.swim(); // Sam is swimming!
