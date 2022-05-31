const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", (answer) => {
  if (answer === "0 0") {
    rl.close();
    return;
  }
  let s = answer.split(" ");
  let typed_number = s[1];
  let missing_letter = s[0];
  let result = "";
  let dont_accept_zero = true;
  for (let i = 0; i < typed_number.length; i++) {
    if (dont_accept_zero) {
      if (typed_number[i] !== "0" && typed_number[i] !== missing_letter) {
        result += typed_number[i];
        dont_accept_zero = false;
      }
    } else {
      if (typed_number[i] !== missing_letter) {
        result += typed_number[i];
      }
    }
  }
  if (result === "") result = "0";
  console.log(result);
});
