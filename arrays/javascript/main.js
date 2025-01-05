// Create an array with mixed data types
let myArray = [10, "hello", true, { name: "John" }, null, undefined];

// Modify an element
myArray[1] = "world";

// Add an element to the end
myArray.push(3.14);

// Remove an element from the end
myArray.pop();

// Add an element to the beginning
myArray.unshift("start");

// Remove an element from the beginning
myArray.shift();

// Access an element (including undefined)
console.log(myArray[5]); // Output: undefined

// Demonstrate dynamic resizing
for (let i = 0; i < 10; i++) {
  myArray.push(i * 2);
}

console.log(myArray);
// Output: [10, "world", true, { name: "John" }, null, undefined, 0, 2, 4, 6, 8, 10, 12, 14, 16, 18]
