function Student(name, age, grade, subjects) {
  this.name = name;
  this.age = age;
  this.grade = grade;
  this.subjects = subjects;

  this.printInfo = function () {
    // console.log("---------------------------------");
    console.log("name -> " + this.name);
    console.log("age -> " + this.age);
    console.log("grade -> " +this.grade);
    console.log("subjects -> " + this.subjects.join(","));
    console.log("---------------------------------");
  };
}

Student("tusahr", 32, "23", [123, 343, 12]);
console.log(Student.name);

let s1 = new Student("sagar", 40, "A", ["math", "cg", "programming"]);
let s2 = new Student("saam", 23, "B", ["math", "cg", "TREE"]);

s1.printInfo();
s2.printInfo();

function Bank(accountNumber, accountHolder, balance) {
  this.accountHolder = accountHolder;
  this.accountNumber = accountNumber;
  this.balance = balance;

  this.showDetail = function () {
    console.log("-----------------------");
    console.log("Account Number: ", accountNumber);
    console.log("Account holder: ", accountHolder);
    console.log("Balance: ", balance);
    console.log("-----------------------");
  };

  this.deposit = function (depositBalance) {
    console.log("-----------------------");
    balance += depositBalance;
    console.log("current balance: ", balance);
    console.log("-----------------------");
  };

  this.withdraw = function (withdrawBalance) {
    if (balance < withdrawBalance) {
      console.log("-----------------------");
      console.log("Insufficient balance");
      console.log("-----------------------");
      return;
    }
    balance -= withdrawBalance;
    console.log("-----------------------");
    console.log("current balance: ", balance);
    console.log("-----------------------");
  };
}

let maha = new Bank("1234", "tusahr", 234523455234);
let sbi = new Bank("1234332", "rag", 23);

maha.showDetail();
maha.withdraw(34);
