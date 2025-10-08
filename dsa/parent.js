const { fork } = require("child_process");
const child = fork("./index.js");

child.on("message", (result) => {
  console.log("Fibonacci Result:", result);
});

child.send({ number: 45 }); // Offload heavy computation

let arr = Array(1e8)
  .fill(0)
  .map((_, i) => i);
arr.sort((a, b) => b - a); // Sorting 100 million numbers

console.log("Main thread is free to do other tasks!");
