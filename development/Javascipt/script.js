// alert("hello are you there?")

var a = 30;

// test();

function test() {
  var a = 40;
  console.log(a);
}

function cal(num1, num2, oper) {
  switch (oper) {
    case "+":
      return num1 + num2;
    case "-":
      return num1 - num2;
    case "*":
      return num1 * num2;
    case "/":
      return num1 / num2;
    default:
      return "wrong operator";
  }
}

// console.log(cal(2, 3, "/"));

["Apple", "Grapes", "orange"].forEach((fruit, index) =>
  console.log(index + 1 + ". " + fruit)
);
