// const heading1 = document.getElementById("heading1");
// heading1.addEventListener("click", () => {
//   heading1.style.color = "pink";
//   heading1.innerText = "How are you ?";
// });

// let i = 0;
// setInterval(() => {
//   heading1.innerText = "counter: " + i;
//   i++;
// }, 500);

// // const ul = document.createElement("ul");
// // ul.innerHTML(<li>hello</li>);
// // ul.appendChild;
// // document.body.appendChild(ul);

// document
//   .getElementById("b")
//   .addEventListener(
//     "click",
//     () => (document.getElementById("p").innerText = "hello this js ")
//   );

let inputBox = document.getElementById("input");
let submitBtn = document.getElementById("submit");

inputBox.addEventListener("input", (e) => {
  let innerText = inputBox.value;

  if (innerText.length < 5) {
    inputBox.style.borderColor = "red";
    document.getElementById("error").innerText = "enter valid";
  } else {
    inputBox.style.borderColor = "initial";
    document.getElementById("error").innerText = "";
    inputBox.style.border = "2px solid green";
  }
});

submitBtn.addEventListener("click", (e) => {
  e.preventDefault(); // Prevent form submission
  let inputText = inputBox.value;

  if (inputText.length < 1) {
    inputBox.style.borderColor = "red";
    document.getElementById("error").innerText = "Enter your username";
  } else {
    inputBox.style.borderColor = "initial";
    document.getElementById("error").innerText = "";
    inputBox.style.border = "2px solid green";
  }
});
