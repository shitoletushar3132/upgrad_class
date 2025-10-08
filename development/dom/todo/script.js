let inputBox = document.getElementById("todoInput");
let addBtn = document.getElementById("addTodoButton");
let todoList = document.getElementById("todos");

addBtn.addEventListener("click", (e) => {
  e.preventDefault();
  let todoText = inputBox.value;

  if (todoText.length == 0) {
    alert("Enter valid Task");
    return;
  }

  let newListItem = document.createElement("li");

  // Fix: Combine checkbox and text properly
  newListItem.innerHTML = `
    <input type="checkbox">
    <span>${todoText}</span>
    <button class="deleteBtn">Delete</button>
  `;

  todoList.appendChild(newListItem);
  inputBox.value = "";
});


todoList.addEventListener("click",function(e){
    if(e.target.classList.contains('deleteBtn')){
        
    }
})

