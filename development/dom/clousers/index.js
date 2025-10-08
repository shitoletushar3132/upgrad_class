function counter() {
  let count = 1;

  return {
    increment: function () {
      count++;
      return "ID" + count;
    },
    decrement: function () {
      count--;
      return "ID" + count;
    },
  };
}

// const count = counter();
// console.log(count.increment());
// console.log(count.increment());
// console.log(count.decrement());

function greet() {
  setTimeout(() => {
    console.log("hello");
  }, 3000);
}

greet();
