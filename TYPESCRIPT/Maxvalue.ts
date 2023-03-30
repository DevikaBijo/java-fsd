function findMax(numbers: number[]): number {
    let max = numbers[0];
    for (let i = 1; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }
    return max;
  }
const numbers = [1, 2, 3, 4, 5];
const max = findMax(numbers);
console.log(max); // 5